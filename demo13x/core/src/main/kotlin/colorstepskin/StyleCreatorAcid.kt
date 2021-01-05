package colorstepskin

import com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle

fun createAcidStyle(css:ColorStepSkin){
    css.apply {
        
        /*acid*/
        for (hue in 0..100){
            val hueL = cbox.acid.colorPair(hue)[0]//light hue based
            val hueD = cbox.acid.colorPair(hue, true)[0]//dark hue based
//            val opoL = cbox.acid.colorPair(hue)[1]//light oposite
//            val opoD = cbox.acid.colorPair(hue, true)[1]//dark oposite
            
            scrollAcid[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), hueL)
            scrollAcid[hue].vScroll = newDrawable(getDrawable("vscroll"), hueL)
            scrollAcid[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), hueL)
            scrollAcid[hue].hScroll = newDrawable(getDrawable("hscroll"), hueL)
            
            splitAcid[hue].handle = newDrawable(getDrawable("splitpane"), hueL)
            
            treeAcid[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeAcid[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeAcid[hue].background = newDrawable(getDrawable("tree-background"), hueL)
            treeAcid[hue].selection = newDrawable(getDrawable("tree-selection"), hueL)
            
            labelAcid[hue].background = newDrawable(getDrawable("label-background"), hueL)
            labelAcid[hue].font = defaultFont
            labelAcid[hue].fontColor = hueL
            
            buttonAcid[hue].up = newDrawable(getDrawable("button-up"), hueL)
            buttonAcid[hue].down = newDrawable(getDrawable("button-down"), hueL)
            buttonAcid[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            buttonAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), hueL)
            
            tbuttonAcid[hue].up = newDrawable(getDrawable("button-up"), hueL)
            tbuttonAcid[hue].down = newDrawable(getDrawable("button-down"), hueL)
            tbuttonAcid[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            tbuttonAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), hueL)
            tbuttonAcid[hue].font = defaultFont
            tbuttonAcid[hue].fontColor = hueL
            
            checkAcid[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkAcid[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkAcid[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), hueD)
            checkAcid[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), hueD)
//            checkAcid[hue].disabled = newDrawable(getDrawable("check-disabled"), hueD)
            checkAcid[hue].font = defaultFont
            checkAcid[hue].fontColor = hueL
            checkAcid[hue].disabledFontColor = hueD
            
            tfieldAcid[hue].cursor = newDrawable(getDrawable("textfield-cursor"), hueL)
            tfieldAcid[hue].selection = newDrawable(getDrawable("textfield-selection"), hueL)
            tfieldAcid[hue].background = newDrawable(getDrawable("textfield-background"), hueL)
            tfieldAcid[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), hueL)
            tfieldAcid[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), hueL)
            tfieldAcid[hue].font = defaultFont
            tfieldAcid[hue].fontColor = hueL
            
            tareaAcid[hue] = tfieldAcid[hue]
            
            listAcid[hue].background = newDrawable(getDrawable("list-background"), hueL)
            listAcid[hue].selection = newDrawable(getDrawable("list-selection"), hueL)
            listAcid[hue].down = newDrawable(getDrawable("list-down"), hueL)
            listAcid[hue].font = defaultFont
            listAcid[hue].fontColorSelected = hueL
            listAcid[hue].fontColorUnselected = hueL
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), hueL)
            sls.selection = newDrawable(getDrawable("list-selection"), hueL)
            sls.down = newDrawable(getDrawable("list-down"), hueL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectAcid[hue].listStyle = sls
            selectAcid[hue].scrollStyle = scrollAcid[hue]
            selectAcid[hue].background = newDrawable(getDrawable("select-background"), hueL)
            selectAcid[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), hueL)
            selectAcid[hue].font = defaultFont
            selectAcid[hue].fontColor = hueL
            
            progressAcid[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            progressAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
            progressAcid[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressAcid[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), hueL)
            
            sliderAcid[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderAcid[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), hueL)
            sliderAcid[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            sliderAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
            
            windowAcid[hue].background = newDrawable(getDrawable("window-background"), hueL)
            windowAcid[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueL)
            windowAcid[hue].titleFont = defaultFont
            windowAcid[hue].titleFontColor = hueL
            
            tpadAcid[hue].background = newDrawable(getDrawable("touchpad-background"), hueL)
            tpadAcid[hue].knob = newDrawable(getDrawable("touchpad-knob"), hueL)
            
            dialogAcid[hue].background = newDrawable(getDrawable("window-background"), hueL)
            dialogAcid[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueL)
            dialogAcid[hue].titleFont = defaultFont
            dialogAcid[hue].titleFontColor = hueL
            
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
            val hueL = cbox.acid.colorPair(hue)[0]//light hue based
            val opoL = cbox.acid.colorPair(hue)[1]//light oposite
//            val hueD = cbox.acid.colorPair(hue, true)[0]//dark hue based
//            val opoD = cbox.acid.colorPair(hue, true)[1]//dark oposite
            
            scrollTextAcid[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), opoL)
            scrollTextAcid[hue].vScroll = newDrawable(getDrawable("vscroll"), opoL)
            scrollTextAcid[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), opoL)
            scrollTextAcid[hue].hScroll = newDrawable(getDrawable("hscroll"), opoL)
            
            splitTextAcid[hue].handle = newDrawable(getDrawable("splitpane"), opoL)
            
            treeTextAcid[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeTextAcid[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeTextAcid[hue].background = newDrawable(getDrawable("tree-background"), opoL)
            treeTextAcid[hue].selection = newDrawable(getDrawable("tree-selection"), opoL)
            
            labelTextAcid[hue].background = newDrawable(getDrawable("label-background"), opoL)
            labelTextAcid[hue].font = defaultFont
            labelTextAcid[hue].fontColor = hueL
            
            buttonTextAcid[hue].up = newDrawable(getDrawable("button-up"), opoL)
            buttonTextAcid[hue].down = newDrawable(getDrawable("button-down"), opoL)
            buttonTextAcid[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            buttonTextAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), opoL)
            
            tbuttonTextAcid[hue].up = newDrawable(getDrawable("button-up"), opoL)
            tbuttonTextAcid[hue].down = newDrawable(getDrawable("button-down"), opoL)
            tbuttonTextAcid[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            tbuttonTextAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), opoL)
            tbuttonTextAcid[hue].font = defaultFont
            tbuttonTextAcid[hue].fontColor = hueL
            
            checkTextAcid[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkTextAcid[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkTextAcid[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), opoL)
            checkTextAcid[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), opoL)
