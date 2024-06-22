package main.kotlin.com.zach.rio.graphics

import java.awt.Image
import javax.swing.ImageIcon

class Sprite(imagePath: String) {
    val image: Image

    init {
        val icon = ImageIcon(imagePath)
        image = icon.image
    }
}
