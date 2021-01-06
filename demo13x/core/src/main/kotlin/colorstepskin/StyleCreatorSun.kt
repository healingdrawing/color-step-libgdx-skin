package colorstepskin

import com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle

fun createSunStyle(css:ColorStepSkin){
    css.apply {
    
        /*sun*/
        for (hue in 0..100){
            val hueL = cbox.sun.colorPair(hue)[0]//light hue based
            val hueD = cbox.sun.colorPair(hue, true)[0]//dark hue based
//            val opoL = cbox.sun.colorPair(hue)[1]//light oposite
//            val opoD = cbox.sun.colorPair(hue, true)[1]//dark oposite
    
            scrollSun[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), hueL)
            scrollSun[hue].vScroll = newDrawable(getDrawable("vscroll"), hueL)
            scrollSun[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), hueL)
            scrollSun[hue].hScroll = newDrawable(getDrawable("hscroll"), hueL)
        
            splitSun[hue].handle = newDrawable(getDrawable("splitpane"), hueL)
        
            treeSun[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeSun[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeSun[hue].background = newDrawable(getDrawable("tree-background"), hueL)
            treeSun[hue].selection = newDrawable(getDrawable("tree-selection"), hueL)
        
            labelSun[hue].background = newDrawable(getDrawable("label-background"), hueL)
            labelSun[hue].font = defaultFont
            labelSun[hue].fontColor = hueL
        
            buttonSun[hue].up = newDrawable(getDrawable("button-up"), hueL)
            buttonSun[hue].down = newDrawable(getDrawable("button-down"), hueL)
            buttonSun[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            buttonSun[hue].disabled = newDrawable(getDrawable("button-disabled"), hueL)
        
            tbuttonSun[hue].up = newDrawable(getDrawable("button-up"), hueL)
            tbuttonSun[hue].down = newDrawable(getDrawable("button-down"), hueL)
            tbuttonSun[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            tbuttonSun[hue].disabled = newDrawable(getDrawable("button-disabled"), hueL)
            tbuttonSun[hue].font = defaultFont
            tbuttonSun[hue].fontColor = hueL
        
            checkSun[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkSun[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkSun[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), hueD)
            checkSun[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), hueD)
            checkSun[hue].font = defaultFont
            checkSun[hue].fontColor = hueL
        
            tfieldSun[hue].cursor = newDrawable(getDrawable("textfield-cursor"), hueL)
            tfieldSun[hue].selection = newDrawable(getDrawable("textfield-selection"), hueL)
            tfieldSun[hue].background = newDrawable(getDrawable("textfield-background"), hueL)
            tfieldSun[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), hueL)
            tfieldSun[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), hueL)
            tfieldSun[hue].font = defaultFont
            tfieldSun[hue].fontColor = hueL
        
            tareaSun[hue] = tfieldSun[hue]
        
            listSun[hue].background = newDrawable(getDrawable("list-background"), hueL)
            listSun[hue].selection = newDrawable(getDrawable("list-selection"), hueL)
            listSun[hue].down = newDrawable(getDrawable("list-down"), hueL)
            listSun[hue].font = defaultFont
            listSun[hue].fontColorSelected = hueL
            listSun[hue].fontColorUnselected = hueL
    
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), hueL)
            sls.selection = newDrawable(getDrawable("list-selection"), hueL)
            sls.down = newDrawable(getDrawable("list-down"), hueL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectSun[hue].listStyle = sls
            selectSun[hue].scrollStyle = scrollSun[hue]
            selectSun[hue].background = newDrawable(getDrawable("select-background"), hueL)
            selectSun[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), hueL)
            selectSun[hue].font = defaultFont
            selectSun[hue].fontColor = hueL
        
            progressSun[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            progressSun[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
            progressSun[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressSun[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), hueL)
        
            sliderSun[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderSun[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), hueL)
            sliderSun[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            sliderSun[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
        
            windowSun[hue].background = newDrawable(getDrawable("window-background"), hueL)
            windowSun[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueL)
            windowSun[hue].titleFont = defaultFont
            windowSun[hue].titleFontColor = hueL
        
            tpadSun[hue].background = newDrawable(getDrawable("touchpad-background"), hueL)
            tpadSun[hue].knob = newDrawable(getDrawable("touchpad-knob"), hueL)
        
            dialogSun[hue].background = newDrawable(getDrawable("window-background"), hueL)
            dialogSun[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueL)
            dialogSun[hue].titleFont = defaultFont
            dialogSun[hue].titleFontColor = hueL
        
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
            val hueL = cbox.sun.colorPair(hue)[0]//light hue based
            val opoL = cbox.sun.colorPair(hue)[1]//light oposite
//            val hueD = cbox.sun.colorPair(hue, true)[0]//dark hue based
//            val opoD = cbox.sun.colorPair(hue, true)[1]//dark oposite
            
            scrollTextSun[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), opoL)
            scrollTextSun[hue].vScroll = newDrawable(getDrawable("vscroll"), opoL)
            scrollTextSun[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), opoL)
            scrollTextSun[hue].hScroll = newDrawable(getDrawable("hscroll"), opoL)
        
            splitTextSun[hue].handle = newDrawable(getDrawable("splitpane"), opoL)
        
            treeTextSun[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeTextSun[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeTextSun[hue].background = newDrawable(getDrawable("tree-background"), opoL)
            treeTextSun[hue].selection = newDrawable(getDrawable("tree-selection"), opoL)
        
            labelTextSun[hue].background = newDrawable(getDrawable("label-background"), opoL)
            labelTextSun[hue].font = defaultFont
            labelTextSun[hue].fontColor = hueL
        
            buttonTextSun[hue].up = newDrawable(getDrawable("button-up"), opoL)
            buttonTextSun[hue].down = newDrawable(getDrawable("button-down"), opoL)
            buttonTextSun[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            buttonTextSun[hue].disabled = newDrawable(getDrawable("button-disabled"), opoL)
        
            tbuttonTextSun[hue].up = newDrawable(getDrawable("button-up"), opoL)
            tbuttonTextSun[hue].down = newDrawable(getDrawable("button-down"), opoL)
            tbuttonTextSun[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            tbuttonTextSun[hue].disabled = newDrawable(getDrawable("button-disabled"), opoL)
            tbuttonTextSun[hue].font = defaultFont
            tbuttonTextSun[hue].fontColor = hueL
            tbuttonTextSun[hue].disabledFontColor = opoL
    
            checkTextSun[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkTextSun[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkTextSun[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), opoL)
            checkTextSun[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), opoL)
            checkTextSun[hue].font = defaultFont
            checkTextSun[hue].fontColor = hueL
            checkTextSun[hue].disabledFontColor = opoL
        
            tfieldTextSun[hue].cursor = newDrawable(getDrawable("textfield-cursor"), opoL)
            tfieldTextSun[hue].selection = newDrawable(getDrawable("textfield-selection"), opoL)
            tfieldTextSun[hue].background = newDrawable(getDrawable("textfield-background"), opoL)
            tfieldTextSun[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), opoL)
            tfieldTextSun[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), opoL)
            tfieldTextSun[hue].font = defaultFont
            tfieldTextSun[hue].fontColor = hueL
            tfieldTextSun[hue].disabledFontColor = opoL
        
            tareaTextSun[hue] = tfieldTextSun[hue]
        
            listTextSun[hue].background = newDrawable(getDrawable("list-background"), opoL)
            listTextSun[hue].selection = newDrawable(getDrawable("list-selection"), opoL)
            listTextSun[hue].down = newDrawable(getDrawable("list-down"), opoL)
            listTextSun[hue].font = defaultFont
            listTextSun[hue].fontColorSelected = hueL
            listTextSun[hue].fontColorUnselected = hueL
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), opoL)
            sls.selection = newDrawable(getDrawable("list-selection"), opoL)
            sls.down = newDrawable(getDrawable("list-down"), opoL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectTextSun[hue].listStyle = sls
            selectTextSun[hue].scrollStyle = scrollTextSun[hue]
            selectTextSun[hue].background = newDrawable(getDrawable("select-background"), opoL)
            selectTextSun[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), opoL)
            selectTextSun[hue].font = defaultFont
            selectTextSun[hue].fontColor = hueL
            selectTextSun[hue].disabledFontColor = opoL
        
            progressTextSun[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            progressTextSun[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            progressTextSun[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressTextSun[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), opoL)
            
            sliderTextSun[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderTextSun[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), opoL)
            sliderTextSun[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            sliderTextSun[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            
            windowTextSun[hue].background = newDrawable(getDrawable("window-background"), opoL)
            windowTextSun[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), opoL)
            windowTextSun[hue].titleFont = defaultFont
            windowTextSun[hue].titleFontColor = hueL
            
            dialogTextSun[hue] = windowTextSun[hue]
        
            tpadTextSun[hue].background = newDrawable(getDrawable("touchpad-background"), opoL)
            tpadTextSun[hue].knob = newDrawable(getDrawable("touchpad-knob"), opoL)
            
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
    
        /*fonSun*/
        for (hue in 0..100){
            val opoD = cbox.sun.colorPair(hue, true)[1]//dark oposite
            val hueL = cbox.sun.colorPair(hue)[0]//light hue based
            val hueD = cbox.sun.colorPair(hue, true)[0]//dark hue based
            val opoL = cbox.sun.colorPair(hue)[1]//light oposite
            
            scrollFonSun[hue].vScrollKnob = newDrawable(getDrawable("inverted-vscrollknob"), opoD)
            scrollFonSun[hue].vScroll = newDrawable(getDrawable("inverted-vscroll"), opoD)
            scrollFonSun[hue].hScrollKnob = newDrawable(getDrawable("inverted-hscrollknob"), opoD)
            scrollFonSun[hue].hScroll = newDrawable(getDrawable("inverted-hscroll"), opoD)
        
            splitFonSun[hue].handle = newDrawable(getDrawable("inverted-splitpane"), hueL)
        
            treeFonSun[hue].minus = newDrawable(getDrawable("inverted-tree-minus"), opoD)
            treeFonSun[hue].plus = newDrawable(getDrawable("inverted-tree-plus"), opoD)
            treeFonSun[hue].background = newDrawable(getDrawable("inverted-tree-background"), hueL)
            treeFonSun[hue].selection = newDrawable(getDrawable("inverted-tree-selection"), hueL)
        
            labelFonSun[hue].background = newDrawable(getDrawable("inverted-label-background"), hueL)
            labelFonSun[hue].font = defaultFontFon
            labelFonSun[hue].fontColor = opoD
        
            buttonFonSun[hue].up = newDrawable(getDrawable("inverted-button-up"), hueL)
            buttonFonSun[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            buttonFonSun[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            buttonFonSun[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
        
            tbuttonFonSun[hue].up = newDrawable(getDrawable("inverted-button-up"), hueL)
            tbuttonFonSun[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            tbuttonFonSun[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            tbuttonFonSun[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
            tbuttonFonSun[hue].font = defaultFontFon
            tbuttonFonSun[hue].fontColor = opoD
        
            checkFonSun[hue].checkboxOn = newDrawable(getDrawable("inverted-check-on"), opoD)
            checkFonSun[hue].checkboxOff = newDrawable(getDrawable("inverted-check-off"), opoD)
            checkFonSun[hue].checkboxOffDisabled = newDrawable(getDrawable("inverted-check-off"), hueL)
            checkFonSun[hue].checkboxOnDisabled = newDrawable(getDrawable("inverted-check-on"), hueL)
            checkFonSun[hue].font = defaultFontFon
            checkFonSun[hue].fontColor = opoD
            checkFonSun[hue].disabledFontColor = hueL
            
            tfieldFonSun[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), opoD)
            tfieldFonSun[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), opoL)
            tfieldFonSun[hue].background = newDrawable(getDrawable("inverted-textfield-background"), hueL)
            tfieldFonSun[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), hueL)
            tfieldFonSun[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), hueL)
            tfieldFonSun[hue].font = defaultFontFon
            tfieldFonSun[hue].fontColor = opoD
            /*because style class is same and inside Skin.add() next just override previous. And there is some shit inside,
            * because if no bottom syntax for textarea style , in time of creation textfield app crushed, looks like textfield use
            * textarea style but this style class named as TextFieldStyle etc , not sure. muddy place , but work finally*/
            tareaFonSun[hue] = tfieldFonSun[hue]
        
            listFonSun[hue].background = newDrawable(getDrawable("inverted-list-background"), hueL)
            listFonSun[hue].selection = newDrawable(getDrawable("inverted-list-selection"), hueL)
            listFonSun[hue].down = newDrawable(getDrawable("inverted-list-down"), hueL)
            listFonSun[hue].font = defaultFontFon
            listFonSun[hue].fontColorSelected = opoD
            listFonSun[hue].fontColorUnselected = opoD
        
            selectFonSun[hue].listStyle = listFonSun[hue]
            selectFonSun[hue].scrollStyle = scrollFonSun[hue]
            selectFonSun[hue].background = newDrawable(getDrawable("inverted-select-background"), hueL)
            selectFonSun[hue].backgroundDisabled = newDrawable(getDrawable("inverted-select-disabled"), hueL)
            selectFonSun[hue].font = defaultFontFon
            selectFonSun[hue].fontColor = opoD
        
            progressFonSun[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueL)
            progressFonSun[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
            progressFonSun[hue].knobBefore = newDrawable(getDrawable("inverted-progress-knobbefore"), opoD)
            progressFonSun[hue].disabledKnobBefore = newDrawable(getDrawable("inverted-progress-disabledknobbefore"), hueL)
        
            sliderFonSun[hue].knob = newDrawable(getDrawable("inverted-slider-knob"), opoD)
            sliderFonSun[hue].disabledKnob = newDrawable(getDrawable("inverted-slider-disabledknob"), hueL)
            sliderFonSun[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueL)
            sliderFonSun[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
        
            windowFonSun[hue].background = newDrawable(getDrawable("inverted-window-background"), hueL)
            windowFonSun[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), hueL)
            windowFonSun[hue].titleFont = defaultFontFon
            windowFonSun[hue].titleFontColor = opoD
            /*same shit as for textfield, window widget use dialog widget style which class name is WindowStyle*/
            dialogFonSun[hue] = windowFonSun[hue]
        
            tpadFonSun[hue].background = newDrawable(getDrawable("inverted-touchpad-background"), hueL)
            tpadFonSun[hue].knob = newDrawable(getDrawable("inverted-touchpad-knob"), hueD)
            
            add("fon${hue}sun", scrollFonSun[hue])
            add("fon${hue}sun", splitFonSun[hue])
            add("fon${hue}sun", treeFonSun[hue])
            add("fon${hue}sun", labelFonSun[hue])
            add("fon${hue}sun", buttonFonSun[hue])
            add("fon${hue}sun", tbuttonFonSun[hue])
            add("fon${hue}sun", checkFonSun[hue])
            add("fon${hue}sun", tfieldFonSun[hue])
            add("fon${hue}sun", tareaFonSun[hue])
            add("fon${hue}sun", listFonSun[hue])
            add("fon${hue}sun", selectFonSun[hue])
            add("fon${hue}sun", progressFonSun[hue])
            add("fon${hue}sun", sliderFonSun[hue])
            add("fon${hue}sun", windowFonSun[hue])
            add("fon${hue}sun", tpadFonSun[hue])
            add("fon${hue}sun", dialogFonSun[hue])
        
        }
    
    }
}