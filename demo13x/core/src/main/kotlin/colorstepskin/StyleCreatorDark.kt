package colorstepskin

import com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle

fun createDarkStyle(css:ColorStepSkin){
    css.apply {
        
        /*dark*/
        for (hue in 0..100){
            val hueL = cbox.dark.colorPair(hue)[0]//light hue based
            val hueD = cbox.dark.colorPair(hue, true)[0]//dark hue based
//            val opoL = cbox.dark.colorPair(hue)[1]//light oposite
//            val opoD = cbox.dark.colorPair(hue, true)[1]//dark oposite
            
            scrollDark[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), hueL)
            scrollDark[hue].vScroll = newDrawable(getDrawable("vscroll"), hueL)
            scrollDark[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), hueL)
            scrollDark[hue].hScroll = newDrawable(getDrawable("hscroll"), hueL)
            
            splitDark[hue].handle = newDrawable(getDrawable("splitpane"), hueL)
            
            treeDark[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeDark[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeDark[hue].background = newDrawable(getDrawable("tree-background"), hueL)
            treeDark[hue].selection = newDrawable(getDrawable("tree-selection"), hueL)
            
            labelDark[hue].background = newDrawable(getDrawable("label-background"), hueL)
            labelDark[hue].font = defaultFont
            labelDark[hue].fontColor = hueL
            
            buttonDark[hue].up = newDrawable(getDrawable("button-up"), hueL)
            buttonDark[hue].down = newDrawable(getDrawable("button-down"), hueL)
            buttonDark[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            buttonDark[hue].disabled = newDrawable(getDrawable("button-disabled"), hueD)
            
            tbuttonDark[hue].up = newDrawable(getDrawable("button-up"), hueL)
            tbuttonDark[hue].down = newDrawable(getDrawable("button-down"), hueL)
            tbuttonDark[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            tbuttonDark[hue].disabled = newDrawable(getDrawable("button-disabled"), hueD)
            tbuttonDark[hue].font = defaultFont
            tbuttonDark[hue].fontColor = hueL
            tbuttonDark[hue].disabledFontColor = hueD
            
            checkDark[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkDark[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkDark[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), hueD)
            checkDark[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), hueD)
            checkDark[hue].font = defaultFont
            checkDark[hue].fontColor = hueL
            checkDark[hue].disabledFontColor = hueD
            
            tfieldDark[hue].cursor = newDrawable(getDrawable("textfield-cursor"), hueL)
            tfieldDark[hue].selection = newDrawable(getDrawable("textfield-selection"), hueL)
            tfieldDark[hue].background = newDrawable(getDrawable("textfield-background"), hueL)
            tfieldDark[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), hueD)
            tfieldDark[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), hueL)
            tfieldDark[hue].font = defaultFont
            tfieldDark[hue].fontColor = hueL
            tfieldDark[hue].disabledFontColor = hueD
            
            tareaDark[hue] = tfieldDark[hue]
            
            listDark[hue].background = newDrawable(getDrawable("list-background"), hueL)
            listDark[hue].selection = newDrawable(getDrawable("list-selection"), hueL)
            listDark[hue].down = newDrawable(getDrawable("list-down"), hueL)
            listDark[hue].font = defaultFont
            listDark[hue].fontColorSelected = hueL
            listDark[hue].fontColorUnselected = hueL
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), hueL)
            sls.selection = newDrawable(getDrawable("list-selection"), hueL)
            sls.down = newDrawable(getDrawable("list-down"), hueL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectDark[hue].listStyle = sls
            selectDark[hue].scrollStyle = scrollDark[hue]
            selectDark[hue].background = newDrawable(getDrawable("select-background"), hueL)
            selectDark[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), hueD)
            selectDark[hue].font = defaultFont
            selectDark[hue].fontColor = hueL
            selectDark[hue].disabledFontColor = hueD
            
            progressDark[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            progressDark[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
            progressDark[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressDark[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), hueL)
            
            sliderDark[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderDark[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), hueL)
            sliderDark[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            sliderDark[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
            
            windowDark[hue].background = newDrawable(getDrawable("window-background"), hueL)
            windowDark[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueL)
            windowDark[hue].titleFont = defaultFont
            windowDark[hue].titleFontColor = hueL
            
            tpadDark[hue].background = newDrawable(getDrawable("touchpad-background"), hueL)
            tpadDark[hue].knob = newDrawable(getDrawable("touchpad-knob"), hueL)
            
            dialogDark[hue] = windowDark[hue]
            
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
            val hueL = cbox.dark.colorPair(hue)[0]//light hue based
            val opoL = cbox.dark.colorPair(hue)[1]//light oposite
//            val hueD = cbox.dark.colorPair(hue, true)[0]//dark hue based
//            val opoD = cbox.dark.colorPair(hue, true)[1]//dark oposite
            
            scrollTextDark[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), opoL)
            scrollTextDark[hue].vScroll = newDrawable(getDrawable("vscroll"), opoL)
            scrollTextDark[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), opoL)
            scrollTextDark[hue].hScroll = newDrawable(getDrawable("hscroll"), opoL)
            
            splitTextDark[hue].handle = newDrawable(getDrawable("splitpane"), opoL)
            
            treeTextDark[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeTextDark[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeTextDark[hue].background = newDrawable(getDrawable("tree-background"), opoL)
            treeTextDark[hue].selection = newDrawable(getDrawable("tree-selection"), opoL)
            
            labelTextDark[hue].background = newDrawable(getDrawable("label-background"), opoL)
            labelTextDark[hue].font = defaultFont
            labelTextDark[hue].fontColor = hueL
            
            buttonTextDark[hue].up = newDrawable(getDrawable("button-up"), opoL)
            buttonTextDark[hue].down = newDrawable(getDrawable("button-down"), opoL)
            buttonTextDark[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            buttonTextDark[hue].disabled = newDrawable(getDrawable("button-disabled"), opoL)
            
            tbuttonTextDark[hue].up = newDrawable(getDrawable("button-up"), opoL)
            tbuttonTextDark[hue].down = newDrawable(getDrawable("button-down"), opoL)
            tbuttonTextDark[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            tbuttonTextDark[hue].disabled = newDrawable(getDrawable("button-disabled"), opoL)
            tbuttonTextDark[hue].font = defaultFont
            tbuttonTextDark[hue].fontColor = hueL
            tbuttonTextDark[hue].disabledFontColor = opoL
            
            checkTextDark[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkTextDark[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkTextDark[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), opoL)
            checkTextDark[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), opoL)
//            checkTextDark[hue].disabled = newDrawable(getDrawable("check-disabled"), opoL)
            checkTextDark[hue].font = defaultFont
            checkTextDark[hue].fontColor = hueL
            checkTextDark[hue].disabledFontColor = opoL
            
            tfieldTextDark[hue].cursor = newDrawable(getDrawable("textfield-cursor"), opoL)
            tfieldTextDark[hue].selection = newDrawable(getDrawable("textfield-selection"), opoL)
            tfieldTextDark[hue].background = newDrawable(getDrawable("textfield-background"), opoL)
            tfieldTextDark[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), opoL)
            tfieldTextDark[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), opoL)
            tfieldTextDark[hue].font = defaultFont
            tfieldTextDark[hue].fontColor = hueL
            tfieldTextDark[hue].disabledFontColor = opoL
            
            tareaTextDark[hue] = tfieldTextDark[hue]
            
            listTextDark[hue].background = newDrawable(getDrawable("list-background"), opoL)
            listTextDark[hue].selection = newDrawable(getDrawable("list-selection"), opoL)
            listTextDark[hue].down = newDrawable(getDrawable("list-down"), opoL)
            listTextDark[hue].font = defaultFont
            listTextDark[hue].fontColorSelected = hueL
            listTextDark[hue].fontColorUnselected = hueL
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), opoL)
            sls.selection = newDrawable(getDrawable("list-selection"), opoL)
            sls.down = newDrawable(getDrawable("list-down"), opoL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectTextDark[hue].listStyle = sls
            selectTextDark[hue].scrollStyle = scrollTextDark[hue]
            selectTextDark[hue].background = newDrawable(getDrawable("select-background"), opoL)
            selectTextDark[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), opoL)
            selectTextDark[hue].font = defaultFont
            selectTextDark[hue].fontColor = hueL
            selectTextDark[hue].disabledFontColor = opoL
            
            progressTextDark[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            progressTextDark[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            progressTextDark[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressTextDark[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), opoL)
            
            sliderTextDark[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderTextDark[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), opoL)
            sliderTextDark[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            sliderTextDark[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            
            windowTextDark[hue].background = newDrawable(getDrawable("window-background"), opoL)
            windowTextDark[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), opoL)
            windowTextDark[hue].titleFont = defaultFont
            windowTextDark[hue].titleFontColor = hueL
            
            dialogTextDark[hue] = windowTextDark[hue]
            
            tpadTextDark[hue].background = newDrawable(getDrawable("touchpad-background"), opoL)
            tpadTextDark[hue].knob = newDrawable(getDrawable("touchpad-knob"), opoL)
            
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
            val opoD = cbox.dark.colorPair(hue, true)[1]//dark oposite
            val hueL = cbox.dark.colorPair(hue)[0]//light hue based
//            val hueD = cbox.dark.colorPair(hue, true)[0]//dark hue based
            val opoL = cbox.dark.colorPair(hue)[1]//light oposite
            
            scrollFonDark[hue].vScrollKnob = newDrawable(getDrawable("inverted-vscrollknob"), opoD)
            scrollFonDark[hue].vScroll = newDrawable(getDrawable("inverted-vscroll"), opoD)
            scrollFonDark[hue].hScrollKnob = newDrawable(getDrawable("inverted-hscrollknob"), opoD)
            scrollFonDark[hue].hScroll = newDrawable(getDrawable("inverted-hscroll"), opoD)
            
            splitFonDark[hue].handle = newDrawable(getDrawable("inverted-splitpane"), hueL)
            
            treeFonDark[hue].minus = newDrawable(getDrawable("inverted-tree-minus"), opoD)
            treeFonDark[hue].plus = newDrawable(getDrawable("inverted-tree-plus"), opoD)
            treeFonDark[hue].background = newDrawable(getDrawable("inverted-tree-background"), hueL)
            treeFonDark[hue].selection = newDrawable(getDrawable("inverted-tree-selection"), hueL)
            
            labelFonDark[hue].background = newDrawable(getDrawable("inverted-label-background"), hueL)
            labelFonDark[hue].font = defaultFontFon
            labelFonDark[hue].fontColor = opoD
            
            buttonFonDark[hue].up = newDrawable(getDrawable("inverted-button-up"), hueL)
            buttonFonDark[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            buttonFonDark[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            buttonFonDark[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
            
            tbuttonFonDark[hue].up = newDrawable(getDrawable("inverted-button-up"), hueL)
            tbuttonFonDark[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            tbuttonFonDark[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            tbuttonFonDark[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
            tbuttonFonDark[hue].font = defaultFontFon
            tbuttonFonDark[hue].fontColor = opoD
            tbuttonFonDark[hue].disabledFontColor = hueL
            
            checkFonDark[hue].checkboxOn = newDrawable(getDrawable("inverted-check-on"), opoD)
            checkFonDark[hue].checkboxOff = newDrawable(getDrawable("inverted-check-off"), opoD)
            checkFonDark[hue].checkboxOffDisabled = newDrawable(getDrawable("inverted-check-off"), hueL)
            checkFonDark[hue].checkboxOnDisabled = newDrawable(getDrawable("inverted-check-on"), hueL)
            checkFonDark[hue].font = defaultFontFon
            checkFonDark[hue].fontColor = opoD
            checkFonDark[hue].disabledFontColor = hueL
            
            tfieldFonDark[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), opoD)
            tfieldFonDark[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), opoL)
            tfieldFonDark[hue].background = newDrawable(getDrawable("inverted-textfield-background"), hueL)
            tfieldFonDark[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), hueL)
            tfieldFonDark[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), hueL)
            tfieldFonDark[hue].font = defaultFontFon
            tfieldFonDark[hue].fontColor = opoD
            tfieldFonDark[hue].disabledFontColor = hueL
            /*because style class is same and inside Skin.add() next just override previous. And there is some shit inside,
            * because if no bottom syntax for textarea style , in time of creation textfield app crushed, looks like textfield use
            * textarea style but this style class named as TextFieldStyle etc , not sure. muddy place , but work finally*/
            tareaFonDark[hue] = tfieldFonDark[hue]
            
            listFonDark[hue].background = newDrawable(getDrawable("inverted-list-background"), hueL)
            listFonDark[hue].selection = newDrawable(getDrawable("inverted-list-selection"), hueL)
            listFonDark[hue].down = newDrawable(getDrawable("inverted-list-down"), hueL)
            listFonDark[hue].font = defaultFontFon
            listFonDark[hue].fontColorSelected = opoD
            listFonDark[hue].fontColorUnselected = opoD
            
            selectFonDark[hue].listStyle = listFonDark[hue]
            selectFonDark[hue].scrollStyle = scrollFonDark[hue]
            selectFonDark[hue].background = newDrawable(getDrawable("inverted-select-background"), hueL)
            selectFonDark[hue].backgroundDisabled = newDrawable(getDrawable("inverted-select-disabled"), hueL)
            selectFonDark[hue].font = defaultFontFon
            selectFonDark[hue].fontColor = opoD
            selectFonDark[hue].disabledFontColor = hueL
            
            progressFonDark[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueL)
            progressFonDark[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
            progressFonDark[hue].knobBefore = newDrawable(getDrawable("inverted-progress-knobbefore"), opoD)
            progressFonDark[hue].disabledKnobBefore = newDrawable(getDrawable("inverted-progress-disabledknobbefore"), hueL)
            
            sliderFonDark[hue].knob = newDrawable(getDrawable("inverted-slider-knob"), opoD)
            sliderFonDark[hue].disabledKnob = newDrawable(getDrawable("inverted-slider-disabledknob"), hueL)
            sliderFonDark[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueL)
            sliderFonDark[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
            
            windowFonDark[hue].background = newDrawable(getDrawable("inverted-window-background"), hueL)
            windowFonDark[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), hueL)
            windowFonDark[hue].titleFont = defaultFontFon
            windowFonDark[hue].titleFontColor = opoD
            /*same shit as for textfield, window widget use dialog widget style which class name is WindowStyle*/
            dialogFonDark[hue] = windowFonDark[hue]
            
            tpadFonDark[hue].background = newDrawable(getDrawable("inverted-touchpad-background"), opoD)
            tpadFonDark[hue].knob = newDrawable(getDrawable("inverted-touchpad-knob"), hueL)
            
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