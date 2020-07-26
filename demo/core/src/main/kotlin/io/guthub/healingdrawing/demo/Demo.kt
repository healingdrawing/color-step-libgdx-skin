package io.guthub.healingdrawing.demo

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.scenes.scene2d.ui.Window
import com.badlogic.gdx.utils.viewport.FitViewport

import colorstepskin.ColorStepSkin
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle
import com.badlogic.gdx.scenes.scene2d.ui.List as UIList
import com.badlogic.gdx.utils.Array as UIArray
import com.badlogic.gdx.scenes.scene2d.ui.Tree
import com.badlogic.gdx.scenes.scene2d.ui.Tree.Node

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class Demo : ApplicationAdapter() {
    private var stage:Stage? = null
    
    private var table:Table? = null
    
    private var eng_button:TextButton? = null
    private  var eng_cbox: CheckBox? = null
    private  var eng_label: Label? = null
    private  var eng_textfield: TextField? = null
    private  var eng_textarea:TextArea? = null
    private  var scroll:ScrollPane? = null
    private  var listArray:UIArray<String> = UIArray()
    private var list:UIList<String>? = null
    private  var selectboxArray:UIArray<String> = UIArray()
    private var selectbox:SelectBox<String>? = null
    private var progress:ProgressBar? = null
    private var progressv:ProgressBar? = null
    private  var slider:Slider? = null
    private  var sliderv:Slider? = null
    private var window:Window? = null
    private var touchpad:Touchpad? = null
    private var splitpane:SplitPane? = null
    
    override fun create() {
        stage = Stage(FitViewport(1280f, 720f))
        Gdx.input.inputProcessor = stage
        val css = ColorStepSkin() //new skin template
        css.prepare()
        val styleName = "hue31sun"
        table = Table()
        table!!.setSize(1280f, 720f)
        
        val bs:TextButtonStyle = css.get(styleName, TextButtonStyle::class.java)
        println(bs.fontColor)
        eng_button = TextButton("", css, styleName)
        eng_button!!.setText("TesttExt")
    
        eng_cbox = CheckBox("",css, styleName)
        eng_cbox!!.setText("TesttExt")
    
        eng_label = Label("", css, styleName)
        eng_label!!.setText("TesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExtTesttExtTesttExtTesttExt\n" +
                "TesttExt")
    
        eng_textfield = TextField("test", css, styleName)
    
        eng_textarea = TextArea("test\ntestt\ntesttt",css, styleName)
    
        scroll = ScrollPane(eng_label, css, styleName)
    
        list = UIList(css, styleName)
        listArray.add(
                "testttt",
                "testtttt",
                "testttttt",
                "testtttttt"
        )
        list!!.setItems(listArray)
    
        selectboxArray.add(
                "testttt",
                "testtttt",
                "testttttt",
                "testtttttt"
        )
    
        selectbox = SelectBox(css, styleName)
        selectbox!!.setItems(selectboxArray)
        selectbox!!.maxListCount = 3
    
        progress = ProgressBar(0f,5f,1f,false,css, styleName)
        progress!!.value = 1f
    
        progressv = ProgressBar(0f,5f,1f,true,css, styleName)
        progressv!!.value = 4f
    
        slider = Slider(0f,10f,1f,false,css, styleName)
    
        sliderv = Slider(0f,10f,1f,true,css, styleName)
    
        touchpad = Touchpad(40f, css, styleName)
    
        splitpane = SplitPane(progress, slider, false, css, styleName)
    
        window = Window("test test test",css, styleName)

//        table!!.add(eng_label).expandX().expandY()//.fillX().fillY() //used in scroll
    
//        val tree = Tree<Label,Label,Label>(css)
        
        table!!.add(eng_button).expandX().expandY()//.fillX().fillY()
        table!!.add(selectbox).expandX()
        table!!.add(eng_textfield).expandX().expandY().fillX()
        table!!.row()
        table!!.add(eng_cbox).expandX().expandY()//.fillX().fillY()

//        table!!.add(progress).expandX().expandY()
//        table!!.add(slider).expandX().expandY().fill() //used in splitpane
    
        table!!.row()
        table!!.add(touchpad)
        table!!.add(scroll).expandX().expandY()//.fillX().fillY()
        table!!.add(list).expandX()
        table!!.add(progressv).expandX().expandY()
        table!!.add(sliderv).expandX().expandY().fill()

//        table!!.add(eng_textarea).expandX().expandY()//.fillX().fillY() //BUGGED
    
        table!!.row()
        table!!.add(splitpane).expand().fill().colspan(3)
    
        window!!.setFillParent(true)
        window!!.add(table).expand().fill()
        window!!.titleLabel.setAlignment(-1)
        window!!.pad(10f)
        window!!.padTop(68f) //work
        stage!!.addActor(window)
        
    }

    override fun render() {
        Gdx.gl.glClearColor(0f, 0.5f, 0.5f, 1f)
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