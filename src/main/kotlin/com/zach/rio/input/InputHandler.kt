package main.kotlin.com.zach.rio.input

import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent

class InputHandler(private val onKeyPress: (Int) -> Unit, private val onKeyRelease: (Int) -> Unit) : KeyAdapter() {
    override fun keyPressed(e: KeyEvent) {
        onKeyPress(e.keyCode)
    }

    override fun keyReleased(e: KeyEvent) {
        onKeyRelease(e.keyCode)
    }
}
