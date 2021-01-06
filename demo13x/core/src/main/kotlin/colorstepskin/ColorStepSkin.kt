package colorstepskin

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle
import com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle
import com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad.TouchpadStyle
import com.badlogic.gdx.scenes.scene2d.ui.Tree.TreeStyle
import com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle


class ColorStepSkin : Skin() {
    /**x100 colors x3 styles dark acid sun , with hue offset. every next 10... 0 10 20 90 100 is gray. other is hue offset based */
    val cbox = ColorBox()
    
    private val asm:AssetManager = AssetManager()
    var defaultFont:BitmapFont? = null
    
    var font8:BitmapFont? = null
    var font12:BitmapFont? = null
    var font16:BitmapFont? = null
    var font20:BitmapFont? = null
    var font24:BitmapFont? = null
    var font28:BitmapFont? = null
    var font36:BitmapFont? = null
    var font40:BitmapFont? = null
    var font44:BitmapFont? = null
    var font52:BitmapFont? = null
    var font56:BitmapFont? = null
    var font60:BitmapFont? = null
    var font68:BitmapFont? = null
    var font72:BitmapFont? = null
    var font76:BitmapFont? = null
    var font80:BitmapFont? = null
    
    var font8fon:BitmapFont? = null
    var font12fon:BitmapFont? = null
    var font16fon:BitmapFont? = null
    var font20fon:BitmapFont? = null
    var font24fon:BitmapFont? = null
    var font28fon:BitmapFont? = null
    var font36fon:BitmapFont? = null
    var font40fon:BitmapFont? = null
    var font44fon:BitmapFont? = null
    var font52fon:BitmapFont? = null
    var font56fon:BitmapFont? = null
    var font60fon:BitmapFont? = null
    var font68fon:BitmapFont? = null
    var font72fon:BitmapFont? = null
    var font76fon:BitmapFont? = null
    var font80fon:BitmapFont? = null
    
    var font32:BitmapFont? = null
    var font48:BitmapFont? = null
    var font64:BitmapFont? = null
    var defaultFontFon:BitmapFont? = null
    var font32fon:BitmapFont? = null
    var font48fon:BitmapFont? = null
    var font64fon:BitmapFont? = null
    
