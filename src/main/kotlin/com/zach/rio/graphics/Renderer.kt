package main.kotlin.com.zach.rio.graphics

import java.awt.Graphics
import java.awt.Image
import javax.swing.ImageIcon
import main.kotlin.com.zach.rio.entities.Entity

class Renderer {
    private var background: Image? = null

    init {
        loadBackground("src/main/resources/images/background.png")
    }

    private fun loadBackground(path: String) {
        val icon = ImageIcon(path)
        background = icon.image
    }

    fun render(graphics: Graphics, entities: MutableList<Entity>) {
        // Draw the background
        background?.let {
            graphics.drawImage(it, 0, 0, null)
        }

        // Draw all entities
        entities.forEach { entity ->
            graphics.drawImage(entity.sprite.image, entity.x, entity.y, null)
        }
    }
}
