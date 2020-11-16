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
    private var defaultFont:BitmapFont? = null
    var font32:BitmapFont? = null
    private var font48:BitmapFont? = null
    private var font64:BitmapFont? = null
    
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
    private val scrollDark:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    private val splitDark:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    private val treeDark:Array<TreeStyle> = Array(101){TreeStyle()}
    private val labelDark:Array<LabelStyle> = Array(101){LabelStyle()}
    private val buttonDark:Array<ButtonStyle> = Array(101){ButtonStyle()}
    private val tbuttonDark:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    private val checkDark:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    private val tfieldDark:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private val tareaDark:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private val listDark:Array<ListStyle> = Array(101){ListStyle()}
    private val selectDark:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    private val progressDark:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    private val sliderDark:Array<SliderStyle> = Array(101){SliderStyle()}
    private val windowDark:Array<WindowStyle> = Array(101){WindowStyle()}
    private val tpadDark:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    private val dialogDark:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*acid*/
    private val scrollAcid:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    private val splitAcid:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    private val treeAcid:Array<TreeStyle> = Array(101){TreeStyle()}
    private val labelAcid:Array<LabelStyle> = Array(101){LabelStyle()}
    private val buttonAcid:Array<ButtonStyle> = Array(101){ButtonStyle()}
    private val tbuttonAcid:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    private val checkAcid:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    private val tfieldAcid:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private val tareaAcid:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private val listAcid:Array<ListStyle> = Array(101){ListStyle()}
    private val selectAcid:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    private val progressAcid:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    private val sliderAcid:Array<SliderStyle> = Array(101){SliderStyle()}
    private val windowAcid:Array<WindowStyle> = Array(101){WindowStyle()}
    private val tpadAcid:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    private val dialogAcid:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*sun*/
    private val scrollSun:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    private val splitSun:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    private val treeSun:Array<TreeStyle> = Array(101){TreeStyle()}
    private val labelSun:Array<LabelStyle> = Array(101){LabelStyle()}
    private val buttonSun:Array<ButtonStyle> = Array(101){ButtonStyle()}
    private val tbuttonSun:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    private val checkSun:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    private val tfieldSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private val tareaSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private val listSun:Array<ListStyle> = Array(101){ListStyle()}
    private val selectSun:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    private val progressSun:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    private val sliderSun:Array<SliderStyle> = Array(101){SliderStyle()}
    private val windowSun:Array<WindowStyle> = Array(101){WindowStyle()}
    private val tpadSun:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    private val dialogSun:Array<WindowStyle> = Array(101){WindowStyle()}
    
    /*text*/
    private val scrollTextSun:Array<ScrollPaneStyle> = Array(101){ScrollPaneStyle()}
    private val splitTextSun:Array<SplitPaneStyle> = Array(101){SplitPaneStyle()}
    private val treeTextSun:Array<TreeStyle> = Array(101){TreeStyle()}
    private val labelTextSun:Array<LabelStyle> = Array(101){LabelStyle()}
    private val buttonTextSun:Array<ButtonStyle> = Array(101){ButtonStyle()}
    private val tbuttonTextSun:Array<TextButtonStyle> = Array(101){TextButtonStyle()}
    private val checkTextSun:Array<CheckBoxStyle> = Array(101){CheckBoxStyle()}
    private val tfieldTextSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private val tareaTextSun:Array<TextFieldStyle> = Array(101){TextFieldStyle()}
    private val listTextSun:Array<ListStyle> = Array(101){ListStyle()}
    private val selectTextSun:Array<SelectBoxStyle> = Array(101){SelectBoxStyle()}
    private val progressTextSun:Array<ProgressBarStyle> = Array(101){ProgressBarStyle()}
    private val sliderTextSun:Array<SliderStyle> = Array(101){SliderStyle()}
    private val windowTextSun:Array<WindowStyle> = Array(101){WindowStyle()}
    private val tpadTextSun:Array<TouchpadStyle> = Array(101){TouchpadStyle()}
    private val dialogTextSun:Array<WindowStyle> = Array(101){WindowStyle()}
    
    
    fun prepare(){
        dispose()
        asm.load("color-step-skin/rog32.fnt", BitmapFont::class.java)
        asm.load("color-step-skin/rog48.fnt", BitmapFont::class.java)
        asm.load("color-step-skin/rog64.fnt", BitmapFont::class.java)
    
        asm.load("color-step-skin/color-step-skin.atlas", TextureAtlas::class.java)
        
        asm.finishLoading()
    
        add("font32", asm.get("color-step-skin/rog32.fnt"), BitmapFont::class.java)
        add("font48", asm.get("color-step-skin/rog48.fnt"), BitmapFont::class.java)
        add("font64", asm.get("color-step-skin/rog64.fnt"), BitmapFont::class.java)
        
        addRegions(asm.get("color-step-skin/color-step-skin.atlas"))
    
        font32 = get("font32" ,  BitmapFont::class.java)
        font48 = get("font48" ,  BitmapFont::class.java)
        font64 = get("font64" ,  BitmapFont::class.java)
        defaultFont = font32
        
        /*dark*/
        for (hue in 0..100){
            val color = cbox.dark.color(hue)
            
            scrollDark[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), color)
            scrollDark[hue].vScroll = newDrawable(getDrawable("vscroll"), color)
            scrollDark[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), color)
            scrollDark[hue].hScroll = newDrawable(getDrawable("hscroll"), color)

            splitDark[hue].handle = newDrawable(getDrawable("splitpane"), color)

            treeDark[hue].minus = newDrawable(getDrawable("tree-minus"), color)
            treeDark[hue].plus = newDrawable(getDrawable("tree-plus"), color)
            treeDark[hue].background = newDrawable(getDrawable("tree-background"), color)
            treeDark[hue].selection = newDrawable(getDrawable("tree-selection"), color)

            labelDark[hue].background = newDrawable(getDrawable("label-background"), color)
            labelDark[hue].font = defaultFont
            labelDark[hue].fontColor = color

            buttonDark[hue].up = newDrawable(getDrawable("button-up"), color)
            buttonDark[hue].down = newDrawable(getDrawable("button-down"), color)
            buttonDark[hue].checked = newDrawable(getDrawable("button-checked"), color)
            buttonDark[hue].disabled = newDrawable(getDrawable("button-disabled"), color)

            tbuttonDark[hue].up = newDrawable(getDrawable("button-up"), color)
            tbuttonDark[hue].down = newDrawable(getDrawable("button-down"), color)
            tbuttonDark[hue].checked = newDrawable(getDrawable("button-checked"), color)
            tbuttonDark[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
            tbuttonDark[hue].font = defaultFont
            tbuttonDark[hue].fontColor = color

            checkDark[hue].checkboxOn = newDrawable(getDrawable("check-on"), color)
            checkDark[hue].checkboxOff = newDrawable(getDrawable("check-off"), color)
            checkDark[hue].disabled = newDrawable(getDrawable("check-disabled"), color)
            checkDark[hue].font = defaultFont
            checkDark[hue].fontColor = color

            tfieldDark[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tfieldDark[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tfieldDark[hue].background = newDrawable(getDrawable("textfield-background"), color)
            tfieldDark[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), color)
            tfieldDark[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), color)
            tfieldDark[hue].font = defaultFont
            tfieldDark[hue].fontColor = color

            tareaDark[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tareaDark[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tareaDark[hue].background = newDrawable(getDrawable("textfield-background"), color)
            tareaDark[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), color)
            tareaDark[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), color)
            tareaDark[hue].font = defaultFont
            tareaDark[hue].fontColor = color

            listDark[hue].background = newDrawable(getDrawable("list-background"), color)
            listDark[hue].selection = newDrawable(getDrawable("list-selection"), color)
            listDark[hue].down = newDrawable(getDrawable("list-down"), color)
            listDark[hue].font = defaultFont
            listDark[hue].fontColorSelected = color
            listDark[hue].fontColorUnselected = color

            selectDark[hue].listStyle = listDark[hue]
            selectDark[hue].scrollStyle = scrollDark[hue]
            selectDark[hue].background = newDrawable(getDrawable("select-background"), color)
            selectDark[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), color)
            selectDark[hue].font = defaultFont
            selectDark[hue].fontColor = color

            progressDark[hue].background = newDrawable(getDrawable("progress-background"), color)
            progressDark[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), color)
            progressDark[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), color)
            progressDark[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), color)
            
            sliderDark[hue].knob = newDrawable(getDrawable("slider-knob"), color)
            sliderDark[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), color)
            sliderDark[hue].background = newDrawable(getDrawable("progress-background"), color)
            sliderDark[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), color)

            windowDark[hue].background = newDrawable(getDrawable("window-background"), color)
            windowDark[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), color)
            windowDark[hue].titleFont = defaultFont
            windowDark[hue].titleFontColor = color

            tpadDark[hue].background = newDrawable(getDrawable("touchpad-background"), color)
            tpadDark[hue].knob = newDrawable(getDrawable("touchpad-knob"), color)

            dialogDark[hue].background = newDrawable(getDrawable("window-background"), color)
            dialogDark[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), color)
            dialogDark[hue].titleFont = defaultFont
            dialogDark[hue].titleFontColor = color

            add("hue${hue}dark", scrollDark[hue])
            add("hue${hue}dark", splitDark[hue])
            add("hue${hue}dark", treeDark[hue])
            add("hue${hue}dark", labelDark[hue])
            add("hue${hue}dark", buttonDark[hue])
            add("hue${hue}dark", tbuttonDark[hue])
            add("hue${hue}dark", checkDark[hue])
            add("hue${hue}dark", tfieldDark[hue])
            add("hue${hue}dark", tareaDark[hue])
            add("hue${hue}dark", listDark[hue])
            add("hue${hue}dark", selectDark[hue])
            add("hue${hue}dark", progressDark[hue])
            add("hue${hue}dark", sliderDark[hue])
            add("hue${hue}dark", windowDark[hue])
            add("hue${hue}dark", tpadDark[hue])
            add("hue${hue}dark", dialogDark[hue])
        
        }
    
        /*acid*/
        for (hue in 0..100){
            val color = cbox.acid.color(hue)
        
            scrollAcid[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), color)
            scrollAcid[hue].vScroll = newDrawable(getDrawable("vscroll"), color)
            scrollAcid[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), color)
            scrollAcid[hue].hScroll = newDrawable(getDrawable("hscroll"), color)
        
            splitAcid[hue].handle = newDrawable(getDrawable("splitpane"), color)
        
            treeAcid[hue].minus = newDrawable(getDrawable("tree-minus"), color)
            treeAcid[hue].plus = newDrawable(getDrawable("tree-plus"), color)
            treeAcid[hue].background = newDrawable(getDrawable("tree-background"), color)
            treeAcid[hue].selection = newDrawable(getDrawable("tree-selection"), color)
        
            labelAcid[hue].background = newDrawable(getDrawable("label-background"), color)
            labelAcid[hue].font = defaultFont
            labelAcid[hue].fontColor = color
        
            buttonAcid[hue].up = newDrawable(getDrawable("button-up"), color)
            buttonAcid[hue].down = newDrawable(getDrawable("button-down"), color)
            buttonAcid[hue].checked = newDrawable(getDrawable("button-checked"), color)
            buttonAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
        
            tbuttonAcid[hue].up = newDrawable(getDrawable("button-up"), color)
            tbuttonAcid[hue].down = newDrawable(getDrawable("button-down"), color)
            tbuttonAcid[hue].checked = newDrawable(getDrawable("button-checked"), color)
            tbuttonAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
            tbuttonAcid[hue].font = defaultFont
            tbuttonAcid[hue].fontColor = color
        
            checkAcid[hue].checkboxOn = newDrawable(getDrawable("check-on"), color)
            checkAcid[hue].checkboxOff = newDrawable(getDrawable("check-off"), color)
            checkAcid[hue].disabled = newDrawable(getDrawable("check-disabled"), color)
            checkAcid[hue].font = defaultFont
            checkAcid[hue].fontColor = color
        
            tfieldAcid[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tfieldAcid[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tfieldAcid[hue].background = newDrawable(getDrawable("textfield-background"), color)
            tfieldAcid[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), color)
            tfieldAcid[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), color)
            tfieldAcid[hue].font = defaultFont
            tfieldAcid[hue].fontColor = color
        
            tareaAcid[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tareaAcid[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tareaAcid[hue].background = newDrawable(getDrawable("textfield-background"), color)
            tareaAcid[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), color)
            tareaAcid[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), color)
            tareaAcid[hue].font = defaultFont
            tareaAcid[hue].fontColor = color
        
            listAcid[hue].background = newDrawable(getDrawable("list-background"), color)
            listAcid[hue].selection = newDrawable(getDrawable("list-selection"), color)
            listAcid[hue].down = newDrawable(getDrawable("list-down"), color)
            listAcid[hue].font = defaultFont
            listAcid[hue].fontColorSelected = color
            listAcid[hue].fontColorUnselected = color
        
            selectAcid[hue].listStyle = listAcid[hue]
            selectAcid[hue].scrollStyle = scrollAcid[hue]
            selectAcid[hue].background = newDrawable(getDrawable("select-background"), color)
            selectAcid[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), color)
            selectAcid[hue].font = defaultFont
            selectAcid[hue].fontColor = color
        
            progressAcid[hue].background = newDrawable(getDrawable("progress-background"), color)
            progressAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), color)
            progressAcid[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), color)
            progressAcid[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), color)
        
            sliderAcid[hue].knob = newDrawable(getDrawable("slider-knob"), color)
            sliderAcid[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), color)
            sliderAcid[hue].background = newDrawable(getDrawable("progress-background"), color)
            sliderAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), color)
        
            windowAcid[hue].background = newDrawable(getDrawable("window-background"), color)
            windowAcid[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), color)
            windowAcid[hue].titleFont = defaultFont
            windowAcid[hue].titleFontColor = color
        
            tpadAcid[hue].background = newDrawable(getDrawable("touchpad-background"), color)
            tpadAcid[hue].knob = newDrawable(getDrawable("touchpad-knob"), color)
        
            dialogAcid[hue].background = newDrawable(getDrawable("window-background"), color)
            dialogAcid[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), color)
            dialogAcid[hue].titleFont = defaultFont
            dialogAcid[hue].titleFontColor = color
            
            add("hue${hue}acid", scrollAcid[hue])
            add("hue${hue}acid", splitAcid[hue])
            add("hue${hue}acid", treeAcid[hue])
            add("hue${hue}acid", labelAcid[hue])
            add("hue${hue}acid", buttonAcid[hue])
            add("hue${hue}acid", tbuttonAcid[hue])
            add("hue${hue}acid", checkAcid[hue])
            add("hue${hue}acid", tfieldAcid[hue])
            add("hue${hue}acid", tareaAcid[hue])
            add("hue${hue}acid", listAcid[hue])
            add("hue${hue}acid", selectAcid[hue])
            add("hue${hue}acid", progressAcid[hue])
            add("hue${hue}acid", sliderAcid[hue])
            add("hue${hue}acid", windowAcid[hue])
            add("hue${hue}acid", tpadAcid[hue])
            add("hue${hue}acid", dialogAcid[hue])
        
        }
    
        /*sun*/
        for (hue in 0..100){
            val color = cbox.sun.color(hue)
        
            scrollSun[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), color)
            scrollSun[hue].vScroll = newDrawable(getDrawable("vscroll"), color)
            scrollSun[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), color)
            scrollSun[hue].hScroll = newDrawable(getDrawable("hscroll"), color)
        
            splitSun[hue].handle = newDrawable(getDrawable("splitpane"), color)
        
            treeSun[hue].minus = newDrawable(getDrawable("tree-minus"), color)
            treeSun[hue].plus = newDrawable(getDrawable("tree-plus"), color)
            treeSun[hue].background = newDrawable(getDrawable("tree-background"), color)
            treeSun[hue].selection = newDrawable(getDrawable("tree-selection"), color)
        
            labelSun[hue].background = newDrawable(getDrawable("label-background"), color)
            labelSun[hue].font = defaultFont
            labelSun[hue].fontColor = color
        
            buttonSun[hue].up = newDrawable(getDrawable("button-up"), color)
            buttonSun[hue].down = newDrawable(getDrawable("button-down"), color)
            buttonSun[hue].checked = newDrawable(getDrawable("button-checked"), color)
            buttonSun[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
        
            tbuttonSun[hue].up = newDrawable(getDrawable("button-up"), color)
            tbuttonSun[hue].down = newDrawable(getDrawable("button-down"), color)
            tbuttonSun[hue].checked = newDrawable(getDrawable("button-checked"), color)
            tbuttonSun[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
            tbuttonSun[hue].font = defaultFont
            tbuttonSun[hue].fontColor = color
        
            checkSun[hue].checkboxOn = newDrawable(getDrawable("check-on"), color)
            checkSun[hue].checkboxOff = newDrawable(getDrawable("check-off"), color)
            checkSun[hue].disabled = newDrawable(getDrawable("check-disabled"), color)
            checkSun[hue].font = defaultFont
            checkSun[hue].fontColor = color
        
            tfieldSun[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tfieldSun[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tfieldSun[hue].background = newDrawable(getDrawable("textfield-background"), color)
            tfieldSun[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), color)
            tfieldSun[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), color)
            tfieldSun[hue].font = defaultFont
            tfieldSun[hue].fontColor = color
        
            tareaSun[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tareaSun[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tareaSun[hue].background = newDrawable(getDrawable("textfield-background"), color)
            tareaSun[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), color)
            tareaSun[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), color)
            tareaSun[hue].font = defaultFont
            tareaSun[hue].fontColor = color
        
            listSun[hue].background = newDrawable(getDrawable("list-background"), color)
            listSun[hue].selection = newDrawable(getDrawable("list-selection"), color)
            listSun[hue].down = newDrawable(getDrawable("list-down"), color)
            listSun[hue].font = defaultFont
            listSun[hue].fontColorSelected = color
            listSun[hue].fontColorUnselected = color
        
            selectSun[hue].listStyle = listSun[hue]
            selectSun[hue].scrollStyle = scrollSun[hue]
            selectSun[hue].background = newDrawable(getDrawable("select-background"), color)
            selectSun[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), color)
            selectSun[hue].font = defaultFont
            selectSun[hue].fontColor = color
        
            progressSun[hue].background = newDrawable(getDrawable("progress-background"), color)
            progressSun[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), color)
            progressSun[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), color)
            progressSun[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), color)
        
            sliderSun[hue].knob = newDrawable(getDrawable("slider-knob"), color)
            sliderSun[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), color)
            sliderSun[hue].background = newDrawable(getDrawable("progress-background"), color)
            sliderSun[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), color)
        
            windowSun[hue].background = newDrawable(getDrawable("window-background"), color)
            windowSun[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), color)
            windowSun[hue].titleFont = defaultFont
            windowSun[hue].titleFontColor = color
        
            tpadSun[hue].background = newDrawable(getDrawable("touchpad-background"), color)
            tpadSun[hue].knob = newDrawable(getDrawable("touchpad-knob"), color)
        
            dialogSun[hue].background = newDrawable(getDrawable("window-background"), color)
            dialogSun[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), color)
            dialogSun[hue].titleFont = defaultFont
            dialogSun[hue].titleFontColor = color
        
            add("hue${hue}sun", scrollSun[hue])
            add("hue${hue}sun", splitSun[hue])
            add("hue${hue}sun", treeSun[hue])
            add("hue${hue}sun", labelSun[hue])
            add("hue${hue}sun", buttonSun[hue])
            add("hue${hue}sun", tbuttonSun[hue])
            add("hue${hue}sun", checkSun[hue])
            add("hue${hue}sun", tfieldSun[hue])
            add("hue${hue}sun", tareaSun[hue])
            add("hue${hue}sun", listSun[hue])
            add("hue${hue}sun", selectSun[hue])
            add("hue${hue}sun", progressSun[hue])
            add("hue${hue}sun", sliderSun[hue])
            add("hue${hue}sun", windowSun[hue])
            add("hue${hue}sun", tpadSun[hue])
            add("hue${hue}sun", dialogSun[hue])
        
        }
        
        /*2020-11-16 new stuff*/
        /*textSun*/
        for (hue in 0..100){
            val pairColor = cbox.sun.colorPair(hue)
            val color = pairColor[0]
            val bcolor = pairColor[1]
            
            scrollTextSun[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), color)
            scrollTextSun[hue].vScroll = newDrawable(getDrawable("vscroll"), color)
            scrollTextSun[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), color)
            scrollTextSun[hue].hScroll = newDrawable(getDrawable("hscroll"), color)
        
            splitTextSun[hue].handle = newDrawable(getDrawable("splitpane"), color)
        
            treeTextSun[hue].minus = newDrawable(getDrawable("tree-minus"), color)
            treeTextSun[hue].plus = newDrawable(getDrawable("tree-plus"), color)
            treeTextSun[hue].background = newDrawable(getDrawable("tree-background"), bcolor)
            treeTextSun[hue].selection = newDrawable(getDrawable("tree-selection"), bcolor)
        
            labelTextSun[hue].background = newDrawable(getDrawable("label-background"), bcolor)
            labelTextSun[hue].font = defaultFont
            labelTextSun[hue].fontColor = color
        
            buttonTextSun[hue].up = newDrawable(getDrawable("button-up"), bcolor)
            buttonTextSun[hue].down = newDrawable(getDrawable("button-down"), color)
            buttonTextSun[hue].checked = newDrawable(getDrawable("button-checked"), color)
            buttonTextSun[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
        
            tbuttonTextSun[hue].up = newDrawable(getDrawable("button-up"), bcolor)
            tbuttonTextSun[hue].down = newDrawable(getDrawable("button-down"), color)
            tbuttonTextSun[hue].checked = newDrawable(getDrawable("button-checked"), color)
            tbuttonTextSun[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
            tbuttonTextSun[hue].font = defaultFont
            tbuttonTextSun[hue].fontColor = color
        
            checkTextSun[hue].checkboxOn = newDrawable(getDrawable("check-on"), color)
            checkTextSun[hue].checkboxOff = newDrawable(getDrawable("check-off"), bcolor)
            checkTextSun[hue].disabled = newDrawable(getDrawable("check-disabled"), bcolor)
            checkTextSun[hue].font = defaultFont
            checkTextSun[hue].fontColor = color
        
            tfieldTextSun[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tfieldTextSun[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tfieldTextSun[hue].background = newDrawable(getDrawable("textfield-background"), bcolor)
            tfieldTextSun[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), bcolor)
            tfieldTextSun[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), bcolor)
            tfieldTextSun[hue].font = defaultFont
            tfieldTextSun[hue].fontColor = color
        
            tareaTextSun[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tareaTextSun[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tareaTextSun[hue].background = newDrawable(getDrawable("textfield-background"), bcolor)
            tareaTextSun[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), bcolor)
            tareaTextSun[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), bcolor)
            tareaTextSun[hue].font = defaultFont
            tareaTextSun[hue].fontColor = color
        
            listTextSun[hue].background = newDrawable(getDrawable("list-background"), bcolor)
            listTextSun[hue].selection = newDrawable(getDrawable("list-selection"), color)
            listTextSun[hue].down = newDrawable(getDrawable("list-down"), color)
            listTextSun[hue].font = defaultFont
            listTextSun[hue].fontColorSelected = color
            listTextSun[hue].fontColorUnselected = color
        
            selectTextSun[hue].listStyle = listTextSun[hue]
            selectTextSun[hue].scrollStyle = scrollTextSun[hue]
            selectTextSun[hue].background = newDrawable(getDrawable("select-background"), bcolor)
            selectTextSun[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), bcolor)
            selectTextSun[hue].font = defaultFont
            selectTextSun[hue].fontColor = color
        
            progressTextSun[hue].background = newDrawable(getDrawable("progress-background"), bcolor)
            progressTextSun[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), bcolor)
            progressTextSun[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), color)
            progressTextSun[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), color)
        
            sliderTextSun[hue].knob = newDrawable(getDrawable("slider-knob"), color)
            sliderTextSun[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), color)
            sliderTextSun[hue].background = newDrawable(getDrawable("progress-background"), bcolor)
            sliderTextSun[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), bcolor)
        
            windowTextSun[hue].background = newDrawable(getDrawable("window-background"), bcolor)
            windowTextSun[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), bcolor)
            windowTextSun[hue].titleFont = defaultFont
            windowTextSun[hue].titleFontColor = color
        
            tpadTextSun[hue].background = newDrawable(getDrawable("touchpad-background"), bcolor)
            tpadTextSun[hue].knob = newDrawable(getDrawable("touchpad-knob"), color)
        
            dialogTextSun[hue].background = newDrawable(getDrawable("window-background"), bcolor)
            dialogTextSun[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), bcolor)
            dialogTextSun[hue].titleFont = defaultFont
            dialogTextSun[hue].titleFontColor = color
        
            add("text${hue}sun", scrollTextSun[hue])
            add("text${hue}sun", splitTextSun[hue])
            add("text${hue}sun", treeTextSun[hue])
            add("text${hue}sun", labelTextSun[hue])
            add("text${hue}sun", buttonTextSun[hue])
            add("text${hue}sun", tbuttonTextSun[hue])
            add("text${hue}sun", checkTextSun[hue])
            add("text${hue}sun", tfieldTextSun[hue])
            add("text${hue}sun", tareaTextSun[hue])
            add("text${hue}sun", listTextSun[hue])
            add("text${hue}sun", selectTextSun[hue])
            add("text${hue}sun", progressTextSun[hue])
            add("text${hue}sun", sliderTextSun[hue])
            add("text${hue}sun", windowTextSun[hue])
            add("text${hue}sun", tpadTextSun[hue])
            add("text${hue}sun", dialogTextSun[hue])
        
        }
        
        /*default*/
        defaultTextSun() /*short name binded to text sun scheme*/
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
    
}