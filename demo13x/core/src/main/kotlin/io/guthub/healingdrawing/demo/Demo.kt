package io.guthub.healingdrawing.demo

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.scenes.scene2d.ui.Window
import com.badlogic.gdx.utils.viewport.FitViewport

import colorstepskin.ColorStepSkin
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import com.badlogic.gdx.utils.Align
import com.badlogic.gdx.scenes.scene2d.ui.List as UIList
import com.badlogic.gdx.utils.Array as UIArray


/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class Demo : ApplicationAdapter() {
    private var stage:Stage? = null
    
    private var table:Table? = null
    
    private var eng_button:TextButton? = null
    private var eng_button_disabled:TextButton? = null
    private  var eng_cbox: CheckBox? = null
    private  var eng_label: Label? = null
    private  var eng_textfield: TextField? = null
    private  var eng_textfield_disabled: TextField? = null
    private  var eng_textarea:TextArea? = null
    private  var scroll:ScrollPane? = null
    private  var listArray:UIArray<String> = UIArray()
    private var list:UIList<String>? = null
    private  var selectboxArray:UIArray<String> = UIArray()
    private var selectbox:SelectBox<String>? = null
    private var selectbox_disabled:SelectBox<String>? = null
    private var progress:ProgressBar? = null
    private var progressv:ProgressBar? = null
    private  var slider:Slider? = null
    private  var sliderv:Slider? = null
    private var window:Window? = null
    private var touchpad:Touchpad? = null
    private var splitpane:SplitPane? = null
    
    private val css = ColorStepSkin() //new skin instance
    /**can be x4 variants 0..100
     * hue0dark..hue100dark
     * hue0acid..hue100acid
     * hue0sun..hue100sun
     * hue0..hue100 is default binded to dark,but can be switched, after css.prepare() executed, to
     *
     * css.defaultDark() - dark scheme... used in init time
     * css.defaultAcid()
     * css.defaultSun
     *
     * Use this calls, before get style from skin to Actor etc.
     * Every ten style is gray based 0 10 .. 90 100.
     *
     * Other styles is manually prebalanced hue offset scheme based.
     * */
    private val styleName = "1"
    
    override fun create() {
        stage = Stage(FitViewport(1280f, 720f))
        Gdx.input.inputProcessor = stage
//        stage!!.isDebugAll = true
        
        css.prepare()
        table = Table()
        table!!.setSize(1280f, 720f)
        
        val bs:TextButtonStyle = css.get(styleName, TextButtonStyle::class.java)
        println(bs.fontColor)
        
        eng_button = TextButton("", css, styleName)
        eng_button!!.setText("Text button")
        eng_button!!.addListener(object : ClickListener() {
            override fun clicked(event: InputEvent, x: Float, y: Float) {
                eng_cbox!!.isDisabled = if (eng_button!!.isChecked) true else false
            }
        })
        
//        val ls = LabelStyle()
//        ls.fontColor = Color.RED
//        ls.font = css.font32
//        ls.background = css.getDrawable("label-background")
//        val label = Label("why not displayed?",ls)
//        table!!.add(label).fill().expand()
//        table!!.row()
        
        eng_cbox = CheckBox("",css, styleName)
        eng_cbox!!.setText("checkbox")
//        eng_cbox!!.isDisabled = true
        
        eng_label = Label("", css, styleName)
        eng_label!!.setText("Test Label inside scrollpane\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExt")
    
        eng_textfield = TextField("text field", css, styleName)
        eng_textfield_disabled = TextField("tfield disabled", css, styleName)
        eng_textfield_disabled!!.isDisabled = true

        eng_textarea = TextArea("test\ntext\narea",css, styleName)

        scroll = ScrollPane(eng_label, css, styleName)

        list = UIList(css, styleName)
        listArray.add(
                "test list",
                "testtttt",
                "testttttt",
                "testtttttt"
        )
        list!!.setItems(listArray)

        selectboxArray.add(
                "select box",
                "testtttt",
                "testttttt",
                "testtttttt654654654"
        )

        selectbox = SelectBox(css, styleName)
        selectbox!!.setItems(selectboxArray)
        selectbox!!.maxListCount = 3
        
        selectbox_disabled = SelectBox(css, styleName)
        selectbox_disabled!!.setItems("selectbox disabled")
        selectbox_disabled!!.isDisabled = true

        progress = ProgressBar(0f,5f,1f,false,css, styleName)
        progress!!.value = 1f
        progress!!.isDisabled = true

        progressv = ProgressBar(0f,5f,1f,true,css, styleName)
        progressv!!.value = 4f

        slider = Slider(0f,10f,1f,false,css, styleName)
        slider!!.isDisabled = true
        
        sliderv = Slider(0f,10f,1f,true,css, styleName)
        
        eng_button_disabled = TextButton("button disabled", css, styleName)
        eng_button_disabled!!.isDisabled = true
        
        touchpad = Touchpad(40f, css, styleName)

        splitpane = SplitPane(progress, slider, false, css, styleName)
    
        window = Window("test WindoW title",css, styleName)

//        table!!.add(eng_label).expandX().expandY()//.fillX().fillY() //used in scroll
        
        table!!.add(eng_button).expand().fill()
        table!!.add(selectbox_disabled).expandX()
        table!!.add(eng_textfield_disabled).expand().fillX().colspan(3)
        table!!.row()
        table!!.add(eng_cbox).expandX().expandY()//.fillX().fillY()
        table!!.row()
        table!!.add()
        table!!.add(selectbox)
        table!!.add(eng_textfield).expand().fillX().colspan(3)
        
        table!!.row()
        val bandt = Table()
        bandt.add(eng_button_disabled)
        bandt.row()
        bandt.add(touchpad)
        table!!.row()
        table!!.add(bandt)
        table!!.add(scroll).expandX().expandY()//.fillX().fillY()
        table!!.add(list).expandX()
        table!!.add(progressv).expandX().expandY()
        table!!.add(sliderv).expandX().expandY().fill()

//        table!!.add(eng_textarea).expandX().expandY()//.fillX().fillY() //BUGGED as official bug

        table!!.row()
        table!!.add(splitpane).expand().fill().colspan(3).align(Align.left)
        
        window!!.setFillParent(true)
        window!!.add(table).expand().fill()
        window!!.titleLabel.setAlignment(Align.top)/*not working along y only left right center looks correct*/
        window!!.pad(8f)
        window!!.padBottom(12f)
        window!!.padTop(106f) //work
        stage!!.addActor(window)
    }

    override fun render() {
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        stage!!.act(Gdx.graphics.deltaTime)
        stage!!.draw()
    }

    override fun resize(width: Int, height: Int) {
        stage!!.viewport.update(width, height)
    }

    override fun dispose() {
        stage!!.dispose()
    }
}