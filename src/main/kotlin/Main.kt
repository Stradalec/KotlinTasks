package org.example

fun messageParse(message: String, eventX: () -> Unit, eventY: () -> Unit, eventZ: () -> Unit) {
    for (char in message) {
        when (char.lowercaseChar()) {
            'x' -> eventX()
            'y' -> eventY()
            'z' -> eventZ()
        }
    }
}

fun main() {
    val inputString = "abxbbznmfkYyyxX"

    messageParse(inputString,
        { println("Обнаружен символ x") },
        { println("Обнаружен символ y") },
        { println("Обнаружен символ z") }
    )
}