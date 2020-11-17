package colorstepskin

fun createAcidStyle(css:ColorStepSkin){
    css.apply {
    
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
    
        /*2020-11-16 new stuff*/
        /*textAcid*/
        for (hue in 0..100){
            val pairColor = cbox.acid.colorPair(hue)
            val color = pairColor[0]
            val bcolor = pairColor[1]
        
            scrollTextAcid[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), color)
            scrollTextAcid[hue].vScroll = newDrawable(getDrawable("vscroll"), color)
            scrollTextAcid[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), color)
            scrollTextAcid[hue].hScroll = newDrawable(getDrawable("hscroll"), color)
        
            splitTextAcid[hue].handle = newDrawable(getDrawable("splitpane"), color)
        
            treeTextAcid[hue].minus = newDrawable(getDrawable("tree-minus"), color)
            treeTextAcid[hue].plus = newDrawable(getDrawable("tree-plus"), color)
            treeTextAcid[hue].background = newDrawable(getDrawable("tree-background"), bcolor)
            treeTextAcid[hue].selection = newDrawable(getDrawable("tree-selection"), bcolor)
        
            labelTextAcid[hue].background = newDrawable(getDrawable("label-background"), bcolor)
            labelTextAcid[hue].font = defaultFont
            labelTextAcid[hue].fontColor = color
        
            buttonTextAcid[hue].up = newDrawable(getDrawable("button-up"), bcolor)
            buttonTextAcid[hue].down = newDrawable(getDrawable("button-down"), color)
            buttonTextAcid[hue].checked = newDrawable(getDrawable("button-checked"), color)
            buttonTextAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
        
            tbuttonTextAcid[hue].up = newDrawable(getDrawable("button-up"), bcolor)
            tbuttonTextAcid[hue].down = newDrawable(getDrawable("button-down"), color)
            tbuttonTextAcid[hue].checked = newDrawable(getDrawable("button-checked"), color)
            tbuttonTextAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), color)
            tbuttonTextAcid[hue].font = defaultFont
            tbuttonTextAcid[hue].fontColor = color
        
            checkTextAcid[hue].checkboxOn = newDrawable(getDrawable("check-on"), color)
            checkTextAcid[hue].checkboxOff = newDrawable(getDrawable("check-off"), bcolor)
            checkTextAcid[hue].disabled = newDrawable(getDrawable("check-disabled"), bcolor)
            checkTextAcid[hue].font = defaultFont
            checkTextAcid[hue].fontColor = color
        
            tfieldTextAcid[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tfieldTextAcid[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tfieldTextAcid[hue].background = newDrawable(getDrawable("textfield-background"), bcolor)
            tfieldTextAcid[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), bcolor)
            tfieldTextAcid[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), bcolor)
            tfieldTextAcid[hue].font = defaultFont
            tfieldTextAcid[hue].fontColor = color
        
            tareaTextAcid[hue].cursor = newDrawable(getDrawable("textfield-cursor"), color)
            tareaTextAcid[hue].selection = newDrawable(getDrawable("textfield-selection"), color)
            tareaTextAcid[hue].background = newDrawable(getDrawable("textfield-background"), bcolor)
            tareaTextAcid[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), bcolor)
            tareaTextAcid[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), bcolor)
            tareaTextAcid[hue].font = defaultFont
            tareaTextAcid[hue].fontColor = color
        
            listTextAcid[hue].background = newDrawable(getDrawable("list-background"), bcolor)
            listTextAcid[hue].selection = newDrawable(getDrawable("list-selection"), color)
            listTextAcid[hue].down = newDrawable(getDrawable("list-down"), color)
            listTextAcid[hue].font = defaultFont
            listTextAcid[hue].fontColorSelected = color
            listTextAcid[hue].fontColorUnselected = color
        
            selectTextAcid[hue].listStyle = listTextAcid[hue]
            selectTextAcid[hue].scrollStyle = scrollTextAcid[hue]
            selectTextAcid[hue].background = newDrawable(getDrawable("select-background"), bcolor)
            selectTextAcid[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), bcolor)
            selectTextAcid[hue].font = defaultFont
            selectTextAcid[hue].fontColor = color
        
            progressTextAcid[hue].background = newDrawable(getDrawable("progress-background"), bcolor)
            progressTextAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), bcolor)
            progressTextAcid[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), color)
            progressTextAcid[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), color)
        
            sliderTextAcid[hue].knob = newDrawable(getDrawable("slider-knob"), color)
            sliderTextAcid[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), color)
            sliderTextAcid[hue].background = newDrawable(getDrawable("progress-background"), bcolor)
            sliderTextAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), bcolor)
        
            windowTextAcid[hue].background = newDrawable(getDrawable("window-background"), bcolor)
            windowTextAcid[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), bcolor)
            windowTextAcid[hue].titleFont = defaultFont
            windowTextAcid[hue].titleFontColor = color
        
            tpadTextAcid[hue].background = newDrawable(getDrawable("touchpad-background"), bcolor)
            tpadTextAcid[hue].knob = newDrawable(getDrawable("touchpad-knob"), color)
        
            dialogTextAcid[hue].background = newDrawable(getDrawable("window-background"), bcolor)
            dialogTextAcid[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), bcolor)
            dialogTextAcid[hue].titleFont = defaultFont
            dialogTextAcid[hue].titleFontColor = color
        
            add("text${hue}acid", scrollTextAcid[hue])
            add("text${hue}acid", splitTextAcid[hue])
            add("text${hue}acid", treeTextAcid[hue])
            add("text${hue}acid", labelTextAcid[hue])
            add("text${hue}acid", buttonTextAcid[hue])
            add("text${hue}acid", tbuttonTextAcid[hue])
            add("text${hue}acid", checkTextAcid[hue])
            add("text${hue}acid", tfieldTextAcid[hue])
            add("text${hue}acid", tareaTextAcid[hue])
            add("text${hue}acid", listTextAcid[hue])
            add("text${hue}acid", selectTextAcid[hue])
            add("text${hue}acid", progressTextAcid[hue])
            add("text${hue}acid", sliderTextAcid[hue])
            add("text${hue}acid", windowTextAcid[hue])
            add("text${hue}acid", tpadTextAcid[hue])
            add("text${hue}acid", dialogTextAcid[hue])
        
        }
    
        /*fonAcid*/
        for (hue in 0..100){
            val pairColor = cbox.acid.colorPair(hue)
            val color = pairColor[1]
            val bcolor = pairColor[0]
        
            scrollFonAcid[hue].vScrollKnob = newDrawable(getDrawable("inverted-vscrollknob"), color)
            scrollFonAcid[hue].vScroll = newDrawable(getDrawable("inverted-vscroll"), color)
            scrollFonAcid[hue].hScrollKnob = newDrawable(getDrawable("inverted-hscrollknob"), color)
            scrollFonAcid[hue].hScroll = newDrawable(getDrawable("inverted-hscroll"), color)
        
            splitFonAcid[hue].handle = newDrawable(getDrawable("inverted-splitpane"), bcolor)
        
            treeFonAcid[hue].minus = newDrawable(getDrawable("inverted-tree-minus"), color)
            treeFonAcid[hue].plus = newDrawable(getDrawable("inverted-tree-plus"), color)
            treeFonAcid[hue].background = newDrawable(getDrawable("inverted-tree-background"), bcolor)
            treeFonAcid[hue].selection = newDrawable(getDrawable("inverted-tree-selection"), bcolor)
        
            labelFonAcid[hue].background = newDrawable(getDrawable("inverted-label-background"), bcolor)
            labelFonAcid[hue].font = defaultFontFon
            labelFonAcid[hue].fontColor = color
        
            buttonFonAcid[hue].up = newDrawable(getDrawable("inverted-button-up"), bcolor)
            buttonFonAcid[hue].down = newDrawable(getDrawable("inverted-button-down"), color)
            buttonFonAcid[hue].checked = newDrawable(getDrawable("inverted-button-checked"), color)
            buttonFonAcid[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), color)
        
            tbuttonFonAcid[hue].up = newDrawable(getDrawable("inverted-button-up"), bcolor)
            tbuttonFonAcid[hue].down = newDrawable(getDrawable("inverted-button-down"), color)
            tbuttonFonAcid[hue].checked = newDrawable(getDrawable("inverted-button-checked"), color)
            tbuttonFonAcid[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), color)
            tbuttonFonAcid[hue].font = defaultFontFon
            tbuttonFonAcid[hue].fontColor = color
        
            checkFonAcid[hue].checkboxOn = newDrawable(getDrawable("inverted-check-on"), color)
            checkFonAcid[hue].checkboxOff = newDrawable(getDrawable("inverted-check-off"), bcolor)
            checkFonAcid[hue].disabled = newDrawable(getDrawable("inverted-check-disabled"), bcolor)
            checkFonAcid[hue].font = defaultFontFon
            checkFonAcid[hue].fontColor = color
        
            tfieldFonAcid[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), color)
            tfieldFonAcid[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), color)
            tfieldFonAcid[hue].background = newDrawable(getDrawable("inverted-textfield-background"), bcolor)
            tfieldFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), bcolor)
            tfieldFonAcid[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), bcolor)
            tfieldFonAcid[hue].font = defaultFontFon
            tfieldFonAcid[hue].fontColor = color
        
            tareaFonAcid[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), color)
            tareaFonAcid[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), color)
            tareaFonAcid[hue].background = newDrawable(getDrawable("inverted-textfield-background"), bcolor)
            tareaFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), bcolor)
            tareaFonAcid[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), bcolor)
            tareaFonAcid[hue].font = defaultFontFon
            tareaFonAcid[hue].fontColor = color
        
            listFonAcid[hue].background = newDrawable(getDrawable("inverted-list-background"), bcolor)
            listFonAcid[hue].selection = newDrawable(getDrawable("inverted-list-selection"), color)
            listFonAcid[hue].down = newDrawable(getDrawable("inverted-list-down"), color)
            listFonAcid[hue].font = defaultFontFon
            listFonAcid[hue].fontColorSelected = color
            listFonAcid[hue].fontColorUnselected = color
        
            selectFonAcid[hue].listStyle = listFonAcid[hue]
            selectFonAcid[hue].scrollStyle = scrollFonAcid[hue]
            selectFonAcid[hue].background = newDrawable(getDrawable("inverted-select-background"), bcolor)
            selectFonAcid[hue].backgroundDisabled = newDrawable(getDrawable("inverted-select-disabled"), bcolor)
            selectFonAcid[hue].font = defaultFontFon
            selectFonAcid[hue].fontColor = color
        
            progressFonAcid[hue].background = newDrawable(getDrawable("inverted-progress-background"), bcolor)
            progressFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), bcolor)
            progressFonAcid[hue].knobBefore = newDrawable(getDrawable("inverted-progress-knobbefore"), color)
            progressFonAcid[hue].disabledKnobBefore = newDrawable(getDrawable("inverted-progress-disabledknobbefore"), color)
        
            sliderFonAcid[hue].knob = newDrawable(getDrawable("inverted-slider-knob"), color)
            sliderFonAcid[hue].disabledKnob = newDrawable(getDrawable("inverted-slider-disabledknob"), color)
            sliderFonAcid[hue].background = newDrawable(getDrawable("inverted-progress-background"), bcolor)
            sliderFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), bcolor)
        
            windowFonAcid[hue].background = newDrawable(getDrawable("inverted-window-background"), bcolor)
            windowFonAcid[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), bcolor)
            windowFonAcid[hue].titleFont = defaultFontFon
            windowFonAcid[hue].titleFontColor = color
        
            tpadFonAcid[hue].background = newDrawable(getDrawable("inverted-touchpad-background"), color)
            tpadFonAcid[hue].knob = newDrawable(getDrawable("inverted-touchpad-knob"), bcolor)
        
            dialogFonAcid[hue].background = newDrawable(getDrawable("inverted-window-background"), bcolor)
            dialogFonAcid[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), bcolor)
            dialogFonAcid[hue].titleFont = defaultFontFon
            dialogFonAcid[hue].titleFontColor = color
        
            add("fon${hue}acid", scrollFonAcid[hue])
            add("fon${hue}acid", splitFonAcid[hue])
            add("fon${hue}acid", treeFonAcid[hue])
            add("fon${hue}acid", labelFonAcid[hue])
            add("fon${hue}acid", buttonFonAcid[hue])
            add("fon${hue}acid", tbuttonFonAcid[hue])
            add("fon${hue}acid", checkFonAcid[hue])
            add("fon${hue}acid", tfieldFonAcid[hue])
            add("fon${hue}acid", tareaFonAcid[hue])
            add("fon${hue}acid", listFonAcid[hue])
            add("fon${hue}acid", selectFonAcid[hue])
            add("fon${hue}acid", progressFonAcid[hue])
            add("fon${hue}acid", sliderFonAcid[hue])
            add("fon${hue}acid", windowFonAcid[hue])
            add("fon${hue}acid", tpadFonAcid[hue])
            add("fon${hue}acid", dialogFonAcid[hue])
        
        }
    
    }
}