package colorstepskin

import com.badlogic.gdx.graphics.Color

class ColorBoxDark {
    private val c:Array<Color> = Array(101){ Color() }
    /**return Color depend of incoming integer hsv h - hue component from 0..100. Every next 10 is gray 0 10 20 100
     * @param hue hsv h value from 0..100*/
    fun color(hue:Int):Color{return if (hue in 0..100) c[hue] else c[100]}
    /**hsv h hueStep*/
    private val hs = arrayOf(
            0f,30f,60f,90f,120f,150f,180f,210f,240f,270f,300f,330f,
            360f
    )
    /**hsv v colorValue*/
    private val cv = arrayOf(
            70/100f,70/100f,60/100f,60/100f,60/100f,60/100f,58/100f,75/100f,75/100f,68/100f,64/100f,68/100f,
            70/100f //first element duplication for looping
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
        /**hsv v*/
        val dv = cv[rn]-cv[rn-1]
        val v = (cv[rn-1] + dv * (if (dv<0)d*d else 1-d*d)) * 1.1f /*xp increase coef*/
        return arrayOf(hue, 0.5f, v).toFloatArray()
    }
    
    /*2020-11-16 new stuff about color pair. planned name space text0..100, fon0..100, for two contrasts schemes
    * Some distortion present in general old ranges for colors ,and new , hue steps not equal. Lazy to fix, may be will not bad.*/
    /**use back = 1 to case for second/back color of pair, it add index +1 in statement
     * return range of hue for color pair case*/
    private fun hueRangePair(hue100:Int, back:Int = 0):Int{
        val hue = hue100*3.6f
        return when{
            hue < hp[1*2+back] -> 1
            hue < hp[2*2+back] -> 2
            hue < hp[3*2+back] -> 3
            hue < hp[4*2+back] -> 4
            hue < hp[5*2+back] -> 5
            hue < hp[6*2+back] -> 6
            hue < hp[7*2+back] -> 7
            hue < hp[8*2+back] -> 8
            hue < hp[9*2+back] -> 9
            hue < hp[10*2+back] -> 10
            hue < hp[11*2+back] -> 11
            else -> 12
        }
    }
    private fun huePair100(hue100: Int):Int{
        val rn = hueRangePair(hue100)
        val hue = hue100*3.6f
        val dHueStep = hp[rn*2] - hp[(rn-1)*2]
        val dHue = hue - hp[(rn-1)*2]
        val d = dHue / dHueStep
        
        return when(rn){
            8 -> {/*weird case, when need jump over 360 to 0 -> 270..360..0..60*/
                /**back point*/
                val back = hp[(rn-1)*2+1]
                /**face point*/
                val face = hp[rn*2+1]
                val step = (face - back + 360)
                val raw = (back + step * d)
                when{
                    raw > 360f -> ((360f - raw)/3.6).toInt()
                    else -> (raw/3.6).toInt()
                }
            }
            9 -> {/*weird case when need jump over 0 to 360 -> 60..0..360..240*/
                /**back point*/
                val back = hp[(rn-1)*2+1]
                /**face point*/
                val face = hp[rn*2+1]
                val step = (face - back + 360)
                val raw = (back - step * d)
                when{
                    raw < 0f -> ((360f + raw)/3.6).toInt()
                    else -> (raw/3.6).toInt()
                }
            }
            else ->{/*general case*/
                val raw = ( (hp[rn*2+1] + (hp[rn*2+1] - hp[(rn-1)*2+1]) * d)/3.6 ).toInt()
                when(raw){
                    in 0..100 -> raw
                    else -> 0
                }
            }
        }
        
    }
    /**color hue pairs manually for 101 steps
     * to get first element of index use `huePair[index*2]`
     * for second element of pair use `huePair[index*2+1]`*/
    private val hp = arrayOf(
            0f,210f, //0
            30f,240f, //intermediate work 15 225
            60f,240f,
            90f,240f,
            120f,210f,//work 105 225
            150f,270f,//work 135 240
            180f,210f,//work 165 240
            210f,270f,//work 195 240
            240f,60f,//rn 8 intermediate work but second need move forward over 360 -> 225 345
            270f,240f,//rn 9 work but second need move backward over 0 -> 255 330
            300f,240f,
            330f,240f,
            360f,210f
    )
    /**color pairs array
     * to get light color from pair use cp[index*2]
     * to get dark color from pair use cp[index*2+1]*/
    private val cp:Array<Color> = Array(202){ Color() }
    /**return Color pair depend of incoming integer hsv h - hue component from 0..100. Every next 10 is gray 0 10 20 100
     * @param hue hsv h value from 0..100*/
    fun colorPair(hue:Int): Array<Color> {return if (hue in 0..100) arrayOf(cp[hue*2],cp[hue*2+1]) else arrayOf(cp[100*2],cp[100*2+1])}
    
    init {
        val tenGray:Array<Int> = Array(11 ){ i -> i * 10 }
        for (hue in 0..100){
            when{
                hue in tenGray -> c[hue].fromHsv(grayHsv(hue))
                else -> c[hue].fromHsv(colorHsv(hue))
            }
            c[hue].a = 1f
        }
        /*new stuff about pair color*/
        for (hue in 0..100){
            when{
                hue in tenGray -> {
                    cp[hue*2  ].fromHsv(grayHsv(hue))
                    cp[hue*2+1].fromHsv(grayHsv(huePair100(hue)))
                }
                else ->{
                    /**pair hue*/
                    cp[hue*2  ].fromHsv(colorHsv(hue))
                    cp[hue*2+1].fromHsv(colorHsv(huePair100(hue)))
                }
            }
            cp[hue*2  ].a = 1f
            cp[hue*2+1].a = 1f
        }
    
    }
}