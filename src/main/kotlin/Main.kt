package org.example

fun main() {
    print("Введите целое число:")
    val number = readln()
    val firstNumber = number.first().digitToInt()
    val secondNumber = number.last().digitToInt()
    val result = firstNumber + secondNumber
    println(result)
}