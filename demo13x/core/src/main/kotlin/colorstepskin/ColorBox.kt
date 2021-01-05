package colorstepskin


class ColorBox {
    val darkFace = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(8 / 100f, 8 / 100f, 12 / 100f, 10 / 100f, 10 / 100f, 10 / 100f, 10 / 100f, 8 / 100f, 10 / 100f, 10 / 100f, 10 / 100f, 8 / 100f),
            arrayOf(100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f)
    )
    val darkBack = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(50 / 100f, 51 / 100f, 50 / 100f, 50 / 100f, 51 / 100f, 51 / 100f, 51 / 100f, 50 / 100f, 50 / 100f, 49 / 100f, 51 / 100f, 50 / 100f),
            arrayOf(70 / 100f, 68 / 100f, 60 / 100f, 56 / 100f, 55 / 100f, 55 / 100f, 55 / 100f, 75 / 100f, 69 / 100f, 62 / 100f, 67 / 100f, 70 / 100f)
    )
    val dark = ColorBoxItem(darkFace, darkBack)
    
    val acidFace = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(4 / 100f, 4 / 100f, 4 / 100f, 4 / 100f, 4 / 100f, 4 / 100f, 4 / 100f, 4 / 100f, 4 / 100f, 4 / 100f, 4 / 100f, 4 / 100f),
            arrayOf(100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f)
    )
    val acidBack = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(72 / 100f, 100 / 100f, 100 / 100f, 70 / 100f, 81 / 100f, 81 / 100f, 81 / 100f, 60 / 100f, 74 / 100f, 73 / 100f, 71 / 100f, 72 / 100f),
            arrayOf(90 / 100f, 87 / 100f, 62 / 100f, 72 / 100f, 67 / 100f, 67 / 100f, 67 / 100f, 100 / 100f, 100 / 100f, 80 / 100f, 84 / 100f, 90 / 100f)
    )
    val acid = ColorBoxItem(acidFace, acidBack)
    
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
    val sun = ColorBoxItem(sunFace, sunBack)
    
    val gumFace = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(10 / 100f, 10 / 100f, 8 / 100f, 8 / 100f, 8 / 100f, 8 / 100f, 8 / 100f, 9 / 100f, 10 / 100f, 9 / 100f, 9 / 100f, 10 / 100f),
            arrayOf(100 / 100f, 100 / 100f, 99 / 100f, 99 / 100f, 99 / 100f, 99 / 100f, 99 / 100f, 99 / 100f, 100 / 100f, 99 / 100f, 99 / 100f, 100 / 100f)
    )
    val gumBack = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f),
            arrayOf(40 / 100f, 40 / 100f, 32 / 100f, 36 / 100f, 32 / 100f, 32 / 100f, 32 / 100f, 72 / 100f, 62 / 100f, 56 / 100f, 62 / 100f, 40 / 100f)
    )
    val gum = ColorBoxItem(gumFace, gumBack)
    
    val snowFace = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(20 / 100f, 20 / 100f, 16 / 100f, 16 / 100f, 16 / 100f, 16 / 100f, 16 / 100f, 16 / 100f, 16 / 100f, 16 / 100f, 16 / 100f, 20 / 100f),
            arrayOf(100 / 100f, 100 / 100f, 98 / 100f, 98 / 100f, 98 / 100f, 98 / 100f, 98 / 100f, 98 / 100f, 98 / 100f, 98 / 100f, 98 / 100f, 100 / 100f)
    )
    val snowBack = ColorBoxHSV(
            arrayOf(0f, 30f, 60f, 120f, 180f, 180f, 180f, 240f, 270f, 300f, 330f, 360f),
            arrayOf(100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f, 100 / 100f),
            arrayOf(20 / 100f, 20 / 100f, 20 / 100f, 20 / 100f, 20 / 100f, 20 / 100f, 20 / 100f, 26 / 100f, 26 / 100f, 20 / 100f, 20 / 100f, 20 / 100f)
    )
    val snow = ColorBoxItem(snowFace, snowBack)
    
}