    /*styles*/
    /*default*/
    private var scroll:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    private var split:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    private var tree:Array<TreeStyle> = Array(101){TreeStyle()}
    private var label:Array<LabelStyle> = Array(101){LabelStyle()}
    private var button:Array<ButtonStyle> = Array(101){ButtonStyle()}
    private var tbutton:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    private var check:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    private var tfield:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private var tarea:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private var list:Array<ListStyle> = Array(101){ListStyle()}
    private var select:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    private var progress:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    private var slider:Array<SliderStyle> = Array(101){SliderStyle()}
    private var window:Array<WindowStyle> = Array(101){WindowStyle()}
    private var tpad:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    private var dialog:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*dark*/
    val scrollDark:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    val splitDark:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    val treeDark:Array<TreeStyle> = Array(101){TreeStyle()}
    val labelDark:Array<LabelStyle> = Array(101){LabelStyle()}
    val buttonDark:Array<ButtonStyle> = Array(101){ButtonStyle()}
    val tbuttonDark:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    val checkDark:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    val tfieldDark:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val tareaDark:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val listDark:Array<ListStyle> = Array(101){ListStyle()}
    val selectDark:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    val progressDark:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    val sliderDark:Array<SliderStyle> = Array(101){SliderStyle()}
    val windowDark:Array<WindowStyle> = Array(101){WindowStyle()}
    val tpadDark:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    val dialogDark:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*dark text*/
    val scrollTextDark:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    val splitTextDark:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    val treeTextDark:Array<TreeStyle> = Array(101){TreeStyle()}
    val labelTextDark:Array<LabelStyle> = Array(101){LabelStyle()}
    val buttonTextDark:Array<ButtonStyle> = Array(101){ButtonStyle()}
    val tbuttonTextDark:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    val checkTextDark:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    val tfieldTextDark:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val tareaTextDark:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val listTextDark:Array<ListStyle> = Array(101){ListStyle()}
    val selectTextDark:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    val progressTextDark:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    val sliderTextDark:Array<SliderStyle> = Array(101){SliderStyle()}
    val windowTextDark:Array<WindowStyle> = Array(101){WindowStyle()}
    val tpadTextDark:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    val dialogTextDark:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*dark fon*/
    val scrollFonDark:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    val splitFonDark:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    val treeFonDark:Array<TreeStyle> = Array(101){TreeStyle()}
    val labelFonDark:Array<LabelStyle> = Array(101){LabelStyle()}
    val buttonFonDark:Array<ButtonStyle> = Array(101){ButtonStyle()}
    val tbuttonFonDark:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    val checkFonDark:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    val tfieldFonDark:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val tareaFonDark:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val listFonDark:Array<ListStyle> = Array(101){ListStyle()}
    val selectFonDark:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    val progressFonDark:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    val sliderFonDark:Array<SliderStyle> = Array(101){SliderStyle()}
    val windowFonDark:Array<WindowStyle> = Array(101){WindowStyle()}
    val tpadFonDark:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    val dialogFonDark:Array<WindowStyle> = Array(101){WindowStyle()}
    
    
    /*acid*/
    val scrollAcid:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    val splitAcid:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    val treeAcid:Array<TreeStyle> = Array(101){TreeStyle()}
    val labelAcid:Array<LabelStyle> = Array(101){LabelStyle()}
    val buttonAcid:Array<ButtonStyle> = Array(101){ButtonStyle()}
    val tbuttonAcid:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    val checkAcid:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    val tfieldAcid:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val tareaAcid:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val listAcid:Array<ListStyle> = Array(101){ListStyle()}
    val selectAcid:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    val progressAcid:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    val sliderAcid:Array<SliderStyle> = Array(101){SliderStyle()}
    val windowAcid:Array<WindowStyle> = Array(101){WindowStyle()}
    val tpadAcid:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    val dialogAcid:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*acid text*/
    val scrollTextAcid:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    val splitTextAcid:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    val treeTextAcid:Array<TreeStyle> = Array(101){TreeStyle()}
    val labelTextAcid:Array<LabelStyle> = Array(101){LabelStyle()}
    val buttonTextAcid:Array<ButtonStyle> = Array(101){ButtonStyle()}
    val tbuttonTextAcid:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    val checkTextAcid:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    val tfieldTextAcid:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val tareaTextAcid:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val listTextAcid:Array<ListStyle> = Array(101){ListStyle()}
    val selectTextAcid:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    val progressTextAcid:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    val sliderTextAcid:Array<SliderStyle> = Array(101){SliderStyle()}
    val windowTextAcid:Array<WindowStyle> = Array(101){WindowStyle()}
    val tpadTextAcid:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    val dialogTextAcid:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*acid fon*/
    val scrollFonAcid:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    val splitFonAcid:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    val treeFonAcid:Array<TreeStyle> = Array(101){TreeStyle()}
    val labelFonAcid:Array<LabelStyle> = Array(101){LabelStyle()}
    val buttonFonAcid:Array<ButtonStyle> = Array(101){ButtonStyle()}
    val tbuttonFonAcid:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    val checkFonAcid:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    val tfieldFonAcid:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val tareaFonAcid:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val listFonAcid:Array<ListStyle> = Array(101){ListStyle()}
    val selectFonAcid:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    val progressFonAcid:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    val sliderFonAcid:Array<SliderStyle> = Array(101){SliderStyle()}
    val windowFonAcid:Array<WindowStyle> = Array(101){WindowStyle()}
    val tpadFonAcid:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    val dialogFonAcid:Array<WindowStyle> = Array(101){WindowStyle()}
    
    
    /*sun*/
    val scrollSun:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    val splitSun:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    val treeSun:Array<TreeStyle> = Array(101){TreeStyle()}
    val labelSun:Array<LabelStyle> = Array(101){LabelStyle()}
    val buttonSun:Array<ButtonStyle> = Array(101){ButtonStyle()}
    val tbuttonSun:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    val checkSun:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    val tfieldSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val tareaSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val listSun:Array<ListStyle> = Array(101){ListStyle()}
    val selectSun:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    val progressSun:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    val sliderSun:Array<SliderStyle> = Array(101){SliderStyle()}
    val windowSun:Array<WindowStyle> = Array(101){WindowStyle()}
    val tpadSun:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    val dialogSun:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*sun text*/
    val scrollTextSun:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    val splitTextSun:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    val treeTextSun:Array<TreeStyle> = Array(101){TreeStyle()}
    val labelTextSun:Array<LabelStyle> = Array(101){LabelStyle()}
    val buttonTextSun:Array<ButtonStyle> = Array(101){ButtonStyle()}
    val tbuttonTextSun:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    val checkTextSun:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    val tfieldTextSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val tareaTextSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val listTextSun:Array<ListStyle> = Array(101){ListStyle()}
    val selectTextSun:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    val progressTextSun:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    val sliderTextSun:Array<SliderStyle> = Array(101){SliderStyle()}
    val windowTextSun:Array<WindowStyle> = Array(101){WindowStyle()}
    val tpadTextSun:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    val dialogTextSun:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*sun fon*/
    val scrollFonSun:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    val splitFonSun:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    val treeFonSun:Array<TreeStyle> = Array(101){TreeStyle()}
    val labelFonSun:Array<LabelStyle> = Array(101){LabelStyle()}
    val buttonFonSun:Array<ButtonStyle> = Array(101){ButtonStyle()}
    val tbuttonFonSun:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    val checkFonSun:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    val tfieldFonSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val tareaFonSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    val listFonSun:Array<ListStyle> = Array(101){ListStyle()}
    val selectFonSun:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    val progressFonSun:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    val sliderFonSun:Array<SliderStyle> = Array(101){SliderStyle()}
    val windowFonSun:Array<WindowStyle> = Array(101){WindowStyle()}
    val tpadFonSun:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    val dialogFonSun:Array<WindowStyle> = Array(101){WindowStyle()}
    
    
    /*gum*/
    val scrollGum:Array<ScrollPaneStyle> = Array(101){ ScrollPaneStyle() }
    val splitGum:Array<SplitPaneStyle> = Array(101){ SplitPaneStyle() }
    val treeGum:Array<TreeStyle> = Array(101){ TreeStyle() }
    val labelGum:Array<LabelStyle> = Array(101){ LabelStyle() }
    val buttonGum:Array<ButtonStyle> = Array(101){ ButtonStyle() }
    val tbuttonGum:Array<TextButtonStyle> = Array(101){ TextButtonStyle() }
    val checkGum:Array<CheckBoxStyle> = Array(101){ CheckBoxStyle() }
    val tfieldGum:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val tareaGum:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val listGum:Array<ListStyle> = Array(101){ ListStyle() }
    val selectGum:Array<SelectBoxStyle> = Array(101){ SelectBoxStyle() }
    val progressGum:Array<ProgressBarStyle> = Array(101){ ProgressBarStyle() }
    val sliderGum:Array<SliderStyle> = Array(101){ SliderStyle() }
    val windowGum:Array<WindowStyle> = Array(101){ WindowStyle() }
    val tpadGum:Array<TouchpadStyle> = Array(101){ TouchpadStyle() }
    val dialogGum:Array<WindowStyle> = Array(101){ WindowStyle() }
    
