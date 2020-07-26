package colorstepskin

import com.badlogic.gdx.graphics.Color

class ColorBoxSun {
    private val c:Array<Color> = Array(101){ Color() }
    /**return Color depend of incoming integer hsv h - hue component from 0..100. Every next 10 is gray 0 10 20 100
     * @param hue hsv h value from 0..100*/
    fun color(hue:Int): Color {return if (hue in 0..100) c[hue] else c[100]}
    /**hsv h hueStep*/
    private val hs = arrayOf(
            0f,24f,60f,90f,120f,150f,180f,210f,241f,273f,300f,331f,
            360f
    )
    /**hsv s colorSaturation*/
    private val cs = arrayOf(
            38/100f,42/100f,34/100f,30/100f,30/100f,30/100f,30/100f,30/100f,30/100f,40/100f,40/100f,46/100f,
            38/100f
    )
    /**hsv v colorValue*/
    private val cv = arrayOf(
            96/100f,100/100f,83/100f,88/100f,88/100f,88/100f,85/100f,100/100f,100/100f,100/100f,90/100f,94/100f,
            96/100f //first element duplication for looping
    )
    
    private fun grayHsv(hue:Int):FloatArray{
        return arrayOf(0.0f, 0.0f, 0.7f+hue/100.0f*0.3f).toFloatArray()
    }
    
    private fun hueRange(hue100:Int):Int{
        val hue = hue100*3.6f
        return when{
            hue < hs[1] -> 1
            hue < hs[2] -> 2
            hue < hs[3] -> 3
            hue < hs[4] -> 4
            hue < hs[5] -> 5
            hue < hs[6] -> 6
            hue < hs[7] -> 7
            hue < hs[8] -> 8
            hue < hs[9] -> 9
            hue < hs[10] -> 10
            hue < hs[11] -> 11
            else -> 12
        }
    }
    private fun colorHsv(hue100:Int):FloatArray{
        /**rangeNumber 1..12*/
        val rn = hueRange(hue100)
        val hue = hue100*3.6f
        val dHueStep = hs[rn] - hs[rn-1]
        val dHue = hue - hs[rn-1]
        val d = dHue / dHueStep
        /**hsv s*/
        val ds = cs[rn]-cs[rn-1]
        val s = cs[rn-1] + ds * (if (ds<0)d*d else 1-d*d)
        /**hsv v*/
        val dv = cv[rn]-cv[rn-1]
        val v = cv[rn-1] + dv * (if (dv<0)d*d else 1-d*d)
        return arrayOf(hue, s, v).toFloatArray()
    }
    
    init {
        val tenGray:Array<Int> = Array(11 ){ i -> i * 10 }
        for (hue in 0..100){
            when{
                hue in tenGray -> c[hue].fromHsv(grayHsv(hue))
                else -> c[hue].fromHsv(colorHsv(hue))
            }
            c[hue].a = 1f
        }
    }
}