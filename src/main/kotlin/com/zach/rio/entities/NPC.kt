package com.zach.rio.entities

class NPC(x: Int, y: Int) : Entity(x, y, "src/main/resources/images/npc.png") {
    var dx = 1
    var dy = 1

    fun move() {
        x += dx
        y += dy

        // Example: Simple bouncing logic to stay within bounds
        if (x < 0 || x > 800 - sprite.image.getWidth(null)) {
            dx = -dx
        }
        if (y < 0 || y > 600 - sprite.image.getHeight(null)) {
            dy = -dy
        }
    }

    fun setDirection(dx: Int, dy: Int) {
        this.dx = dx
        this.dy = dy
    }
}