//            checkTextAcid[hue].disabled = newDrawable(getDrawable("check-disabled"), opoL)
            checkTextAcid[hue].font = defaultFont
            checkTextAcid[hue].fontColor = hueL
            checkTextAcid[hue].disabledFontColor = opoL
            
            tfieldTextAcid[hue].cursor = newDrawable(getDrawable("textfield-cursor"), opoL)
            tfieldTextAcid[hue].selection = newDrawable(getDrawable("textfield-selection"), opoL)
            tfieldTextAcid[hue].background = newDrawable(getDrawable("textfield-background"), opoL)
            tfieldTextAcid[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), opoL)
            tfieldTextAcid[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), opoL)
            tfieldTextAcid[hue].font = defaultFont
            tfieldTextAcid[hue].fontColor = hueL
            
            tareaTextAcid[hue] = tfieldTextAcid[hue]
            
            listTextAcid[hue].background = newDrawable(getDrawable("list-background"), opoL)
            listTextAcid[hue].selection = newDrawable(getDrawable("list-selection"), opoL)
            listTextAcid[hue].down = newDrawable(getDrawable("list-down"), opoL)
            listTextAcid[hue].font = defaultFont
            listTextAcid[hue].fontColorSelected = hueL
            listTextAcid[hue].fontColorUnselected = hueL
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), opoL)
            sls.selection = newDrawable(getDrawable("list-selection"), opoL)
            sls.down = newDrawable(getDrawable("list-down"), opoL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectTextAcid[hue].listStyle = sls
            selectTextAcid[hue].scrollStyle = scrollTextAcid[hue]
            selectTextAcid[hue].background = newDrawable(getDrawable("select-background"), opoL)
            selectTextAcid[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), opoL)
            selectTextAcid[hue].font = defaultFont
            selectTextAcid[hue].fontColor = hueL
            
            progressTextAcid[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            progressTextAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            progressTextAcid[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressTextAcid[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), opoL)
            
            sliderTextAcid[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderTextAcid[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), opoL)
            sliderTextAcid[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            sliderTextAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            
            windowTextAcid[hue].background = newDrawable(getDrawable("window-background"), opoL)
            windowTextAcid[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), opoL)
            windowTextAcid[hue].titleFont = defaultFont
            windowTextAcid[hue].titleFontColor = hueL
            
            dialogTextAcid[hue] = windowTextAcid[hue]
            
            tpadTextAcid[hue].background = newDrawable(getDrawable("touchpad-background"), opoL)
            tpadTextAcid[hue].knob = newDrawable(getDrawable("touchpad-knob"), opoL)
            
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
            val opoD = cbox.acid.colorPair(hue, true)[1]//dark oposite
            val hueL = cbox.acid.colorPair(hue)[0]//light hue based
            val hueD = cbox.acid.colorPair(hue, true)[0]//dark hue based
            val opoL = cbox.acid.colorPair(hue)[1]//light oposite
            
            scrollFonAcid[hue].vScrollKnob = newDrawable(getDrawable("inverted-vscrollknob"), opoD)
            scrollFonAcid[hue].vScroll = newDrawable(getDrawable("inverted-vscroll"), opoD)
            scrollFonAcid[hue].hScrollKnob = newDrawable(getDrawable("inverted-hscrollknob"), opoD)
            scrollFonAcid[hue].hScroll = newDrawable(getDrawable("inverted-hscroll"), opoD)
            
            splitFonAcid[hue].handle = newDrawable(getDrawable("inverted-splitpane"), hueL)
            
            treeFonAcid[hue].minus = newDrawable(getDrawable("inverted-tree-minus"), opoD)
            treeFonAcid[hue].plus = newDrawable(getDrawable("inverted-tree-plus"), opoD)
            treeFonAcid[hue].background = newDrawable(getDrawable("inverted-tree-background"), hueL)
            treeFonAcid[hue].selection = newDrawable(getDrawable("inverted-tree-selection"), hueL)
            
            labelFonAcid[hue].background = newDrawable(getDrawable("inverted-label-background"), hueL)
            labelFonAcid[hue].font = defaultFontFon
            labelFonAcid[hue].fontColor = opoD
            
            buttonFonAcid[hue].up = newDrawable(getDrawable("inverted-button-up"), hueL)
            buttonFonAcid[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            buttonFonAcid[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            buttonFonAcid[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
            
            tbuttonFonAcid[hue].up = newDrawable(getDrawable("inverted-button-up"), hueL)
            tbuttonFonAcid[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            tbuttonFonAcid[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            tbuttonFonAcid[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
            tbuttonFonAcid[hue].font = defaultFontFon
            tbuttonFonAcid[hue].fontColor = opoD
            
            checkFonAcid[hue].checkboxOn = newDrawable(getDrawable("inverted-check-on"), opoD)
            checkFonAcid[hue].checkboxOff = newDrawable(getDrawable("inverted-check-off"), opoD)
            checkFonAcid[hue].checkboxOffDisabled = newDrawable(getDrawable("inverted-check-off"), hueL)
            checkFonAcid[hue].checkboxOnDisabled = newDrawable(getDrawable("inverted-check-on"), hueL)
//            checkFonAcid[hue].disabled = newDrawable(getDrawable("inverted-check-disabled"), hueL)
            checkFonAcid[hue].font = defaultFontFon
            checkFonAcid[hue].fontColor = opoL
            checkFonAcid[hue].disabledFontColor = hueL
            
            tfieldFonAcid[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), opoD)
            tfieldFonAcid[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), opoL)
            tfieldFonAcid[hue].background = newDrawable(getDrawable("inverted-textfield-background"), hueL)
            tfieldFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), hueL)
            tfieldFonAcid[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), hueL)
            tfieldFonAcid[hue].font = defaultFontFon
            tfieldFonAcid[hue].fontColor = opoD
            /*because style class is same and inside Skin.add() next just override previous. And there is some shit inside,
            * because if no bottom syntax for textarea style , in time of creation textfield app crushed, looks like textfield use
            * textarea style but this style class named as TextFieldStyle etc , not sure. muddy place , but work finally*/
            tareaFonAcid[hue] = tfieldFonAcid[hue]
            
            listFonAcid[hue].background = newDrawable(getDrawable("inverted-list-background"), hueL)
            listFonAcid[hue].selection = newDrawable(getDrawable("inverted-list-selection"), hueL)
            listFonAcid[hue].down = newDrawable(getDrawable("inverted-list-down"), hueL)
            listFonAcid[hue].font = defaultFontFon
            listFonAcid[hue].fontColorSelected = opoD
            listFonAcid[hue].fontColorUnselected = opoD
            
            selectFonAcid[hue].listStyle = listFonAcid[hue]
            selectFonAcid[hue].scrollStyle = scrollFonAcid[hue]
            selectFonAcid[hue].background = newDrawable(getDrawable("inverted-select-background"), hueL)
            selectFonAcid[hue].backgroundDisabled = newDrawable(getDrawable("inverted-select-disabled"), hueL)
            selectFonAcid[hue].font = defaultFontFon
            selectFonAcid[hue].fontColor = opoD
            
            progressFonAcid[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueL)
            progressFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
            progressFonAcid[hue].knobBefore = newDrawable(getDrawable("inverted-progress-knobbefore"), opoD)
            progressFonAcid[hue].disabledKnobBefore = newDrawable(getDrawable("inverted-progress-disabledknobbefore"), hueL)
            
            sliderFonAcid[hue].knob = newDrawable(getDrawable("inverted-slider-knob"), opoD)
            sliderFonAcid[hue].disabledKnob = newDrawable(getDrawable("inverted-slider-disabledknob"), hueL)
            sliderFonAcid[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueL)
            sliderFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
            
            windowFonAcid[hue].background = newDrawable(getDrawable("inverted-window-background"), hueL)
            windowFonAcid[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), hueL)
            windowFonAcid[hue].titleFont = defaultFontFon
            windowFonAcid[hue].titleFontColor = opoD
            /*same shit as for textfield, window widget use dialog widget style which class name is WindowStyle*/
            dialogFonAcid[hue] = windowFonAcid[hue]
            
            tpadFonAcid[hue].background = newDrawable(getDrawable("inverted-touchpad-background"), hueL)
            tpadFonAcid[hue].knob = newDrawable(getDrawable("inverted-touchpad-knob"), hueD)
            
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