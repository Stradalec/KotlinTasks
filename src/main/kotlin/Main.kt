package org.example

sealed class Command {
    data class Up(val steps: Int) : Command()
    data class Down(val steps: Int) : Command()
    data class Left(val steps: Int) : Command()
    data class Right(val steps: Int) : Command()
}

class Ufo(var x: Int, var y: Int) {
    override fun toString(): String {
        return "Тарелка Рика находится в координатах: ($x, $y)"
    }

    fun move(command: Command) {
        when (command) {
            is Command.Up -> {
                y += command.steps
                println("Тарелка Рика сместилась вверх на ${command.steps}")
            }
            is Command.Down -> {
                y -= command.steps
                println("Тарелка Рика сместилась вниз на ${command.steps}")
            }
            is Command.Left -> {
                x -= command.steps
                println("Тарелка Рика сместилась влево на ${command.steps}")
            }
            is Command.Right -> {
                x += command.steps
                println("Тарелка Рика сместилась вправо на ${command.steps}")
            }
        }
    }
}

fun messageParse(encryptedMessage: String, eventUp: (Int) -> Unit, eventDown: (Int) -> Unit, eventLeft: (Int) -> Unit, eventRight: (Int) -> Unit) {
    for (char in encryptedMessage) {
        when (char.toUpperCase()) {
            'A' -> eventLeft(2)
            'D' -> eventRight(1)
            'W' -> eventUp(1)
            'S' -> eventDown(1)
        }
    }
}

fun main() {
    val ufo = Ufo(0, 0)

    messageParse("wWDaasA", { steps -> ufo.move(Command.Up(steps)) },
        { steps -> ufo.move(Command.Down(steps)) },
        { steps -> ufo.move(Command.Left(steps)) },
        { steps -> ufo.move(Command.Right(steps)) })

    println(ufo)
}