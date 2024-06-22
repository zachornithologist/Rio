package main.kotlin.com.zach.rio


import main.kotlin.com.zach.rio.graphics.Renderer
import java.awt.Graphics
import javax.swing.JPanel
import kotlin.concurrent.fixedRateTimer
import main.kotlin.com.zach.rio.entities.Entity
import main.kotlin.com.zach.rio.entities.Player
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent


class GamePanel : JPanel() {
    private val fps = 60
    private val renderer = Renderer()
    private val player = Player(100, 100)
    private val entities: MutableList<Entity> = mutableListOf()

    init {
        preferredSize = java.awt.Dimension(800, 600)
        background = java.awt.Color.BLACK
        entities.add(Player(100, 100))

        addKeyListener(object : KeyAdapter() {
            override fun keyPressed(e: KeyEvent) {
                when (e.keyCode) {
                    KeyEvent.VK_LEFT -> player.setDirection(-5, 0)
                    KeyEvent.VK_RIGHT -> player.setDirection(5, 0)
                    KeyEvent.VK_UP -> player.setDirection(0, -5)
                    KeyEvent.VK_DOWN -> player.setDirection(0, 5)
                }
            }

            override fun keyReleased(e: KeyEvent) {
                when (e.keyCode) {
                    KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT -> player.setDirection(0, 0)
                    KeyEvent.VK_UP, KeyEvent.VK_DOWN -> player.setDirection(0, 0)
                }
            }
        })

        isFocusable = true
        requestFocusInWindow()
    }
    }

    fun startGameLoop() {
        fixedRateTimer("gameLoop", initialDelay = 0, period = (1000 / fps).toLong()) {
            update()
            repaint()
        }
    }

    private fun update() {
        // Update game state here
        // Example: Update entity positions
        entities.forEach { entity ->
            // Update logic for each entity
        }
    }

    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        renderer.render(g, entities)
    }
}
