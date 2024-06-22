package main.kotlin.com.zach.rio.entities

class Player(x: Int, y: Int) : Entity(x, y, "src/main/resources/images/player.png") {
    // Additional player-specific logic can go here
    var dx = 0
    var dy = 0

    fun move() {
        x += dx
        y += dy
    }

    fun setDirection(dx: Int, dy: Int) {
        this.dx = dx
        this.dy = dy
    }
}
