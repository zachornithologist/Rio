package main.kotlin.com.zach.rio.entities

import java.awt.Image
import javax.swing.ImageIcon

abstract class Entity(var x: Int, var y: Int, imagePath: String) {
    val sprite: Sprite = Sprite(imagePath)
}

class Sprite(imagePath: String) {
    val image: Image

    init {
        val icon = ImageIcon(imagePath)
        image = icon.image
    }
}