    /*gum text*/
    val scrollTextGum:Array<ScrollPaneStyle> = Array(101){ ScrollPaneStyle() }
    val splitTextGum:Array<SplitPaneStyle> = Array(101){ SplitPaneStyle() }
    val treeTextGum:Array<TreeStyle> = Array(101){ TreeStyle() }
    val labelTextGum:Array<LabelStyle> = Array(101){ LabelStyle() }
    val buttonTextGum:Array<ButtonStyle> = Array(101){ ButtonStyle() }
    val tbuttonTextGum:Array<TextButtonStyle> = Array(101){ TextButtonStyle() }
    val checkTextGum:Array<CheckBoxStyle> = Array(101){ CheckBoxStyle() }
    val tfieldTextGum:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val tareaTextGum:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val listTextGum:Array<ListStyle> = Array(101){ ListStyle() }
    val selectTextGum:Array<SelectBoxStyle> = Array(101){ SelectBoxStyle() }
    val progressTextGum:Array<ProgressBarStyle> = Array(101){ ProgressBarStyle() }
    val sliderTextGum:Array<SliderStyle> = Array(101){ SliderStyle() }
    val windowTextGum:Array<WindowStyle> = Array(101){ WindowStyle() }
    val tpadTextGum:Array<TouchpadStyle> = Array(101){ TouchpadStyle() }
    val dialogTextGum:Array<WindowStyle> = Array(101){ WindowStyle() }
    
