package gui

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.scenes.scene2d.ui.Skin

class ColorStepSkin : Skin() {
    /**x100 colors , with hue offset. every next 10... 0 10 20 90 100 is gray. other is hue offset based */
    class ColorBox(){
        private val dark:Array<Color> = Array(101){Color()}
        private val acid:Array<Color> = Array(101){Color()}
        private val sun:Array<Color> = Array(101){Color()}
        
        private val hueStep = arrayOf(
                0/360f,30/360f,60/360f,90/360f,120/360f,150/360f,180/360f,210/360f,240/360f,270/360f,300/360f,330/360f
        )
        /**hsv v colorValue*/
        private val cv = arrayOf(
                70/100f,70/100f,60/100f,60/100f,60/100f,60/100f,58/100f,75/100f,75/100f,68/100f,64/100f,68/100f,
                70/100f //first element duplication for looping
        )
    
        private fun grayHsv(hue:Int):FloatArray{
            return arrayOf(0.0f, 0.0f, hue/100.0f).toFloatArray()
        }
        
        private fun hueRange(hue100:Int):Int{
            val hue = hue100/100f
            return when{
                hue < hueStep[1] -> 1
                hue < hueStep[2] -> 2
                hue < hueStep[3] -> 3
                hue < hueStep[4] -> 4
                hue < hueStep[5] -> 5
                hue < hueStep[6] -> 6
                hue < hueStep[7] -> 7
                hue < hueStep[8] -> 8
                hue < hueStep[9] -> 9
                hue < hueStep[10] -> 10
                hue < hueStep[11] -> 11
                else -> 12
            }
        }
        private fun colorHsv(hue100:Int):FloatArray{
            /**rangeNumber 1..12*/
            val rn = hueRange(hue100)
            val hue = hue100/100f
            val dHueStep = hueStep[rn] - hueStep[rn-1]
            val dHue = hue - hueStep[rn-1]
            val d = dHue / dHueStep
            val dv = cv[rn]-cv[rn-1]
            /**hsv v*/
            val v = cv[rn-1] + dv * (if (dv<0)d*d else 1-d*d)
            return arrayOf(hue, 0.5f, v).toFloatArray()
        }
        
        init {
            val tenGray:Array<Int> = Array(11 ){ i -> i * 10 }
            for (hue in 0..100){
                when{
                    hue in tenGray -> dark[hue].fromHsv(grayHsv(hue))
                    else -> dark[hue].fromHsv(colorHsv(hue))
                }
            }
        }
    }
    
}