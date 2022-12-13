package ro.ac.upt.christmasarsample

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import android.net.Uri
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.ar.core.Anchor
import com.google.ar.core.HitResult
import com.google.ar.sceneform.AnchorNode
import com.google.ar.sceneform.rendering.ModelRenderable
import com.google.ar.sceneform.rendering.Renderable
import com.google.ar.sceneform.ux.ArFragment
import com.google.ar.sceneform.ux.TransformableNode


class AugmentedActivity : AppCompatActivity() {

    private lateinit var arFragment: ArFragment

    private var renderable: Renderable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_augmented)

        initRenderableModel()

        arFragment = supportFragmentManager.findFragmentById(R.id.scf_central) as ArFragment

        // TODO("2. Invoke addRenderableToScene once a tap is executed over the AR plane")

    }

    private fun initRenderableModel() {
        val modelUri = Uri.parse("model.sfb")

        // TODO("1. Init model's renderable variable")

    }

    private fun addRenderableToScene(anchor: Anchor, renderable: Renderable) {
        // TODO("3. Build an anchor node and set the AR scene to be its parent")

        // TODO("4. Build an transformable node and set the previously anchor node to be its parent")

        // TODO("5. Assign node's renderable property to previously loaded renderable")
    }

    companion object {
        private val TAG = AugmentedActivity::class.java.simpleName
    }

}