    /*gum fon*/
    val scrollFonGum:Array<ScrollPaneStyle> = Array(101){ ScrollPaneStyle() }
    val splitFonGum:Array<SplitPaneStyle> = Array(101){ SplitPaneStyle() }
    val treeFonGum:Array<TreeStyle> = Array(101){ TreeStyle() }
    val labelFonGum:Array<LabelStyle> = Array(101){ LabelStyle() }
    val buttonFonGum:Array<ButtonStyle> = Array(101){ ButtonStyle() }
    val tbuttonFonGum:Array<TextButtonStyle> = Array(101){ TextButtonStyle() }
    val checkFonGum:Array<CheckBoxStyle> = Array(101){ CheckBoxStyle() }
    val tfieldFonGum:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val tareaFonGum:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val listFonGum:Array<ListStyle> = Array(101){ ListStyle() }
    val selectFonGum:Array<SelectBoxStyle> = Array(101){ SelectBoxStyle() }
    val progressFonGum:Array<ProgressBarStyle> = Array(101){ ProgressBarStyle() }
    val sliderFonGum:Array<SliderStyle> = Array(101){ SliderStyle() }
    val windowFonGum:Array<WindowStyle> = Array(101){ WindowStyle() }
    val tpadFonGum:Array<TouchpadStyle> = Array(101){ TouchpadStyle() }
    val dialogFonGum:Array<WindowStyle> = Array(101){ WindowStyle() }
    
    
    /*snow*/
    val scrollSnow:Array<ScrollPaneStyle> = Array(101){ ScrollPaneStyle() }
    val splitSnow:Array<SplitPaneStyle> = Array(101){ SplitPaneStyle() }
    val treeSnow:Array<TreeStyle> = Array(101){ TreeStyle() }
    val labelSnow:Array<LabelStyle> = Array(101){ LabelStyle() }
    val buttonSnow:Array<ButtonStyle> = Array(101){ ButtonStyle() }
    val tbuttonSnow:Array<TextButtonStyle> = Array(101){ TextButtonStyle() }
    val checkSnow:Array<CheckBoxStyle> = Array(101){ CheckBoxStyle() }
    val tfieldSnow:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val tareaSnow:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val listSnow:Array<ListStyle> = Array(101){ ListStyle() }
    val selectSnow:Array<SelectBoxStyle> = Array(101){ SelectBoxStyle() }
    val progressSnow:Array<ProgressBarStyle> = Array(101){ ProgressBarStyle() }
    val sliderSnow:Array<SliderStyle> = Array(101){ SliderStyle() }
    val windowSnow:Array<WindowStyle> = Array(101){ WindowStyle() }
    val tpadSnow:Array<TouchpadStyle> = Array(101){ TouchpadStyle() }
    val dialogSnow:Array<WindowStyle> = Array(101){ WindowStyle() }
    
    /*snow text*/
    val scrollTextSnow:Array<ScrollPaneStyle> = Array(101){ ScrollPaneStyle() }
    val splitTextSnow:Array<SplitPaneStyle> = Array(101){ SplitPaneStyle() }
    val treeTextSnow:Array<TreeStyle> = Array(101){ TreeStyle() }
    val labelTextSnow:Array<LabelStyle> = Array(101){ LabelStyle() }
    val buttonTextSnow:Array<ButtonStyle> = Array(101){ ButtonStyle() }
    val tbuttonTextSnow:Array<TextButtonStyle> = Array(101){ TextButtonStyle() }
    val checkTextSnow:Array<CheckBoxStyle> = Array(101){ CheckBoxStyle() }
    val tfieldTextSnow:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val tareaTextSnow:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val listTextSnow:Array<ListStyle> = Array(101){ ListStyle() }
    val selectTextSnow:Array<SelectBoxStyle> = Array(101){ SelectBoxStyle() }
    val progressTextSnow:Array<ProgressBarStyle> = Array(101){ ProgressBarStyle() }
    val sliderTextSnow:Array<SliderStyle> = Array(101){ SliderStyle() }
    val windowTextSnow:Array<WindowStyle> = Array(101){ WindowStyle() }
    val tpadTextSnow:Array<TouchpadStyle> = Array(101){ TouchpadStyle() }
    val dialogTextSnow:Array<WindowStyle> = Array(101){ WindowStyle() }
    
