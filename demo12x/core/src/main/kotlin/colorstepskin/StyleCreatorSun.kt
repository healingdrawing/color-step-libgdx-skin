package colorstepskin

fun createSunStyle(css:ColorStepSkin){
    css.apply {
    
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
    
        /*fonSun*/
        for (hue in 0..100){
            val pairColor = cbox.sun.colorPair(hue)
            val color = pairColor[1]
            val bcolor = pairColor[0]
        
            scrollFonSun[hue].vScrollKnob = newDrawable(getDrawable("inverted-vscrollknob"), color)
            scrollFonSun[hue].vScroll = newDrawable(getDrawable("inverted-vscroll"), color)
            scrollFonSun[hue].hScrollKnob = newDrawable(getDrawable("inverted-hscrollknob"), color)
            scrollFonSun[hue].hScroll = newDrawable(getDrawable("inverted-hscroll"), color)
        
            splitFonSun[hue].handle = newDrawable(getDrawable("inverted-splitpane"), bcolor)
        
            treeFonSun[hue].minus = newDrawable(getDrawable("inverted-tree-minus"), color)
            treeFonSun[hue].plus = newDrawable(getDrawable("inverted-tree-plus"), color)
            treeFonSun[hue].background = newDrawable(getDrawable("inverted-tree-background"), bcolor)
            treeFonSun[hue].selection = newDrawable(getDrawable("inverted-tree-selection"), bcolor)
        
            labelFonSun[hue].background = newDrawable(getDrawable("inverted-label-background"), bcolor)
            labelFonSun[hue].font = defaultFontFon
            labelFonSun[hue].fontColor = color
        
            buttonFonSun[hue].up = newDrawable(getDrawable("inverted-button-up"), bcolor)
            buttonFonSun[hue].down = newDrawable(getDrawable("inverted-button-down"), color)
            buttonFonSun[hue].checked = newDrawable(getDrawable("inverted-button-checked"), color)
            buttonFonSun[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), color)
        
            tbuttonFonSun[hue].up = newDrawable(getDrawable("inverted-button-up"), bcolor)
            tbuttonFonSun[hue].down = newDrawable(getDrawable("inverted-button-down"), color)
            tbuttonFonSun[hue].checked = newDrawable(getDrawable("inverted-button-checked"), color)
            tbuttonFonSun[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), color)
            tbuttonFonSun[hue].font = defaultFontFon
            tbuttonFonSun[hue].fontColor = color
        
            checkFonSun[hue].checkboxOn = newDrawable(getDrawable("inverted-check-on"), color)
            checkFonSun[hue].checkboxOff = newDrawable(getDrawable("inverted-check-off"), bcolor)
            checkFonSun[hue].disabled = newDrawable(getDrawable("inverted-check-disabled"), bcolor)
            checkFonSun[hue].font = defaultFontFon
            checkFonSun[hue].fontColor = color
        
            tfieldFonSun[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), color)
            tfieldFonSun[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), color)
            tfieldFonSun[hue].background = newDrawable(getDrawable("inverted-textfield-background"), bcolor)
            tfieldFonSun[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), bcolor)
            tfieldFonSun[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), bcolor)
            tfieldFonSun[hue].font = defaultFontFon
            tfieldFonSun[hue].fontColor = color
        
            tareaFonSun[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), color)
            tareaFonSun[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), color)
            tareaFonSun[hue].background = newDrawable(getDrawable("inverted-textfield-background"), bcolor)
            tareaFonSun[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), bcolor)
            tareaFonSun[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), bcolor)
            tareaFonSun[hue].font = defaultFontFon
            tareaFonSun[hue].fontColor = color
        
            listFonSun[hue].background = newDrawable(getDrawable("inverted-list-background"), bcolor)
            listFonSun[hue].selection = newDrawable(getDrawable("inverted-list-selection"), color)
            listFonSun[hue].down = newDrawable(getDrawable("inverted-list-down"), color)
            listFonSun[hue].font = defaultFontFon
            listFonSun[hue].fontColorSelected = color
            listFonSun[hue].fontColorUnselected = color
        
            selectFonSun[hue].listStyle = listFonSun[hue]
            selectFonSun[hue].scrollStyle = scrollFonSun[hue]
            selectFonSun[hue].background = newDrawable(getDrawable("inverted-select-background"), bcolor)
            selectFonSun[hue].backgroundDisabled = newDrawable(getDrawable("inverted-select-disabled"), bcolor)
            selectFonSun[hue].font = defaultFontFon
            selectFonSun[hue].fontColor = color
        
            progressFonSun[hue].background = newDrawable(getDrawable("inverted-progress-background"), bcolor)
            progressFonSun[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), bcolor)
            progressFonSun[hue].knobBefore = newDrawable(getDrawable("inverted-progress-knobbefore"), color)
            progressFonSun[hue].disabledKnobBefore = newDrawable(getDrawable("inverted-progress-disabledknobbefore"), color)
        
            sliderFonSun[hue].knob = newDrawable(getDrawable("inverted-slider-knob"), color)
            sliderFonSun[hue].disabledKnob = newDrawable(getDrawable("inverted-slider-disabledknob"), color)
            sliderFonSun[hue].background = newDrawable(getDrawable("inverted-progress-background"), bcolor)
            sliderFonSun[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), bcolor)
        
            windowFonSun[hue].background = newDrawable(getDrawable("inverted-window-background"), bcolor)
            windowFonSun[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), bcolor)
            windowFonSun[hue].titleFont = defaultFontFon
            windowFonSun[hue].titleFontColor = color
        
            tpadFonSun[hue].background = newDrawable(getDrawable("inverted-touchpad-background"), color)
            tpadFonSun[hue].knob = newDrawable(getDrawable("inverted-touchpad-knob"), bcolor)
        
            dialogFonSun[hue].background = newDrawable(getDrawable("inverted-window-background"), bcolor)
            dialogFonSun[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), bcolor)
            dialogFonSun[hue].titleFont = defaultFontFon
            dialogFonSun[hue].titleFontColor = color
        
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