package io.guthub.healingdrawing.demo

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.actions.Actions
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.scenes.scene2d.ui.Window
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.badlogic.gdx.utils.viewport.FitViewport
import gui.ColorStepSkin

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class Demo : ApplicationAdapter() {
    private var stage: Stage? = null
    private var skin: Skin? = null
    override fun create() {
        stage = Stage(FitViewport(640f, 480f))
    
        val css = ColorStepSkin() //new skin template
        
        skin = Skin(Gdx.files.internal("skin/skin.json"))
        val window = Window("Example screen", skin, "border")
        window.defaults().pad(4f)
        window.add("This is a Kotlin simple Scene2D view.").row()
        val button = TextButton("Click me!", skin)
        button.pad(8f)
        button.addListener(object : ChangeListener() {
            override fun changed(event: ChangeEvent, actor: Actor) {
                button.setText("Clicked.")
            }
        })
        window.add(button)
        window.pack()
        window.setPosition(stage!!.width / 2f - window.width / 2f,
                stage!!.height / 2f - window.height / 2f)
        window.addAction(Actions.sequence(Actions.alpha(0f), Actions.fadeIn(1f)))
        stage!!.addActor(window)
        Gdx.input.inputProcessor = stage
        
        
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
        skin!!.dispose()
    }
}