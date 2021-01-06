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
            
            scrollAcid[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), hueD)
            scrollAcid[hue].vScroll = newDrawable(getDrawable("vscroll"), hueD)
            scrollAcid[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), hueD)
            scrollAcid[hue].hScroll = newDrawable(getDrawable("hscroll"), hueD)
            
            splitAcid[hue].handle = newDrawable(getDrawable("splitpane"), hueD)
            
            treeAcid[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeAcid[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeAcid[hue].background = newDrawable(getDrawable("tree-background"), hueL)
            treeAcid[hue].selection = newDrawable(getDrawable("tree-selection"), hueL)
            
            labelAcid[hue].background = newDrawable(getDrawable("label-background"), hueD)
            labelAcid[hue].font = defaultFont
            labelAcid[hue].fontColor = hueD
            
            buttonAcid[hue].up = newDrawable(getDrawable("button-up"), hueL)
            buttonAcid[hue].down = newDrawable(getDrawable("button-down"), hueL)
            buttonAcid[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            buttonAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), hueL)
            
            tbuttonAcid[hue].up = newDrawable(getDrawable("button-up"), hueL)
            tbuttonAcid[hue].down = newDrawable(getDrawable("button-down"), hueL)
            tbuttonAcid[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            tbuttonAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), hueL)
            tbuttonAcid[hue].font = defaultFont
            tbuttonAcid[hue].fontColor = hueD
            tbuttonAcid[hue].disabledFontColor = hueD
            
            checkAcid[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkAcid[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkAcid[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), hueD)
            checkAcid[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), hueD)
            checkAcid[hue].font = defaultFont
            checkAcid[hue].fontColor = hueD
            checkAcid[hue].disabledFontColor = hueD
            
            tfieldAcid[hue].cursor = newDrawable(getDrawable("textfield-cursor"), hueL)
            tfieldAcid[hue].selection = newDrawable(getDrawable("textfield-selection"), hueL)
            tfieldAcid[hue].background = newDrawable(getDrawable("textfield-background"), hueL)
            tfieldAcid[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), hueL)
            tfieldAcid[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), hueL)
            tfieldAcid[hue].font = defaultFont
            tfieldAcid[hue].fontColor = hueD
            
            tareaAcid[hue] = tfieldAcid[hue]
            
            listAcid[hue].background = newDrawable(getDrawable("list-background"), hueL)
            listAcid[hue].selection = newDrawable(getDrawable("list-selection"), hueL)
            listAcid[hue].down = newDrawable(getDrawable("list-down"), hueL)
            listAcid[hue].font = defaultFont
            listAcid[hue].fontColorSelected = hueD
            listAcid[hue].fontColorUnselected = hueD
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), hueL)
            sls.selection = newDrawable(getDrawable("list-selection"), hueL)
            sls.down = newDrawable(getDrawable("list-down"), hueL)
            sls.font = defaultFont
            sls.fontColorSelected = hueD
            sls.fontColorUnselected = hueD
            
            selectAcid[hue].listStyle = sls
            selectAcid[hue].scrollStyle = scrollAcid[hue]
            selectAcid[hue].background = newDrawable(getDrawable("select-background"), hueL)
            selectAcid[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), hueL)
            selectAcid[hue].font = defaultFont
            selectAcid[hue].fontColor = hueD
            
            progressAcid[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            progressAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueD)
            progressAcid[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueD)
            progressAcid[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), hueD)
            
            sliderAcid[hue].knob = newDrawable(getDrawable("slider-knob"), hueD)
            sliderAcid[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), hueD)
            sliderAcid[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            sliderAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueD)
            
            windowAcid[hue].background = newDrawable(getDrawable("window-background"), hueD)
            windowAcid[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueD)
            windowAcid[hue].titleFont = defaultFont
            windowAcid[hue].titleFontColor = hueD
            
            tpadAcid[hue].background = newDrawable(getDrawable("touchpad-background"), hueL)
            tpadAcid[hue].knob = newDrawable(getDrawable("touchpad-knob"), hueL)
            
            dialogAcid[hue] = windowAcid[hue]
            
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
        
        /*textAcid*/
        for (hue in 0..100){
//            val hueL = cbox.acid.colorPair(hue)[0]//light hue based
            val opoL = cbox.acid.colorPair(hue)[1]//light oposite
            val hueD = cbox.acid.colorPair(hue, true)[0]//dark hue based
            val opoD = cbox.acid.colorPair(hue, true)[1]//dark oposite
            
            scrollTextAcid[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), opoD)
            scrollTextAcid[hue].vScroll = newDrawable(getDrawable("vscroll"), opoD)
            scrollTextAcid[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), opoD)
            scrollTextAcid[hue].hScroll = newDrawable(getDrawable("hscroll"), opoD)
            
            splitTextAcid[hue].handle = newDrawable(getDrawable("splitpane"), opoL)
            
            treeTextAcid[hue].minus = newDrawable(getDrawable("tree-minus"), hueD)
            treeTextAcid[hue].plus = newDrawable(getDrawable("tree-plus"), hueD)
            treeTextAcid[hue].background = newDrawable(getDrawable("tree-background"), opoD)
            treeTextAcid[hue].selection = newDrawable(getDrawable("tree-selection"), opoD)
            
            labelTextAcid[hue].background = newDrawable(getDrawable("label-background"), opoD)
            labelTextAcid[hue].font = defaultFont
            labelTextAcid[hue].fontColor = hueD
            
            buttonTextAcid[hue].up = newDrawable(getDrawable("button-up"), opoD)
            buttonTextAcid[hue].down = newDrawable(getDrawable("button-down"), opoD)
            buttonTextAcid[hue].checked = newDrawable(getDrawable("button-checked"), opoD)
            buttonTextAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), opoD)
            
            tbuttonTextAcid[hue].up = newDrawable(getDrawable("button-up"), opoD)
            tbuttonTextAcid[hue].down = newDrawable(getDrawable("button-down"), opoD)
            tbuttonTextAcid[hue].checked = newDrawable(getDrawable("button-checked"), opoD)
            tbuttonTextAcid[hue].disabled = newDrawable(getDrawable("button-disabled"), opoD)
            tbuttonTextAcid[hue].font = defaultFont
            tbuttonTextAcid[hue].fontColor = hueD
            tbuttonTextAcid[hue].disabledFontColor = opoD
            
            checkTextAcid[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueD)
            checkTextAcid[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueD)
            checkTextAcid[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), opoD)
            checkTextAcid[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), opoD)
            checkTextAcid[hue].font = defaultFont
            checkTextAcid[hue].fontColor = hueD
            checkTextAcid[hue].disabledFontColor = opoD
            
            tfieldTextAcid[hue].cursor = newDrawable(getDrawable("textfield-cursor"), opoL)
            tfieldTextAcid[hue].selection = newDrawable(getDrawable("textfield-selection"), opoL)
            tfieldTextAcid[hue].background = newDrawable(getDrawable("textfield-background"), opoD)
            tfieldTextAcid[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), opoD)
            tfieldTextAcid[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), opoD)
            tfieldTextAcid[hue].font = defaultFont
            tfieldTextAcid[hue].fontColor = hueD
            tfieldTextAcid[hue].disabledFontColor = opoD
            
            tareaTextAcid[hue] = tfieldTextAcid[hue]
            
            listTextAcid[hue].background = newDrawable(getDrawable("list-background"), opoD)
            listTextAcid[hue].selection = newDrawable(getDrawable("list-selection"), opoD)
            listTextAcid[hue].down = newDrawable(getDrawable("list-down"), opoD)
            listTextAcid[hue].font = defaultFont
            listTextAcid[hue].fontColorSelected = hueD
            listTextAcid[hue].fontColorUnselected = opoD
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), opoD)
            sls.selection = newDrawable(getDrawable("list-selection"), opoD)
            sls.down = newDrawable(getDrawable("list-down"), opoD)
            sls.font = defaultFont
            sls.fontColorSelected = hueD
            sls.fontColorUnselected = opoD
            
            selectTextAcid[hue].listStyle = sls
            selectTextAcid[hue].scrollStyle = scrollTextAcid[hue]
            selectTextAcid[hue].background = newDrawable(getDrawable("select-background"), opoD)
            selectTextAcid[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), opoD)
            selectTextAcid[hue].font = defaultFont
            selectTextAcid[hue].fontColor = hueD
            selectTextAcid[hue].disabledFontColor = opoD
            
            progressTextAcid[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueD)
            progressTextAcid[hue].background = newDrawable(getDrawable("progress-background"), opoD)
            progressTextAcid[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), opoD)
            progressTextAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoD)
            
            sliderTextAcid[hue].knob = newDrawable(getDrawable("slider-knob"), hueD)
            sliderTextAcid[hue].background = newDrawable(getDrawable("progress-background"), opoD)
            sliderTextAcid[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), opoD)
            sliderTextAcid[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoD)
            
            windowTextAcid[hue].background = newDrawable(getDrawable("window-background"), opoD)
            windowTextAcid[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), opoD)
            windowTextAcid[hue].titleFont = defaultFont
            windowTextAcid[hue].titleFontColor = hueD
            
            dialogTextAcid[hue] = windowTextAcid[hue]
            
            tpadTextAcid[hue].background = newDrawable(getDrawable("touchpad-background"), hueD)
            tpadTextAcid[hue].knob = newDrawable(getDrawable("touchpad-knob"), hueD)
            
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
            val hueL = cbox.acid.colorPair(hue)[0]//light hue based
            val hueD = cbox.acid.colorPair(hue, true)[0]//dark hue based
            val opoL = cbox.acid.colorPair(hue)[1]//light oposite
            val opoD = cbox.acid.colorPair(hue, true)[1]//dark oposite
            
            scrollFonAcid[hue].vScrollKnob = newDrawable(getDrawable("inverted-vscrollknob"), hueD)
            scrollFonAcid[hue].vScroll = newDrawable(getDrawable("inverted-vscroll"), hueD)
            scrollFonAcid[hue].hScrollKnob = newDrawable(getDrawable("inverted-hscrollknob"), hueD)
            scrollFonAcid[hue].hScroll = newDrawable(getDrawable("inverted-hscroll"), hueD)
            
            splitFonAcid[hue].handle = newDrawable(getDrawable("inverted-splitpane"), hueD)
            
            treeFonAcid[hue].minus = newDrawable(getDrawable("inverted-tree-minus"), opoL)
            treeFonAcid[hue].plus = newDrawable(getDrawable("inverted-tree-plus"), opoL)
            treeFonAcid[hue].background = newDrawable(getDrawable("inverted-tree-background"), hueD)
            treeFonAcid[hue].selection = newDrawable(getDrawable("inverted-tree-selection"), hueD)
            
            labelFonAcid[hue].background = newDrawable(getDrawable("inverted-label-background"), hueD)
            labelFonAcid[hue].font = defaultFont
            labelFonAcid[hue].fontColor = opoL
            
            buttonFonAcid[hue].up = newDrawable(getDrawable("inverted-button-up"), hueD)
            buttonFonAcid[hue].down = newDrawable(getDrawable("inverted-button-down"), hueD)
            buttonFonAcid[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueD)
            buttonFonAcid[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueD)
            
            tbuttonFonAcid[hue].up = newDrawable(getDrawable("inverted-button-up"), hueD)
            tbuttonFonAcid[hue].down = newDrawable(getDrawable("inverted-button-down"), hueD)
            tbuttonFonAcid[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueD)
            tbuttonFonAcid[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueD)
            tbuttonFonAcid[hue].font = defaultFont
            tbuttonFonAcid[hue].fontColor = opoL
            tbuttonFonAcid[hue].disabledFontColor = hueD
            
            checkFonAcid[hue].checkboxOn = newDrawable(getDrawable("inverted-check-on"), hueL)
            checkFonAcid[hue].checkboxOff = newDrawable(getDrawable("inverted-check-off"), hueL)
            checkFonAcid[hue].checkboxOffDisabled = newDrawable(getDrawable("inverted-check-off"), hueD)
            checkFonAcid[hue].checkboxOnDisabled = newDrawable(getDrawable("inverted-check-on"), hueD)
            checkFonAcid[hue].font = defaultFont
            checkFonAcid[hue].fontColor = opoL
            checkFonAcid[hue].disabledFontColor = hueD
            
            tfieldFonAcid[hue].cursor = newDrawable(getDrawable("textfield-cursor"), opoL)
            tfieldFonAcid[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), opoD)
            tfieldFonAcid[hue].background = newDrawable(getDrawable("inverted-textfield-background"), hueD)
            tfieldFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), hueD)
            tfieldFonAcid[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), hueD)
            tfieldFonAcid[hue].font = defaultFont
            tfieldFonAcid[hue].fontColor = opoL
            tfieldFonAcid[hue].disabledFontColor = hueD
            /*because style class is same and inside Skin.add() next just override previous. And there is some shit inside,
            * because if no bottom syntax for textarea style , in time of creation textfield app crushed, looks like textfield use
            * textarea style but this style class named as TextFieldStyle etc , not sure. muddy place , but work finally*/
            tareaFonAcid[hue] = tfieldFonAcid[hue]
            
            listFonAcid[hue].background = newDrawable(getDrawable("inverted-list-background"), hueD)
            listFonAcid[hue].selection = newDrawable(getDrawable("inverted-list-selection"), hueD)
            listFonAcid[hue].down = newDrawable(getDrawable("inverted-list-down"), hueD)
            listFonAcid[hue].font = defaultFont
            listFonAcid[hue].fontColorSelected = opoL
            listFonAcid[hue].fontColorUnselected = hueL
            
            selectFonAcid[hue].listStyle = listFonAcid[hue]
            selectFonAcid[hue].scrollStyle = scrollFonAcid[hue]
            selectFonAcid[hue].background = newDrawable(getDrawable("inverted-select-background"), hueD)
            selectFonAcid[hue].backgroundDisabled = newDrawable(getDrawable("inverted-select-disabled"), hueD)
            selectFonAcid[hue].font = defaultFont
            selectFonAcid[hue].fontColor = opoL
            selectFonAcid[hue].disabledFontColor = hueD
            
            progressFonAcid[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueD)
            progressFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueD)
            progressFonAcid[hue].knobBefore = newDrawable(getDrawable("inverted-progress-knobbefore"), opoD)
            progressFonAcid[hue].disabledKnobBefore = newDrawable(getDrawable("inverted-progress-disabledknobbefore"), hueD)
            
            sliderFonAcid[hue].knob = newDrawable(getDrawable("inverted-slider-knob"), opoD)
            sliderFonAcid[hue].disabledKnob = newDrawable(getDrawable("inverted-slider-disabledknob"), hueD)
            sliderFonAcid[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueD)
            sliderFonAcid[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueD)
            
            windowFonAcid[hue].background = newDrawable(getDrawable("inverted-window-background"), hueD)
            windowFonAcid[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), hueD)
            windowFonAcid[hue].titleFont = defaultFont
            windowFonAcid[hue].titleFontColor = opoL
            /*same shit as for textfield, window widget use dialog widget style which class name is WindowStyle*/
            dialogFonAcid[hue] = windowFonAcid[hue]
            
            tpadFonAcid[hue].background = newDrawable(getDrawable("inverted-touchpad-background"), hueD)
            tpadFonAcid[hue].knob = newDrawable(getDrawable("inverted-touchpad-knob"), hueL)
            
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