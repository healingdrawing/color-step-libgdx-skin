package colorstepskin

import com.badlogic.gdx.graphics.Color

/**keeper for colors scheme named sun
 * @param fcb face color box
 * @param bcb back color box
 * */
class ColorBoxItem(
        private val fcb:ColorBoxHSV,
        private val bcb:ColorBoxHSV
) {
    /**return scheme face Color depend of incoming integer hsv h - hue component from 0..100. Every next 10 is gray 0 10 20 100
     * @param hue hsv h value from 0..100
     * @param back get back color of scheme*/
    fun color(hue:Int, back:Boolean = false): Color {return if (back) bcb.color(hue) else fcb.color(hue)}
    
    /**return scheme face Color pair depend of incoming integer hsv h - hue component from 0..100. Every next 10 is gray 0 10 20 100
     * @param hue hsv h value from 0..100
     * @param back get back colors of scheme*/
    fun colorPair(hue:Int, back:Boolean = false): Array<Color> {return if (back) bcb.colorPair(hue) else fcb.colorPair(hue)}
    
}