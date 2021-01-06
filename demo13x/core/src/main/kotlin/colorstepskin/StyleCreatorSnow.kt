package colorstepskin

import com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle

fun createSnowStyle(css:ColorStepSkin){
    css.apply {
        
        /*snow*/
        for (hue in 0..100){
            val hueL = cbox.snow.colorPair(hue)[0]//light hue based
            val hueD = cbox.snow.colorPair(hue, true)[0]//dark hue based
//            val opoL = cbox.snow.colorPair(hue)[1]//light oposite
//            val opoD = cbox.snow.colorPair(hue, true)[1]//dark oposite
            
            scrollSnow[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), hueL)
            scrollSnow[hue].vScroll = newDrawable(getDrawable("vscroll"), hueL)
            scrollSnow[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), hueL)
            scrollSnow[hue].hScroll = newDrawable(getDrawable("hscroll"), hueL)
            
            splitSnow[hue].handle = newDrawable(getDrawable("splitpane"), hueL)
            
            treeSnow[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeSnow[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeSnow[hue].background = newDrawable(getDrawable("tree-background"), hueL)
            treeSnow[hue].selection = newDrawable(getDrawable("tree-selection"), hueL)
            
            labelSnow[hue].background = newDrawable(getDrawable("label-background"), hueL)
            labelSnow[hue].font = defaultFont
            labelSnow[hue].fontColor = hueL
            
            buttonSnow[hue].up = newDrawable(getDrawable("button-up"), hueL)
            buttonSnow[hue].down = newDrawable(getDrawable("button-down"), hueL)
            buttonSnow[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            buttonSnow[hue].disabled = newDrawable(getDrawable("button-disabled"), hueL)
            
            tbuttonSnow[hue].up = newDrawable(getDrawable("button-up"), hueL)
            tbuttonSnow[hue].down = newDrawable(getDrawable("button-down"), hueL)
            tbuttonSnow[hue].checked = newDrawable(getDrawable("button-checked"), hueL)
            tbuttonSnow[hue].disabled = newDrawable(getDrawable("button-disabled"), hueL)
            tbuttonSnow[hue].font = defaultFont
            tbuttonSnow[hue].fontColor = hueL
            tbuttonSnow[hue].disabledFontColor = hueD
            
            checkSnow[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkSnow[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkSnow[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), hueD)
            checkSnow[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), hueD)
            checkSnow[hue].font = defaultFont
            checkSnow[hue].fontColor = hueL
            checkSnow[hue].disabledFontColor = hueD
            
            tfieldSnow[hue].cursor = newDrawable(getDrawable("textfield-cursor"), hueL)
            tfieldSnow[hue].selection = newDrawable(getDrawable("textfield-selection"), hueL)
            tfieldSnow[hue].background = newDrawable(getDrawable("textfield-background"), hueL)
            tfieldSnow[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), hueL)
            tfieldSnow[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), hueL)
            tfieldSnow[hue].font = defaultFont
            tfieldSnow[hue].fontColor = hueL
            tfieldSnow[hue].disabledFontColor = hueD
            
            tareaSnow[hue] = tfieldSnow[hue]
            
            listSnow[hue].background = newDrawable(getDrawable("list-background"), hueL)
            listSnow[hue].selection = newDrawable(getDrawable("list-selection"), hueL)
            listSnow[hue].down = newDrawable(getDrawable("list-down"), hueL)
            listSnow[hue].font = defaultFont
            listSnow[hue].fontColorSelected = hueL
            listSnow[hue].fontColorUnselected = hueL
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), hueL)
            sls.selection = newDrawable(getDrawable("list-selection"), hueL)
            sls.down = newDrawable(getDrawable("list-down"), hueL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectSnow[hue].listStyle = sls
            selectSnow[hue].scrollStyle = scrollSnow[hue]
            selectSnow[hue].background = newDrawable(getDrawable("select-background"), hueL)
            selectSnow[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), hueL)
            selectSnow[hue].font = defaultFont
            selectSnow[hue].fontColor = hueL
            selectSnow[hue].disabledFontColor = hueD
            
            progressSnow[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            progressSnow[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
            progressSnow[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressSnow[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), hueL)
            
            sliderSnow[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderSnow[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), hueL)
            sliderSnow[hue].background = newDrawable(getDrawable("progress-background"), hueL)
            sliderSnow[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), hueL)
            
            windowSnow[hue].background = newDrawable(getDrawable("window-background"), hueL)
            windowSnow[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueL)
            windowSnow[hue].titleFont = defaultFont
            windowSnow[hue].titleFontColor = hueL
            
            tpadSnow[hue].background = newDrawable(getDrawable("touchpad-background"), hueL)
            tpadSnow[hue].knob = newDrawable(getDrawable("touchpad-knob"), hueL)
            
            dialogSnow[hue].background = newDrawable(getDrawable("window-background"), hueL)
            dialogSnow[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), hueL)
            dialogSnow[hue].titleFont = defaultFont
            dialogSnow[hue].titleFontColor = hueL
            
            add("hue${hue}snow", scrollSnow[hue])
            add("hue${hue}snow", splitSnow[hue])
            add("hue${hue}snow", treeSnow[hue])
            add("hue${hue}snow", labelSnow[hue])
            add("hue${hue}snow", buttonSnow[hue])
            add("hue${hue}snow", tbuttonSnow[hue])
            add("hue${hue}snow", checkSnow[hue])
            add("hue${hue}snow", tfieldSnow[hue])
            add("hue${hue}snow", tareaSnow[hue])
            add("hue${hue}snow", listSnow[hue])
            add("hue${hue}snow", selectSnow[hue])
            add("hue${hue}snow", progressSnow[hue])
            add("hue${hue}snow", sliderSnow[hue])
            add("hue${hue}snow", windowSnow[hue])
            add("hue${hue}snow", tpadSnow[hue])
            add("hue${hue}snow", dialogSnow[hue])
            
        }
        
        /*2020-11-16 new stuff*/
        /*textSnow*/
        for (hue in 0..100){
            val hueL = cbox.snow.colorPair(hue)[0]//light hue based
            val opoL = cbox.snow.colorPair(hue)[1]//light oposite
            val hueD = cbox.snow.colorPair(hue, true)[0]//dark hue based
//            val opoD = cbox.snow.colorPair(hue, true)[1]//dark oposite
            
            scrollTextSnow[hue].vScrollKnob = newDrawable(getDrawable("vscrollknob"), opoL)
            scrollTextSnow[hue].vScroll = newDrawable(getDrawable("vscroll"), opoL)
            scrollTextSnow[hue].hScrollKnob = newDrawable(getDrawable("hscrollknob"), opoL)
            scrollTextSnow[hue].hScroll = newDrawable(getDrawable("hscroll"), opoL)
            
            splitTextSnow[hue].handle = newDrawable(getDrawable("splitpane"), opoL)
            
            treeTextSnow[hue].minus = newDrawable(getDrawable("tree-minus"), hueL)
            treeTextSnow[hue].plus = newDrawable(getDrawable("tree-plus"), hueL)
            treeTextSnow[hue].background = newDrawable(getDrawable("tree-background"), opoL)
            treeTextSnow[hue].selection = newDrawable(getDrawable("tree-selection"), opoL)
            
            labelTextSnow[hue].background = newDrawable(getDrawable("label-background"), opoL)
            labelTextSnow[hue].font = defaultFont
            labelTextSnow[hue].fontColor = hueL
            
            buttonTextSnow[hue].up = newDrawable(getDrawable("button-up"), opoL)
            buttonTextSnow[hue].down = newDrawable(getDrawable("button-down"), opoL)
            buttonTextSnow[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            buttonTextSnow[hue].disabled = newDrawable(getDrawable("button-disabled"), opoL)
            
            tbuttonTextSnow[hue].up = newDrawable(getDrawable("button-up"), opoL)
            tbuttonTextSnow[hue].down = newDrawable(getDrawable("button-down"), opoL)
            tbuttonTextSnow[hue].checked = newDrawable(getDrawable("button-checked"), opoL)
            tbuttonTextSnow[hue].disabled = newDrawable(getDrawable("button-disabled"), opoL)
            tbuttonTextSnow[hue].font = defaultFont
            tbuttonTextSnow[hue].fontColor = hueL
            tbuttonTextSnow[hue].disabledFontColor = hueD
            
            checkTextSnow[hue].checkboxOn = newDrawable(getDrawable("check-on"), hueL)
            checkTextSnow[hue].checkboxOff = newDrawable(getDrawable("check-off"), hueL)
            checkTextSnow[hue].checkboxOffDisabled = newDrawable(getDrawable("check-off"), hueD)
            checkTextSnow[hue].checkboxOnDisabled = newDrawable(getDrawable("check-on"), hueD)
            checkTextSnow[hue].font = defaultFont
            checkTextSnow[hue].fontColor = hueL
            checkTextSnow[hue].disabledFontColor = hueD
            
            tfieldTextSnow[hue].cursor = newDrawable(getDrawable("textfield-cursor"), opoL)
            tfieldTextSnow[hue].selection = newDrawable(getDrawable("textfield-selection"), opoL)
            tfieldTextSnow[hue].background = newDrawable(getDrawable("textfield-background"), opoL)
            tfieldTextSnow[hue].disabledBackground = newDrawable(getDrawable("textfield-disabled"), opoL)
            tfieldTextSnow[hue].focusedBackground = newDrawable(getDrawable("textfield-focused"), opoL)
            tfieldTextSnow[hue].font = defaultFont
            tfieldTextSnow[hue].fontColor = hueL
            tfieldTextSnow[hue].disabledFontColor = hueD
            
            tareaTextSnow[hue] = tfieldTextSnow[hue]
            
            listTextSnow[hue].background = newDrawable(getDrawable("list-background"), opoL)
            listTextSnow[hue].selection = newDrawable(getDrawable("list-selection"), opoL)
            listTextSnow[hue].down = newDrawable(getDrawable("list-down"), opoL)
            listTextSnow[hue].font = defaultFont
            listTextSnow[hue].fontColorSelected = hueL
            listTextSnow[hue].fontColorUnselected = hueL
            
            /*separated style for list inside select with scroll, to polish*/
            val sls = ListStyle()
            sls.background = newDrawable(getDrawable("select-list-background"), opoL)
            sls.selection = newDrawable(getDrawable("list-selection"), opoL)
            sls.down = newDrawable(getDrawable("list-down"), opoL)
            sls.font = defaultFont
            sls.fontColorSelected = hueL
            sls.fontColorUnselected = hueL
            
            selectTextSnow[hue].listStyle = sls
            selectTextSnow[hue].scrollStyle = scrollTextSnow[hue]
            selectTextSnow[hue].background = newDrawable(getDrawable("select-background"), opoL)
            selectTextSnow[hue].backgroundDisabled = newDrawable(getDrawable("select-disabled"), opoL)
            selectTextSnow[hue].font = defaultFont
            selectTextSnow[hue].fontColor = hueL
            selectTextSnow[hue].disabledFontColor = hueD
            
            progressTextSnow[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            progressTextSnow[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            progressTextSnow[hue].knobBefore = newDrawable(getDrawable("progress-knobbefore"), hueL)
            progressTextSnow[hue].disabledKnobBefore = newDrawable(getDrawable("progress-disabledknobbefore"), opoL)
            
            sliderTextSnow[hue].knob = newDrawable(getDrawable("slider-knob"), hueL)
            sliderTextSnow[hue].disabledKnob = newDrawable(getDrawable("slider-disabledknob"), opoL)
            sliderTextSnow[hue].background = newDrawable(getDrawable("progress-background"), opoL)
            sliderTextSnow[hue].disabledBackground = newDrawable(getDrawable("progress-disabledbackground"), opoL)
            
            windowTextSnow[hue].background = newDrawable(getDrawable("window-background"), opoL)
            windowTextSnow[hue].stageBackground = newDrawable(getDrawable("window-stagebackground"), opoL)
            windowTextSnow[hue].titleFont = defaultFont
            windowTextSnow[hue].titleFontColor = hueL
            
            dialogTextSnow[hue] = windowTextSnow[hue]
            
            tpadTextSnow[hue].background = newDrawable(getDrawable("touchpad-background"), opoL)
            tpadTextSnow[hue].knob = newDrawable(getDrawable("touchpad-knob"), opoL)
            
            add("text${hue}snow", scrollTextSnow[hue])
            add("text${hue}snow", splitTextSnow[hue])
            add("text${hue}snow", treeTextSnow[hue])
            add("text${hue}snow", labelTextSnow[hue])
            add("text${hue}snow", buttonTextSnow[hue])
            add("text${hue}snow", tbuttonTextSnow[hue])
            add("text${hue}snow", checkTextSnow[hue])
            add("text${hue}snow", tfieldTextSnow[hue])
            add("text${hue}snow", tareaTextSnow[hue])
            add("text${hue}snow", listTextSnow[hue])
            add("text${hue}snow", selectTextSnow[hue])
            add("text${hue}snow", progressTextSnow[hue])
            add("text${hue}snow", sliderTextSnow[hue])
            add("text${hue}snow", windowTextSnow[hue])
            add("text${hue}snow", tpadTextSnow[hue])
            add("text${hue}snow", dialogTextSnow[hue])
            
        }
        
        /*fonSnow*/
        for (hue in 0..100){
            val opoD = cbox.snow.colorPair(hue, true)[1]//dark oposite
            val hueL = cbox.snow.colorPair(hue)[0]//light hue based
            val hueD = cbox.snow.colorPair(hue, true)[0]//dark hue based
            val opoL = cbox.snow.colorPair(hue)[1]//light oposite
            
            scrollFonSnow[hue].vScrollKnob = newDrawable(getDrawable("inverted-vscrollknob"), hueL)
            scrollFonSnow[hue].vScroll = newDrawable(getDrawable("inverted-vscroll"), hueL)
            scrollFonSnow[hue].hScrollKnob = newDrawable(getDrawable("inverted-hscrollknob"), hueL)
            scrollFonSnow[hue].hScroll = newDrawable(getDrawable("inverted-hscroll"), hueL)
            
            splitFonSnow[hue].handle = newDrawable(getDrawable("inverted-splitpane"), hueL)
            
            treeFonSnow[hue].minus = newDrawable(getDrawable("inverted-tree-minus"), opoD)
            treeFonSnow[hue].plus = newDrawable(getDrawable("inverted-tree-plus"), opoD)
            treeFonSnow[hue].background = newDrawable(getDrawable("inverted-tree-background"), hueL)
            treeFonSnow[hue].selection = newDrawable(getDrawable("inverted-tree-selection"), hueL)
            
            labelFonSnow[hue].background = newDrawable(getDrawable("inverted-label-background"), hueL)
            labelFonSnow[hue].font = defaultFontFon
            labelFonSnow[hue].fontColor = opoD
            
            buttonFonSnow[hue].up = newDrawable(getDrawable("inverted-button-up"), hueD)
            buttonFonSnow[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            buttonFonSnow[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            buttonFonSnow[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
            
            tbuttonFonSnow[hue].up = newDrawable(getDrawable("inverted-button-up"), hueD)
            tbuttonFonSnow[hue].down = newDrawable(getDrawable("inverted-button-down"), hueL)
            tbuttonFonSnow[hue].checked = newDrawable(getDrawable("inverted-button-checked"), hueL)
            tbuttonFonSnow[hue].disabled = newDrawable(getDrawable("inverted-button-disabled"), hueL)
            tbuttonFonSnow[hue].font = defaultFont
            tbuttonFonSnow[hue].fontColor = hueL
            tbuttonFonSnow[hue].downFontColor = hueD
            tbuttonFonSnow[hue].checkedFontColor = hueD
            tbuttonFonSnow[hue].disabledFontColor = hueL
            
            checkFonSnow[hue].checkboxOn = newDrawable(getDrawable("inverted-check-on"), hueD)
            checkFonSnow[hue].checkboxOff = newDrawable(getDrawable("inverted-check-off"), hueD)
            checkFonSnow[hue].checkboxOffDisabled = newDrawable(getDrawable("inverted-check-off"), hueL)
            checkFonSnow[hue].checkboxOnDisabled = newDrawable(getDrawable("inverted-check-on"), hueL)
            checkFonSnow[hue].font = defaultFont
            checkFonSnow[hue].fontColor = hueD
            checkFonSnow[hue].disabledFontColor = hueL
            
            tfieldFonSnow[hue].cursor = newDrawable(getDrawable("inverted-textfield-cursor"), opoD)
            tfieldFonSnow[hue].selection = newDrawable(getDrawable("inverted-textfield-selection"), opoL)
            tfieldFonSnow[hue].background = newDrawable(getDrawable("inverted-textfield-background"), hueL)
            tfieldFonSnow[hue].disabledBackground = newDrawable(getDrawable("inverted-textfield-disabled"), hueL)
            tfieldFonSnow[hue].focusedBackground = newDrawable(getDrawable("inverted-textfield-focused"), hueL)
            tfieldFonSnow[hue].font = defaultFont
            tfieldFonSnow[hue].fontColor = hueD
            tfieldFonSnow[hue].disabledFontColor = hueL
            /*because style class is same and inside Skin.add() next just override previous. And there is some shit inside,
            * because if no bottom syntax for textarea style , in time of creation textfield app crushed, looks like textfield use
            * textarea style but this style class named as TextFieldStyle etc , not sure. muddy place , but work finally*/
            tareaFonSnow[hue] = tfieldFonSnow[hue]
            
            listFonSnow[hue].background = newDrawable(getDrawable("inverted-list-background"), hueL)
            listFonSnow[hue].selection = newDrawable(getDrawable("inverted-list-selection"), hueL)
            listFonSnow[hue].down = newDrawable(getDrawable("inverted-list-down"), opoL)
            listFonSnow[hue].font = defaultFontFon
            listFonSnow[hue].fontColorSelected = opoD
            listFonSnow[hue].fontColorUnselected = opoD
            
            selectFonSnow[hue].listStyle = listFonSnow[hue]
            selectFonSnow[hue].scrollStyle = scrollFonSnow[hue]
            selectFonSnow[hue].background = newDrawable(getDrawable("inverted-select-background"), hueL)
            selectFonSnow[hue].backgroundDisabled = newDrawable(getDrawable("inverted-select-disabled"), hueL)
            selectFonSnow[hue].font = defaultFont
            selectFonSnow[hue].fontColor = hueD
            selectFonSnow[hue].disabledFontColor = hueL
            
            progressFonSnow[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueD)
            progressFonSnow[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
            progressFonSnow[hue].knobBefore = newDrawable(getDrawable("inverted-progress-knobbefore"), opoL)
            progressFonSnow[hue].disabledKnobBefore = newDrawable(getDrawable("inverted-progress-disabledknobbefore"), hueL)
            
            sliderFonSnow[hue].knob = newDrawable(getDrawable("inverted-slider-knob"), opoL)
            sliderFonSnow[hue].disabledKnob = newDrawable(getDrawable("inverted-slider-disabledknob"), hueL)
            sliderFonSnow[hue].background = newDrawable(getDrawable("inverted-progress-background"), hueD)
            sliderFonSnow[hue].disabledBackground = newDrawable(getDrawable("inverted-progress-disabledbackground"), hueL)
            
            windowFonSnow[hue].background = newDrawable(getDrawable("inverted-window-background"), hueL)
            windowFonSnow[hue].stageBackground = newDrawable(getDrawable("inverted-window-stagebackground"), hueL)
            windowFonSnow[hue].titleFont = defaultFontFon
            windowFonSnow[hue].titleFontColor = opoD
            /*same shit as for textfield, window widget use dialog widget style which class name is WindowStyle*/
            dialogFonSnow[hue] = windowFonSnow[hue]
            
            tpadFonSnow[hue].background = newDrawable(getDrawable("inverted-touchpad-background"), hueL)
            tpadFonSnow[hue].knob = newDrawable(getDrawable("inverted-touchpad-knob"), hueD)
            
            add("fon${hue}snow", scrollFonSnow[hue])
            add("fon${hue}snow", splitFonSnow[hue])
            add("fon${hue}snow", treeFonSnow[hue])
            add("fon${hue}snow", labelFonSnow[hue])
            add("fon${hue}snow", buttonFonSnow[hue])
            add("fon${hue}snow", tbuttonFonSnow[hue])
            add("fon${hue}snow", checkFonSnow[hue])
            add("fon${hue}snow", tfieldFonSnow[hue])
            add("fon${hue}snow", tareaFonSnow[hue])
            add("fon${hue}snow", listFonSnow[hue])
            add("fon${hue}snow", selectFonSnow[hue])
            add("fon${hue}snow", progressFonSnow[hue])
            add("fon${hue}snow", sliderFonSnow[hue])
            add("fon${hue}snow", windowFonSnow[hue])
            add("fon${hue}snow", tpadFonSnow[hue])
            add("fon${hue}snow", dialogFonSnow[hue])
            
        }
        
    }
}