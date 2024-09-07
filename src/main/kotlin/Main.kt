package org.example

fun main() {
    println("Введите первое число:")
    val number1 = readLine()!!.toDouble()

    println("Введите второе число:")
    val number2 = readLine()!!.toDouble()

    println("Введите оператор (+, -, * или /):")
    val operator = readLine()

    val result = when (operator) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> {
            if (number2 != 0.0) {
                number1 / number2
            } else {
                "Ошибка: деление на ноль"
            }
        }
        else -> "Ошибка: неверный оператор"
    }

    println("Результат: $result")
}