package colorstepskin

fun createDarkStyle(css:ColorStepSkin){
    css.apply {
    
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
    
        /*2020-11-16 new stuff*/
        /*textDark*/
        for (hue in 0..100){
            val pairColor = cbox.dark.colorPair(hue)
            val color = pairColor[0]
            val bcolor = pairColor[1]
        
            scrollTextDark[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), color)
            scrollTextDark[hue].vScroll = newDrawable(getDrawable("vscroll"), color)
            scrollTextDark[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), color)
            scrollTextDark[hue].hScroll = newDrawable(getDrawable("hscroll"), color)
        
            splitTextDark[hue].handle = newDrawable(getDrawable("splitpane"), color)
        
            treeTextDark[hue].minus = newDrawable(getDrawable("tree-minus"), color)
            treeTextDark[hue].plus = newDrawable(getDrawable("tree-plus"), color)
            treeTextDark[hue].background = newDrawable(getDrawable("tree-background"), bcolor)
            treeTextDark[hue].selection = newDrawable(getDrawable("tree-selection"), bcolor)
        
            labelTextDark[hue].background = newDrawable(getDrawable("label-background"), bcolor)
            labelTextDark[hue].font = defaultFont
            labelTextDark[hue].fontColor = color
        
            buttonTextDark[hue].up = newDrawable(getDrawable("button-up"), bcolor)
            buttonTextDark[hue].down = newDrawable(getDrawable("button-down"), color)
            buttonTextDark[hue].checked = newDrawable(getDrawable("button-checked"), color)
            buttonTextDark[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
        
            tbuttonTextDark[hue].up = newDrawable(getDrawable("button-up"), bcolor)
            tbuttonTextDark[hue].down = newDrawable(getDrawable("button-down"), color)
            tbuttonTextDark[hue].checked = newDrawable(getDrawable("button-checked"), color)
            tbuttonTextDark[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
            tbuttonTextDark[hue].font = defaultFont
            tbuttonTextDark[hue].fontColor = color
        
            checkTextDark[hue].checkboxOn = newDrawable(getDrawable("check-on"), color)
            checkTextDark[hue].checkboxOff = newDrawable(getDrawable("check-off"), bcolor)
            checkTextDark[hue].disabled = newDrawable(getDrawable("check-disabled"), bcolor)
            checkTextDark[hue].font = defaultFont
            checkTextDark[hue].fontColor = color
        
            tfieldTextDark[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tfieldTextDark[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tfieldTextDark[hue].background = newDrawable(getDrawable("textfield-background"), bcolor)
            tfieldTextDark[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), bcolor)
            tfieldTextDark[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), bcolor)
            tfieldTextDark[hue].font = defaultFont
            tfieldTextDark[hue].fontColor = color
        
            tareaTextDark[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tareaTextDark[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tareaTextDark[hue].background = newDrawable(getDrawable("textfield-background"), bcolor)
            tareaTextDark[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), bcolor)
            tareaTextDark[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), bcolor)
            tareaTextDark[hue].font = defaultFont
            tareaTextDark[hue].fontColor = color
        
            listTextDark[hue].background = newDrawable(getDrawable("list-background"), bcolor)
            listTextDark[hue].selection = newDrawable(getDrawable("list-selection"), color)
            listTextDark[hue].down = newDrawable(getDrawable("list-down"), color)
            listTextDark[hue].font = defaultFont
            listTextDark[hue].fontColorSelected = color
            listTextDark[hue].fontColorUnselected = color
        
            selectTextDark[hue].listStyle = listTextDark[hue]
            selectTextDark[hue].scrollStyle = scrollTextDark[hue]
            selectTextDark[hue].background = newDrawable(getDrawable("select-background"), bcolor)
            selectTextDark[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), bcolor)
            selectTextDark[hue].font = defaultFont
            selectTextDark[hue].fontColor = color
        
            progressTextDark[hue].background = newDrawable(getDrawable("progress-background"), bcolor)
            progressTextDark[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), bcolor)
            progressTextDark[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), color)
            progressTextDark[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), color)
        
            sliderTextDark[hue].knob = newDrawable(getDrawable("slider-knob"), color)
            sliderTextDark[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), color)
            sliderTextDark[hue].background = newDrawable(getDrawable("progress-background"), bcolor)
            sliderTextDark[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), bcolor)
        
            windowTextDark[hue].background = newDrawable(getDrawable("window-background"), bcolor)
            windowTextDark[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), bcolor)
            windowTextDark[hue].titleFont = defaultFont
            windowTextDark[hue].titleFontColor = color
        
            tpadTextDark[hue].background = newDrawable(getDrawable("touchpad-background"), bcolor)
            tpadTextDark[hue].knob = newDrawable(getDrawable("touchpad-knob"), color)
        
            dialogTextDark[hue].background = newDrawable(getDrawable("window-background"), bcolor)
            dialogTextDark[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), bcolor)
            dialogTextDark[hue].titleFont = defaultFont
            dialogTextDark[hue].titleFontColor = color
        
            add("text${hue}dark", scrollTextDark[hue])
            add("text${hue}dark", splitTextDark[hue])
            add("text${hue}dark", treeTextDark[hue])
            add("text${hue}dark", labelTextDark[hue])
            add("text${hue}dark", buttonTextDark[hue])
            add("text${hue}dark", tbuttonTextDark[hue])
            add("text${hue}dark", checkTextDark[hue])
            add("text${hue}dark", tfieldTextDark[hue])
            add("text${hue}dark", tareaTextDark[hue])
            add("text${hue}dark", listTextDark[hue])
            add("text${hue}dark", selectTextDark[hue])
            add("text${hue}dark", progressTextDark[hue])
            add("text${hue}dark", sliderTextDark[hue])
            add("text${hue}dark", windowTextDark[hue])
            add("text${hue}dark", tpadTextDark[hue])
            add("text${hue}dark", dialogTextDark[hue])
        
        }
    
        /*fonDark*/
        for (hue in 0..100){
            val pairColor = cbox.dark.colorPair(hue)
            val color = pairColor[1]
            val bcolor = pairColor[0]
        
            scrollFonDark[hue].vScrollKnob = newDrawable(getDrawable("inverted-vscrollknob"), color)
            scrollFonDark[hue].vScroll = newDrawable(getDrawable("inverted-vscroll"), color)
            scrollFonDark[hue].hScrollKnob = newDrawable(getDrawable("inverted-hscrollknob"), color)
            scrollFonDark[hue].hScroll = newDrawable(getDrawable("inverted-hscroll"), color)
        
            splitFonDark[hue].handle = newDrawable(getDrawable("inverted-splitpane"), bcolor)
        
            treeFonDark[hue].minus = newDrawable(getDrawable("inverted-tree-minus"), color)
            treeFonDark[hue].plus = newDrawable(getDrawable("inverted-tree-plus"), color)
            treeFonDark[hue].background = newDrawable(getDrawable("inverted-tree-background"), bcolor)
            treeFonDark[hue].selection = newDrawable(getDrawable("inverted-tree-selection"), bcolor)
        
            labelFonDark[hue].background = newDrawable(getDrawable("inverted-label-background"), bcolor)
            labelFonDark[hue].font = defaultFontFon
            labelFonDark[hue].fontColor = color
        
            buttonFonDark[hue].up = newDrawable(getDrawable("inverted-button-up"), bcolor)
            buttonFonDark[hue].down = newDrawable(getDrawable("inverted-button-down"), color)
            buttonFonDark[hue].checked = newDrawable(getDrawable("inverted-button-checked"), color)
            buttonFonDark[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), color)
        
            tbuttonFonDark[hue].up = newDrawable(getDrawable("inverted-button-up"), bcolor)
            tbuttonFonDark[hue].down = newDrawable(getDrawable("inverted-button-down"), color)
            tbuttonFonDark[hue].checked = newDrawable(getDrawable("inverted-button-checked"), color)
            tbuttonFonDark[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), color)
            tbuttonFonDark[hue].font = defaultFontFon
            tbuttonFonDark[hue].fontColor = color
        
            checkFonDark[hue].checkboxOn = newDrawable(getDrawable("inverted-check-on"), color)
            checkFonDark[hue].checkboxOff = newDrawable(getDrawable("inverted-check-off"), bcolor)
            checkFonDark[hue].disabled = newDrawable(getDrawable("inverted-check-disabled"), bcolor)
            checkFonDark[hue].font = defaultFontFon
            checkFonDark[hue].fontColor = color
        
            tfieldFonDark[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), color)
            tfieldFonDark[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), color)
            tfieldFonDark[hue].background = newDrawable(getDrawable("inverted-textfield-background"), bcolor)
            tfieldFonDark[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), bcolor)
            tfieldFonDark[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), bcolor)
            tfieldFonDark[hue].font = defaultFontFon
            tfieldFonDark[hue].fontColor = color
        
            tareaFonDark[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), color)
            tareaFonDark[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), color)
            tareaFonDark[hue].background = newDrawable(getDrawable("inverted-textfield-background"), bcolor)
            tareaFonDark[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), bcolor)
            tareaFonDark[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), bcolor)
            tareaFonDark[hue].font = defaultFontFon
            tareaFonDark[hue].fontColor = color
        
            listFonDark[hue].background = newDrawable(getDrawable("inverted-list-background"), bcolor)
            listFonDark[hue].selection = newDrawable(getDrawable("inverted-list-selection"), color)
            listFonDark[hue].down = newDrawable(getDrawable("inverted-list-down"), color)
            listFonDark[hue].font = defaultFontFon
            listFonDark[hue].fontColorSelected = color
            listFonDark[hue].fontColorUnselected = color
        
            selectFonDark[hue].listStyle = listFonDark[hue]
            selectFonDark[hue].scrollStyle = scrollFonDark[hue]
            selectFonDark[hue].background = newDrawable(getDrawable("inverted-select-background"), bcolor)
            selectFonDark[hue].backgroundDisabled = newDrawable(getDrawable("inverted-select-disabled"), bcolor)
            selectFonDark[hue].font = defaultFontFon
            selectFonDark[hue].fontColor = color
        
            progressFonDark[hue].background = newDrawable(getDrawable("inverted-progress-background"), bcolor)
            progressFonDark[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), bcolor)
            progressFonDark[hue].knobBefore = newDrawable(getDrawable("inverted-progress-knobbefore"), color)
            progressFonDark[hue].disabledKnobBefore = newDrawable(getDrawable("inverted-progress-disabledknobbefore"), color)
        
            sliderFonDark[hue].knob = newDrawable(getDrawable("inverted-slider-knob"), color)
            sliderFonDark[hue].disabledKnob = newDrawable(getDrawable("inverted-slider-disabledknob"), color)
            sliderFonDark[hue].background = newDrawable(getDrawable("inverted-progress-background"), bcolor)
            sliderFonDark[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), bcolor)
        
            windowFonDark[hue].background = newDrawable(getDrawable("inverted-window-background"), bcolor)
            windowFonDark[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), bcolor)
            windowFonDark[hue].titleFont = defaultFontFon
            windowFonDark[hue].titleFontColor = color
        
            tpadFonDark[hue].background = newDrawable(getDrawable("inverted-touchpad-background"), color)
            tpadFonDark[hue].knob = newDrawable(getDrawable("inverted-touchpad-knob"), bcolor)
        
            dialogFonDark[hue].background = newDrawable(getDrawable("inverted-window-background"), bcolor)
            dialogFonDark[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), bcolor)
            dialogFonDark[hue].titleFont = defaultFontFon
            dialogFonDark[hue].titleFontColor = color
        
            add("fon${hue}dark", scrollFonDark[hue])
            add("fon${hue}dark", splitFonDark[hue])
            add("fon${hue}dark", treeFonDark[hue])
            add("fon${hue}dark", labelFonDark[hue])
            add("fon${hue}dark", buttonFonDark[hue])
            add("fon${hue}dark", tbuttonFonDark[hue])
            add("fon${hue}dark", checkFonDark[hue])
            add("fon${hue}dark", tfieldFonDark[hue])
            add("fon${hue}dark", tareaFonDark[hue])
            add("fon${hue}dark", listFonDark[hue])
            add("fon${hue}dark", selectFonDark[hue])
            add("fon${hue}dark", progressFonDark[hue])
            add("fon${hue}dark", sliderFonDark[hue])
            add("fon${hue}dark", windowFonDark[hue])
            add("fon${hue}dark", tpadFonDark[hue])
            add("fon${hue}dark", dialogFonDark[hue])
        
        }
    
    }
}