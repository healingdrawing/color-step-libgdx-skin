package colorstepskin


class ColorBox {
    val dark = ColorBoxDark()
    val acid = ColorBoxAcid()
    
    val sunFace = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(28 / 100f, 37 / 100f, 34 / 100f, 26 / 100f, 25 / 100f, 25 / 100f, 25 / 100f, 21 / 100f, 22 / 100f, 24 / 100f, 29 / 100f, 28 / 100f),
            arrayOf(95 / 100f, 97 / 100f, 90 / 100f, 92 / 100f, 88 / 100f, 88 / 100f, 88 / 100f, 98 / 100f, 96 / 100f, 94 / 100f, 98 / 100f, 95 / 100f)
    )
    val sunBack = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f),
            arrayOf(20 / 100f, 20 / 100f, 16 / 100f, 18 / 100f, 16 / 100f, 16 / 100f, 16 / 100f, 36 / 100f, 30 / 100f, 28 / 100f, 30 / 100f, 20 / 100f)
    )
    val sun = ColorBoxItem(sunFace,sunBack)
}