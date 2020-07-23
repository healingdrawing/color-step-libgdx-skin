package colorstepskin

import com.badlogic.gdx.graphics.Color

class ColorBoxAcid {
    private val c:Array<Color> = Array(101){ Color() }
    /**return Color depend of incoming integer hsv h - hue component from 0..100. Every next 10 is gray 0 10 20 100
     * @param hue hsv h value from 0..100*/
    fun color(hue:Int): Color {return if (hue in 0..100) c[hue] else c[100]}
    /**hsv h hueStep*/
    private val hs = arrayOf(
            0/360f,30/360f,60/360f,90/360f,120/360f,150/360f,180/360f,210/360f,240/360f,274/360f,300/360f,330/360f
    )
    /**hsv s colorSaturation*/
    private val cs = arrayOf(
            72/100f,100/100f,100/100f,70/100f,70/100f,70/100f,80/100f,50/100f,50/100f,72/100f,73/100f,71/100f,
            72/100f
    )
    /**hsv v colorValue*/
    private val cv = arrayOf(
            90/100f,87/100f,67/100f,72/100f,72/100f,72/100f,72/100f,100/100f,100/100f,100/100f,80/100f,84/100f,
            90/100f //first element duplication for looping
    )
    
    private fun grayHsv(hue:Int):FloatArray{
        return arrayOf(0.0f, 0.0f, hue/100.0f).toFloatArray()
    }
    
    private fun hueRange(hue100:Int):Int{
        val hue = hue100/100f
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
        val hue = hue100/100f
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
        }
    }
}