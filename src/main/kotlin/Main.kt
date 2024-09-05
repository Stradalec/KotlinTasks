package org.example


fun main() {
    val secretNumber = (0..10).random()

    var guessed = false

    while (!guessed) {
        print("Введите ваш вариант числа (от 0 до 10): ")
        val input = readln()

        if (input != null) {
            val guess = input.toInt()
            if (guess < secretNumber) {
                println("Мало")
            } else if (guess > secretNumber) {
                println("Много")
            } else {
                println("Угадал!")
                guessed = true
            }
        } else {
            println("Пожалуйста, введите число!")
        }
    }
}