    /*snow fon*/
    val scrollFonSnow:Array<ScrollPaneStyle> = Array(101){ ScrollPaneStyle() }
    val splitFonSnow:Array<SplitPaneStyle> = Array(101){ SplitPaneStyle() }
    val treeFonSnow:Array<TreeStyle> = Array(101){ TreeStyle() }
    val labelFonSnow:Array<LabelStyle> = Array(101){ LabelStyle() }
    val buttonFonSnow:Array<ButtonStyle> = Array(101){ ButtonStyle() }
    val tbuttonFonSnow:Array<TextButtonStyle> = Array(101){ TextButtonStyle() }
    val checkFonSnow:Array<CheckBoxStyle> = Array(101){ CheckBoxStyle() }
    val tfieldFonSnow:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val tareaFonSnow:Array<TextFieldStyle> = Array(101){ TextFieldStyle() }
    val listFonSnow:Array<ListStyle> = Array(101){ ListStyle() }
    val selectFonSnow:Array<SelectBoxStyle> = Array(101){ SelectBoxStyle() }
    val progressFonSnow:Array<ProgressBarStyle> = Array(101){ ProgressBarStyle() }
    val sliderFonSnow:Array<SliderStyle> = Array(101){ SliderStyle() }
    val windowFonSnow:Array<WindowStyle> = Array(101){ WindowStyle() }
    val tpadFonSnow:Array<TouchpadStyle> = Array(101){ TouchpadStyle() }
    val dialogFonSnow:Array<WindowStyle> = Array(101){ WindowStyle() }
    
    
    fun prepare(){
        dispose()
        
        for (i in 8..80 step 4){
            asm.load("color-step-skin/rog$i.fnt", BitmapFont::class.java)
            asm.load("color-step-skin/inverted/inverted-rog$i.fnt", BitmapFont::class.java)
        }
        
        asm.load("color-step-skin/color-step-skin.atlas", TextureAtlas::class.java)
        
        asm.finishLoading()
        
        for ( i in 8..80 step 4){
            add("font$i", asm.get("color-step-skin/rog$i.fnt"), BitmapFont::class.java)
            add("font${i}fon", asm.get("color-step-skin/inverted/inverted-rog$i.fnt"), BitmapFont::class.java)
        }
        
        addRegions(asm.get("color-step-skin/color-step-skin.atlas"))
    
        font8 = get("font8", BitmapFont::class.java)
        font12 = get("font12", BitmapFont::class.java)
        font16 = get("font16", BitmapFont::class.java)
        font20 = get("font20", BitmapFont::class.java)
        font24 = get("font24", BitmapFont::class.java)
        font28 = get("font28", BitmapFont::class.java)
        font36 = get("font36", BitmapFont::class.java)
        font40 = get("font40", BitmapFont::class.java)
        font44 = get("font44", BitmapFont::class.java)
        font52 = get("font52", BitmapFont::class.java)
        font56 = get("font56", BitmapFont::class.java)
        font60 = get("font60", BitmapFont::class.java)
        font68 = get("font68", BitmapFont::class.java)
        font72 = get("font72", BitmapFont::class.java)
        font76 = get("font76", BitmapFont::class.java)
        font80 = get("font80", BitmapFont::class.java)
        
        font8fon = get("font8fon", BitmapFont::class.java)
        font12fon = get("font12fon", BitmapFont::class.java)
        font16fon = get("font16fon", BitmapFont::class.java)
        font20fon = get("font20fon", BitmapFont::class.java)
        font24fon = get("font24fon", BitmapFont::class.java)
        font28fon = get("font28fon", BitmapFont::class.java)
        font36fon = get("font36fon", BitmapFont::class.java)
        font40fon = get("font40fon", BitmapFont::class.java)
        font44fon = get("font44fon", BitmapFont::class.java)
        font52fon = get("font52fon", BitmapFont::class.java)
        font56fon = get("font56fon", BitmapFont::class.java)
        font60fon = get("font60fon", BitmapFont::class.java)
        font68fon = get("font68fon", BitmapFont::class.java)
        font72fon = get("font72fon", BitmapFont::class.java)
        font76fon = get("font76fon", BitmapFont::class.java)
        font80fon = get("font80fon", BitmapFont::class.java)
        
        font32 = get("font32" ,  BitmapFont::class.java)
        font48 = get("font48" ,  BitmapFont::class.java)
        font64 = get("font64" ,  BitmapFont::class.java)
        defaultFont = font32 /*switch to any prebuilded above to use as default in styles*/
        
        font32fon = get("font32fon" ,  BitmapFont::class.java)
        font48fon = get("font48fon" ,  BitmapFont::class.java)
        font64fon = get("font64fon" ,  BitmapFont::class.java)
        defaultFontFon = font32fon /*switch to any prebuilded above to use as default in styles*/
        
        createDarkStyle(this)
        createAcidStyle(this)
        createSunStyle(this)
        createGumStyle(this)
        createSnowStyle(this)
        
        /*default*/
        defaultTextSun() /*short name binded to text sun scheme. Call other (declaired bottom) from this place , to make them default*/
        for (hue in 0..100){
            
            add("$hue", scroll[hue])
            add("$hue", split[hue])
            add("$hue", tree[hue])
            add("$hue", label[hue])
            add("$hue", button[hue])
            add("$hue", tbutton[hue])
            add("$hue", check[hue])
            add("$hue", tfield[hue])
            add("$hue", tarea[hue])
            add("$hue", list[hue])
            add("$hue", select[hue])
            add("$hue", progress[hue])
            add("$hue", slider[hue])
            add("$hue", window[hue])
            add("$hue", tpad[hue])
            add("$hue", dialog[hue])
        
        }
        
    }
    
