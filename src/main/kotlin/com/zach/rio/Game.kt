package main.kotlin.com.zach.rio

import java.awt.Dimension
import javax.swing.JFrame

class Game : JFrame() {
    private val gamePanel = GamePanel<Any>()

    init {
        title = "Rio"
        defaultCloseOperation = EXIT_ON_CLOSE
        contentPane = gamePanel
        pack()
        isResizable = false
        setLocationRelativeTo(null)
    }

    fun start() {
        isVisible = true
        gamePanel.startGameLoop()
    }
}
