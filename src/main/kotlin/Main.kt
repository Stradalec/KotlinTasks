package org.example


class Point(var x: Int, var y: Int) {
    override fun toString(): String {
        return "Текущие координаты $x, $y"
    }
}

enum class Command {
    UP, DOWN, LEFT, RIGHT
}

class Turtle {
    fun move(point: Point, command: Command) {
        when (command) {
            Command.UP -> {
                ++point.y
                println("Произведено перемещение по оси Y на +1")
            }
            Command.DOWN -> {
                --point.y
                println("Произведено перемещение по оси Y на -1")
            }
            Command.LEFT -> {
                --point.x
                println("Произведено перемещение по оси X на -1")
            }
            Command.RIGHT -> {
                ++point.x
                println("Произведено перемещение по оси X на +1")
            }
        }
        println(point)
    }
}

fun main() {
    val newPoint = Point(0, 0)
    val turtle = Turtle()

    println(newPoint)

    turtle.move(newPoint, Command.UP)
    turtle.move(newPoint, Command.RIGHT)
    turtle.move(newPoint, Command.DOWN)
    turtle.move(newPoint, Command.LEFT)
}