    fun defaultDark(){
        for (hue in 0..100){
            scroll[hue] = scrollDark[hue]
            split[hue] = splitDark[hue]
            tree[hue] = treeDark[hue]
            label[hue] = labelDark[hue]
            button[hue] = buttonDark[hue]
            tbutton[hue] = tbuttonDark[hue]
            check[hue] = checkDark[hue]
            tfield[hue] = tfieldDark[hue]
            tarea[hue] = tareaDark[hue]
            list[hue] = listDark[hue]
            select[hue] = selectDark[hue]
            progress[hue] = progressDark[hue]
            slider[hue] = sliderDark[hue]
            window[hue] = windowDark[hue]
            tpad[hue] = tpadDark[hue]
            dialog[hue] = dialogDark[hue]
        }
    }
    
    fun defaultTextDark(){
        for (hue in 0..100){
            scroll[hue] = scrollTextDark[hue]
            split[hue] = splitTextDark[hue]
            tree[hue] = treeTextDark[hue]
            label[hue] = labelTextDark[hue]
            button[hue] = buttonTextDark[hue]
            tbutton[hue] = tbuttonTextDark[hue]
            check[hue] = checkTextDark[hue]
            tfield[hue] = tfieldTextDark[hue]
            tarea[hue] = tareaTextDark[hue]
            list[hue] = listTextDark[hue]
            select[hue] = selectTextDark[hue]
            progress[hue] = progressTextDark[hue]
            slider[hue] = sliderTextDark[hue]
            window[hue] = windowTextDark[hue]
            tpad[hue] = tpadTextDark[hue]
            dialog[hue] = dialogTextDark[hue]
        }
    }
    
    fun defaultFonDark(){
        for (hue in 0..100){
            scroll[hue] = scrollFonDark[hue]
            split[hue] = splitFonDark[hue]
            tree[hue] = treeFonDark[hue]
            label[hue] = labelFonDark[hue]
            button[hue] = buttonFonDark[hue]
            tbutton[hue] = tbuttonFonDark[hue]
            check[hue] = checkFonDark[hue]
            tfield[hue] = tfieldFonDark[hue]
            tarea[hue] = tareaFonDark[hue]
            list[hue] = listFonDark[hue]
            select[hue] = selectFonDark[hue]
            progress[hue] = progressFonDark[hue]
            slider[hue] = sliderFonDark[hue]
            window[hue] = windowFonDark[hue]
            tpad[hue] = tpadFonDark[hue]
            dialog[hue] = dialogFonDark[hue]
        }
    }
    
    
    fun defaultAcid(){
        for (hue in 0..100){
            scroll[hue] = scrollAcid[hue]
            split[hue] = splitAcid[hue]
            tree[hue] = treeAcid[hue]
            label[hue] = labelAcid[hue]
            button[hue] = buttonAcid[hue]
            tbutton[hue] = tbuttonAcid[hue]
            check[hue] = checkAcid[hue]
            tfield[hue] = tfieldAcid[hue]
            tarea[hue] = tareaAcid[hue]
            list[hue] = listAcid[hue]
            select[hue] = selectAcid[hue]
            progress[hue] = progressAcid[hue]
            slider[hue] = sliderAcid[hue]
            window[hue] = windowAcid[hue]
            tpad[hue] = tpadAcid[hue]
            dialog[hue] = dialogAcid[hue]
        }
    }
    
    fun defaultTextAcid(){
        for (hue in 0..100){
            scroll[hue] = scrollTextAcid[hue]
            split[hue] = splitTextAcid[hue]
            tree[hue] = treeTextAcid[hue]
            label[hue] = labelTextAcid[hue]
            button[hue] = buttonTextAcid[hue]
            tbutton[hue] = tbuttonTextAcid[hue]
            check[hue] = checkTextAcid[hue]
            tfield[hue] = tfieldTextAcid[hue]
            tarea[hue] = tareaTextAcid[hue]
            list[hue] = listTextAcid[hue]
            select[hue] = selectTextAcid[hue]
            progress[hue] = progressTextAcid[hue]
            slider[hue] = sliderTextAcid[hue]
            window[hue] = windowTextAcid[hue]
            tpad[hue] = tpadTextAcid[hue]
            dialog[hue] = dialogTextAcid[hue]
        }
    }
    
