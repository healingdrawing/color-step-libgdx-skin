package colorstepskin

import com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle

fun createGumStyle(css:ColorStepSkin){
    css.apply {
        
        /*gum*/
        for (hue in 0..100){
            val hueL = cbox.gum.colorPair(hue)[0]//light hue based
            val hueD = cbox.gum.colorPair(hue, true)[0]//dark hue based
//            val opoL = cbox.gum.colorPair(hue)[1]//light oposite
//            val opoD = cbox.gum.colorPair(hue, true)[1]//dark oposite
            
            scrollGum[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), hueL)
            scrollGum[hue].vScroll = newDrawable(getDrawable("vscroll"), hueL)
            scrollGum[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), hueL)
            scrollGum[hue].hScroll = newDrawable(getDrawable("hscroll"), hueL)
            
            splitGum[hue].handle = newDrawable(getDrawable("splitpane"), hueL)
            
            treeGum[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeGum[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeGum[hue].background = newDrawable(getDrawable("tree-background"), hueL)
            treeGum[hue].selection = newDrawable(getDrawable("tree-selection"), hueL)
            
            labelGum[hue].background = newDrawable(getDrawable("label-background"), hueL)
            labelGum[hue].font = defaultFont
            labelGum[hue].fontColor = hueL
            
            buttonGum[hue].up = newDrawable(getDrawable("button-up"), hueL)
            buttonGum[hue].down = newDrawable(getDrawable("button-down"), hueL)
            buttonGum[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            buttonGum[hue].disabled = newDrawable(getDrawable("button-disabled"), hueD)
            
            tbuttonGum[hue].up = newDrawable(getDrawable("button-up"), hueL)
            tbuttonGum[hue].down = newDrawable(getDrawable("button-down"), hueL)
            tbuttonGum[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            tbuttonGum[hue].disabled = newDrawable(getDrawable("button-disabled"), hueD)
            tbuttonGum[hue].font = defaultFont
            tbuttonGum[hue].fontColor = hueL
            tbuttonGum[hue].disabledFontColor = hueD
            
            checkGum[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkGum[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkGum[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), hueD)
            checkGum[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), hueD)
            checkGum[hue].font = defaultFont
            checkGum[hue].fontColor = hueL
            checkGum[hue].disabledFontColor = hueD
            
            tfieldGum[hue].cursor = newDrawable(getDrawable("textfield-cursor"), hueL)
            tfieldGum[hue].selection = newDrawable(getDrawable("textfield-selection"), hueL)
            tfieldGum[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), hueL)
            tfieldGum[hue].background = newDrawable(getDrawable("textfield-background"), hueL)
            tfieldGum[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), hueD)
            tfieldGum[hue].font = defaultFont
            tfieldGum[hue].fontColor = hueL
            tfieldGum[hue].disabledFontColor = hueD
            
            tareaGum[hue] = tfieldGum[hue]
            
            listGum[hue].background = newDrawable(getDrawable("list-background"), hueL)
            listGum[hue].selection = newDrawable(getDrawable("list-selection"), hueL)
            listGum[hue].down = newDrawable(getDrawable("list-down"), hueL)
            listGum[hue].font = defaultFont
            listGum[hue].fontColorSelected = hueL
            listGum[hue].fontColorUnselected = hueL
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), hueL)
            sls.selection = newDrawable(getDrawable("list-selection"), hueL)
            sls.down = newDrawable(getDrawable("list-down"), hueL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectGum[hue].listStyle = sls
            selectGum[hue].scrollStyle = scrollGum[hue]
            selectGum[hue].background = newDrawable(getDrawable("select-background"), hueL)
            selectGum[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), hueD)
            selectGum[hue].font = defaultFont
            selectGum[hue].fontColor = hueL
            selectGum[hue].disabledFontColor = hueD
            
            progressGum[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            progressGum[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
            progressGum[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressGum[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), hueL)
            
            sliderGum[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderGum[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), hueL)
            sliderGum[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            sliderGum[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
            
            windowGum[hue].background = newDrawable(getDrawable("window-background"), hueL)
            windowGum[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueL)
            windowGum[hue].titleFont = defaultFont
            windowGum[hue].titleFontColor = hueL
            
            tpadGum[hue].background = newDrawable(getDrawable("touchpad-background"), hueL)
            tpadGum[hue].knob = newDrawable(getDrawable("touchpad-knob"), hueL)
            
            dialogGum[hue].background = newDrawable(getDrawable("window-background"), hueL)
            dialogGum[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueL)
            dialogGum[hue].titleFont = defaultFont
            dialogGum[hue].titleFontColor = hueL
            
            add("hue${hue}gum", scrollGum[hue])
            add("hue${hue}gum", splitGum[hue])
            add("hue${hue}gum", treeGum[hue])
            add("hue${hue}gum", labelGum[hue])
            add("hue${hue}gum", buttonGum[hue])
            add("hue${hue}gum", tbuttonGum[hue])
            add("hue${hue}gum", checkGum[hue])
            add("hue${hue}gum", tfieldGum[hue])
            add("hue${hue}gum", tareaGum[hue])
            add("hue${hue}gum", listGum[hue])
            add("hue${hue}gum", selectGum[hue])
            add("hue${hue}gum", progressGum[hue])
            add("hue${hue}gum", sliderGum[hue])
            add("hue${hue}gum", windowGum[hue])
            add("hue${hue}gum", tpadGum[hue])
            add("hue${hue}gum", dialogGum[hue])
            
        }
        
        /*textGum*/
        for (hue in 0..100){
            val hueL = cbox.gum.colorPair(hue)[0]//light hue based
            val opoL = cbox.gum.colorPair(hue)[1]//light oposite
            val hueD = cbox.gum.colorPair(hue, true)[0]//dark hue based
//            val opoD = cbox.gum.colorPair(hue, true)[1]//dark oposite
            
            scrollTextGum[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), opoL)
            scrollTextGum[hue].vScroll = newDrawable(getDrawable("vscroll"), opoL)
            scrollTextGum[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), opoL)
            scrollTextGum[hue].hScroll = newDrawable(getDrawable("hscroll"), opoL)
            
            splitTextGum[hue].handle = newDrawable(getDrawable("splitpane"), opoL)
            
            treeTextGum[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeTextGum[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeTextGum[hue].background = newDrawable(getDrawable("tree-background"), opoL)
            treeTextGum[hue].selection = newDrawable(getDrawable("tree-selection"), opoL)
            
            labelTextGum[hue].background = newDrawable(getDrawable("label-background"), opoL)
            labelTextGum[hue].font = defaultFont
            labelTextGum[hue].fontColor = hueL
            
            buttonTextGum[hue].up = newDrawable(getDrawable("button-up"), opoL)
            buttonTextGum[hue].down = newDrawable(getDrawable("button-down"), opoL)
            buttonTextGum[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            buttonTextGum[hue].disabled = newDrawable(getDrawable("button-disabled"), hueD)
            
            tbuttonTextGum[hue].up = newDrawable(getDrawable("button-up"), opoL)
            tbuttonTextGum[hue].down = newDrawable(getDrawable("button-down"), opoL)
            tbuttonTextGum[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            tbuttonTextGum[hue].disabled = newDrawable(getDrawable("button-disabled"), hueD)
            tbuttonTextGum[hue].font = defaultFont
            tbuttonTextGum[hue].fontColor = hueL
            tbuttonTextGum[hue].disabledFontColor = hueD
            
            checkTextGum[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkTextGum[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkTextGum[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), hueD)
            checkTextGum[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), hueD)
            checkTextGum[hue].font = defaultFont
            checkTextGum[hue].fontColor = hueL
            checkTextGum[hue].disabledFontColor = hueD
            
            tfieldTextGum[hue].cursor = newDrawable(getDrawable("textfield-cursor"), opoL)
            tfieldTextGum[hue].selection = newDrawable(getDrawable("textfield-selection"), opoL)
            tfieldTextGum[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), hueD)
            tfieldTextGum[hue].background = newDrawable(getDrawable("textfield-background"), opoL)
            tfieldTextGum[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), opoL)
            tfieldTextGum[hue].font = defaultFont
            tfieldTextGum[hue].fontColor = hueL
            tfieldTextGum[hue].disabledFontColor = hueD
            
            tareaTextGum[hue] = tfieldTextGum[hue]
            
            listTextGum[hue].background = newDrawable(getDrawable("list-background"), opoL)
            listTextGum[hue].selection = newDrawable(getDrawable("list-selection"), opoL)
            listTextGum[hue].down = newDrawable(getDrawable("list-down"), opoL)
            listTextGum[hue].font = defaultFont
            listTextGum[hue].fontColorSelected = hueL
            listTextGum[hue].fontColorUnselected = hueL
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), opoL)
            sls.selection = newDrawable(getDrawable("list-selection"), opoL)
            sls.down = newDrawable(getDrawable("list-down"), opoL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectTextGum[hue].listStyle = sls
            selectTextGum[hue].scrollStyle = scrollTextGum[hue]
            selectTextGum[hue].background = newDrawable(getDrawable("select-background"), opoL)
            selectTextGum[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), hueD)
            selectTextGum[hue].font = defaultFont
            selectTextGum[hue].fontColor = hueL
            selectTextGum[hue].disabledFontColor = hueD
            
            progressTextGum[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            progressTextGum[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            progressTextGum[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressTextGum[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), opoL)
            
            sliderTextGum[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderTextGum[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), opoL)
            sliderTextGum[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            sliderTextGum[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            
            windowTextGum[hue].background = newDrawable(getDrawable("window-background"), opoL)
            windowTextGum[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), opoL)
            windowTextGum[hue].titleFont = defaultFont
            windowTextGum[hue].titleFontColor = hueL
            
            dialogTextGum[hue] = windowTextGum[hue]
            
            tpadTextGum[hue].background = newDrawable(getDrawable("touchpad-background"), opoL)
            tpadTextGum[hue].knob = newDrawable(getDrawable("touchpad-knob"), opoL)
            
            add("text${hue}gum", scrollTextGum[hue])
            add("text${hue}gum", splitTextGum[hue])
            add("text${hue}gum", treeTextGum[hue])
            add("text${hue}gum", labelTextGum[hue])
            add("text${hue}gum", buttonTextGum[hue])
            add("text${hue}gum", tbuttonTextGum[hue])
            add("text${hue}gum", checkTextGum[hue])
            add("text${hue}gum", tfieldTextGum[hue])
            add("text${hue}gum", tareaTextGum[hue])
            add("text${hue}gum", listTextGum[hue])
            add("text${hue}gum", selectTextGum[hue])
            add("text${hue}gum", progressTextGum[hue])
            add("text${hue}gum", sliderTextGum[hue])
            add("text${hue}gum", windowTextGum[hue])
            add("text${hue}gum", tpadTextGum[hue])
            add("text${hue}gum", dialogTextGum[hue])
            
        }
        
        /*fonGum*/
        for (hue in 0..100){
            val opoD = cbox.gum.colorPair(hue, true)[1]//dark oposite
            val hueL = cbox.gum.colorPair(hue)[0]//light hue based
//            val hueD = cbox.gum.colorPair(hue, true)[0]//dark hue based
            val opoL = cbox.gum.colorPair(hue)[1]//light oposite
            
            scrollFonGum[hue].vScrollKnob = newDrawable(getDrawable("inverted-vscrollknob"), opoD)
            scrollFonGum[hue].vScroll = newDrawable(getDrawable("inverted-vscroll"), opoD)
            scrollFonGum[hue].hScrollKnob = newDrawable(getDrawable("inverted-hscrollknob"), opoD)
            scrollFonGum[hue].hScroll = newDrawable(getDrawable("inverted-hscroll"), opoD)
            
            splitFonGum[hue].handle = newDrawable(getDrawable("inverted-splitpane"), hueL)
            
            treeFonGum[hue].minus = newDrawable(getDrawable("inverted-tree-minus"), opoD)
            treeFonGum[hue].plus = newDrawable(getDrawable("inverted-tree-plus"), opoD)
            treeFonGum[hue].background = newDrawable(getDrawable("inverted-tree-background"), hueL)
            treeFonGum[hue].selection = newDrawable(getDrawable("inverted-tree-selection"), hueL)
            
            labelFonGum[hue].background = newDrawable(getDrawable("inverted-label-background"), hueL)
            labelFonGum[hue].font = defaultFontFon
            labelFonGum[hue].fontColor = opoD
            
            buttonFonGum[hue].up = newDrawable(getDrawable("inverted-button-up"), hueL)
            buttonFonGum[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            buttonFonGum[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            buttonFonGum[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
            
            tbuttonFonGum[hue].up = newDrawable(getDrawable("inverted-button-up"), hueL)
            tbuttonFonGum[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            tbuttonFonGum[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            tbuttonFonGum[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
            tbuttonFonGum[hue].font = defaultFontFon
            tbuttonFonGum[hue].fontColor = opoD
            
            checkFonGum[hue].checkboxOn = newDrawable(getDrawable("inverted-check-on"), opoD)
            checkFonGum[hue].checkboxOff = newDrawable(getDrawable("inverted-check-off"), opoD)
            checkFonGum[hue].checkboxOffDisabled = newDrawable(getDrawable("inverted-check-off"), hueL)
            checkFonGum[hue].checkboxOnDisabled = newDrawable(getDrawable("inverted-check-on"), hueL)
            checkFonGum[hue].font = defaultFontFon
            checkFonGum[hue].fontColor = opoL
            checkFonGum[hue].disabledFontColor = hueL
            
            tfieldFonGum[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), opoD)
            tfieldFonGum[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), opoL)
            tfieldFonGum[hue].background = newDrawable(getDrawable("inverted-textfield-background"), hueL)
            tfieldFonGum[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), hueL)
            tfieldFonGum[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), hueL)
            tfieldFonGum[hue].font = defaultFontFon
            tfieldFonGum[hue].fontColor = opoD
            /*because style class is same and inside Skin.add() next just override previous. And there is some shit inside,
            * because if no bottom syntax for textarea style , in time of creation textfield app crushed, looks like textfield use
            * textarea style but this style class named as TextFieldStyle etc , not sure. muddy place , but work finally*/
            tareaFonGum[hue] = tfieldFonGum[hue]
            
            listFonGum[hue].background = newDrawable(getDrawable("inverted-list-background"), hueL)
            listFonGum[hue].selection = newDrawable(getDrawable("inverted-list-selection"), hueL)
            listFonGum[hue].down = newDrawable(getDrawable("inverted-list-down"), hueL)
            listFonGum[hue].font = defaultFontFon
            listFonGum[hue].fontColorSelected = opoD
            listFonGum[hue].fontColorUnselected = opoD
            
            selectFonGum[hue].listStyle = listFonGum[hue]
            selectFonGum[hue].scrollStyle = scrollFonGum[hue]
            selectFonGum[hue].background = newDrawable(getDrawable("inverted-select-background"), hueL)
            selectFonGum[hue].backgroundDisabled = newDrawable(getDrawable("inverted-select-disabled"), hueL)
            selectFonGum[hue].font = defaultFontFon
            selectFonGum[hue].fontColor = opoD
            
            progressFonGum[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueL)
            progressFonGum[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
            progressFonGum[hue].knobBefore = newDrawable(getDrawable("inverted-progress-knobbefore"), opoD)
            progressFonGum[hue].disabledKnobBefore = newDrawable(getDrawable("inverted-progress-disabledknobbefore"), hueL)
            
            sliderFonGum[hue].knob = newDrawable(getDrawable("inverted-slider-knob"), opoD)
            sliderFonGum[hue].disabledKnob = newDrawable(getDrawable("inverted-slider-disabledknob"), hueL)
            sliderFonGum[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueL)
            sliderFonGum[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
            
            windowFonGum[hue].background = newDrawable(getDrawable("inverted-window-background"), hueL)
            windowFonGum[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), hueL)
            windowFonGum[hue].titleFont = defaultFontFon
            windowFonGum[hue].titleFontColor = opoD
            /*same shit as for textfield, window widget use dialog widget style which class name is WindowStyle*/
            dialogFonGum[hue] = windowFonGum[hue]
            
            tpadFonGum[hue].background = newDrawable(getDrawable("inverted-touchpad-background"), hueL)
            tpadFonGum[hue].knob = newDrawable(getDrawable("inverted-touchpad-knob"), hueL)
            
            add("fon${hue}gum", scrollFonGum[hue])
            add("fon${hue}gum", splitFonGum[hue])
            add("fon${hue}gum", treeFonGum[hue])
            add("fon${hue}gum", labelFonGum[hue])
            add("fon${hue}gum", buttonFonGum[hue])
            add("fon${hue}gum", tbuttonFonGum[hue])
            add("fon${hue}gum", checkFonGum[hue])
            add("fon${hue}gum", tfieldFonGum[hue])
            add("fon${hue}gum", tareaFonGum[hue])
            add("fon${hue}gum", listFonGum[hue])
            add("fon${hue}gum", selectFonGum[hue])
            add("fon${hue}gum", progressFonGum[hue])
            add("fon${hue}gum", sliderFonGum[hue])
            add("fon${hue}gum", windowFonGum[hue])
            add("fon${hue}gum", tpadFonGum[hue])
            add("fon${hue}gum", dialogFonGum[hue])
            
        }
        
    }
}