    fun defaultFonAcid(){
        for (hue in 0..100){
            scroll[hue] = scrollFonAcid[hue]
            split[hue] = splitFonAcid[hue]
            tree[hue] = treeFonAcid[hue]
            label[hue] = labelFonAcid[hue]
            button[hue] = buttonFonAcid[hue]
            tbutton[hue] = tbuttonFonAcid[hue]
            check[hue] = checkFonAcid[hue]
            tfield[hue] = tfieldFonAcid[hue]
            tarea[hue] = tareaFonAcid[hue]
            list[hue] = listFonAcid[hue]
            select[hue] = selectFonAcid[hue]
            progress[hue] = progressFonAcid[hue]
            slider[hue] = sliderFonAcid[hue]
            window[hue] = windowFonAcid[hue]
            tpad[hue] = tpadFonAcid[hue]
            dialog[hue] = dialogFonAcid[hue]
        }
    }
    
    
    fun defaultSun(){
        for (hue in 0..100){
            scroll[hue] = scrollSun[hue]
            split[hue] = splitSun[hue]
            tree[hue] = treeSun[hue]
            label[hue] = labelSun[hue]
            button[hue] = buttonSun[hue]
            tbutton[hue] = tbuttonSun[hue]
            check[hue] = checkSun[hue]
            tfield[hue] = tfieldSun[hue]
            tarea[hue] = tareaSun[hue]
            list[hue] = listSun[hue]
            select[hue] = selectSun[hue]
            progress[hue] = progressSun[hue]
            slider[hue] = sliderSun[hue]
            window[hue] = windowSun[hue]
            tpad[hue] = tpadSun[hue]
            dialog[hue] = dialogSun[hue]
        }
    }
    
    fun defaultTextSun(){
        for (hue in 0..100){
            scroll[hue] = scrollTextSun[hue]
            split[hue] = splitTextSun[hue]
            tree[hue] = treeTextSun[hue]
            label[hue] = labelTextSun[hue]
            button[hue] = buttonTextSun[hue]
            tbutton[hue] = tbuttonTextSun[hue]
            check[hue] = checkTextSun[hue]
            tfield[hue] = tfieldTextSun[hue]
            tarea[hue] = tareaTextSun[hue]
            list[hue] = listTextSun[hue]
            select[hue] = selectTextSun[hue]
            progress[hue] = progressTextSun[hue]
            slider[hue] = sliderTextSun[hue]
            window[hue] = windowTextSun[hue]
            tpad[hue] = tpadTextSun[hue]
            dialog[hue] = dialogTextSun[hue]
        }
    }
    
    fun defaultFonSun(){
        for (hue in 0..100){
            scroll[hue] = scrollFonSun[hue]
            split[hue] = splitFonSun[hue]
            tree[hue] = treeFonSun[hue]
            label[hue] = labelFonSun[hue]
            button[hue] = buttonFonSun[hue]
            tbutton[hue] = tbuttonFonSun[hue]
            check[hue] = checkFonSun[hue]
            tfield[hue] = tfieldFonSun[hue]
            tarea[hue] = tareaFonSun[hue]
            list[hue] = listFonSun[hue]
            select[hue] = selectFonSun[hue]
            progress[hue] = progressFonSun[hue]
            slider[hue] = sliderFonSun[hue]
            window[hue] = windowFonSun[hue]
            tpad[hue] = tpadFonSun[hue]
            dialog[hue] = dialogFonSun[hue]
        }
    }
    
    
    fun defaultGum(){
        for (hue in 0..100){
            scroll[hue] = scrollGum[hue]
            split[hue] = splitGum[hue]
            tree[hue] = treeGum[hue]
            label[hue] = labelGum[hue]
            button[hue] = buttonGum[hue]
            tbutton[hue] = tbuttonGum[hue]
            check[hue] = checkGum[hue]
            tfield[hue] = tfieldGum[hue]
            tarea[hue] = tareaGum[hue]
            list[hue] = listGum[hue]
            select[hue] = selectGum[hue]
            progress[hue] = progressGum[hue]
            slider[hue] = sliderGum[hue]
            window[hue] = windowGum[hue]
            tpad[hue] = tpadGum[hue]
            dialog[hue] = dialogGum[hue]
        }
    }
    
    fun defaultTextGum(){
        for (hue in 0..100){
            scroll[hue] = scrollTextGum[hue]
            split[hue] = splitTextGum[hue]
            tree[hue] = treeTextGum[hue]
            label[hue] = labelTextGum[hue]
            button[hue] = buttonTextGum[hue]
            tbutton[hue] = tbuttonTextGum[hue]
            check[hue] = checkTextGum[hue]
            tfield[hue] = tfieldTextGum[hue]
            tarea[hue] = tareaTextGum[hue]
            list[hue] = listTextGum[hue]
            select[hue] = selectTextGum[hue]
            progress[hue] = progressTextGum[hue]
            slider[hue] = sliderTextGum[hue]
            window[hue] = windowTextGum[hue]
            tpad[hue] = tpadTextGum[hue]
            dialog[hue] = dialogTextGum[hue]
        }
    }
    
    fun defaultFonGum(){
        for (hue in 0..100){
            scroll[hue] = scrollFonGum[hue]
            split[hue] = splitFonGum[hue]
            tree[hue] = treeFonGum[hue]
            label[hue] = labelFonGum[hue]
            button[hue] = buttonFonGum[hue]
            tbutton[hue] = tbuttonFonGum[hue]
            check[hue] = checkFonGum[hue]
            tfield[hue] = tfieldFonGum[hue]
            tarea[hue] = tareaFonGum[hue]
            list[hue] = listFonGum[hue]
            select[hue] = selectFonGum[hue]
            progress[hue] = progressFonGum[hue]
            slider[hue] = sliderFonGum[hue]
            window[hue] = windowFonGum[hue]
            tpad[hue] = tpadFonGum[hue]
            dialog[hue] = dialogFonGum[hue]
        }
    }
    
    
    fun defaultSnow(){
        for (hue in 0..100){
            scroll[hue] = scrollSnow[hue]
            split[hue] = splitSnow[hue]
            tree[hue] = treeSnow[hue]
            label[hue] = labelSnow[hue]
            button[hue] = buttonSnow[hue]
            tbutton[hue] = tbuttonSnow[hue]
            check[hue] = checkSnow[hue]
            tfield[hue] = tfieldSnow[hue]
            tarea[hue] = tareaSnow[hue]
            list[hue] = listSnow[hue]
            select[hue] = selectSnow[hue]
            progress[hue] = progressSnow[hue]
            slider[hue] = sliderSnow[hue]
            window[hue] = windowSnow[hue]
            tpad[hue] = tpadSnow[hue]
            dialog[hue] = dialogSnow[hue]
        }
    }
    
    fun defaultTextSnow(){
        for (hue in 0..100){
            scroll[hue] = scrollTextSnow[hue]
            split[hue] = splitTextSnow[hue]
            tree[hue] = treeTextSnow[hue]
            label[hue] = labelTextSnow[hue]
            button[hue] = buttonTextSnow[hue]
            tbutton[hue] = tbuttonTextSnow[hue]
            check[hue] = checkTextSnow[hue]
            tfield[hue] = tfieldTextSnow[hue]
            tarea[hue] = tareaTextSnow[hue]
            list[hue] = listTextSnow[hue]
            select[hue] = selectTextSnow[hue]
            progress[hue] = progressTextSnow[hue]
            slider[hue] = sliderTextSnow[hue]
            window[hue] = windowTextSnow[hue]
            tpad[hue] = tpadTextSnow[hue]
            dialog[hue] = dialogTextSnow[hue]
        }
    }
    
    fun defaultFonSnow(){
        for (hue in 0..100){
            scroll[hue] = scrollFonSnow[hue]
            split[hue] = splitFonSnow[hue]
            tree[hue] = treeFonSnow[hue]
            label[hue] = labelFonSnow[hue]
            button[hue] = buttonFonSnow[hue]
            tbutton[hue] = tbuttonFonSnow[hue]
            check[hue] = checkFonSnow[hue]
            tfield[hue] = tfieldFonSnow[hue]
            tarea[hue] = tareaFonSnow[hue]
            list[hue] = listFonSnow[hue]
            select[hue] = selectFonSnow[hue]
            progress[hue] = progressFonSnow[hue]
            slider[hue] = sliderFonSnow[hue]
            window[hue] = windowFonSnow[hue]
            tpad[hue] = tpadFonSnow[hue]
            dialog[hue] = dialogFonSnow[hue]
        }
    }
    
    
}