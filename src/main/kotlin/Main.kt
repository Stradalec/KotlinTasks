package org.example

fun main() {
    val words: List<String?> = listOf("Mind is dead", "Tea is fuel " , null, "Safety of this code is full", null)

    // Используя оператор if
    println("Используя оператор if:")
    for (word in words) {
        if (word != null) {
            println(word.uppercase())
        }
    }

    // Используя оператор безопасного вызова ?
    println("\nИспользуя оператор безопасного вызова ?:")
    words.forEach { println(it?.uppercase()) }

    // Используя функцию let
    println("\nИспользуя функцию let:")
    words.forEach { it?.let { word -> println(word.uppercase()) } }

    // Используя Элвис-оператор ?: и функцию let
    println("\nИспользуя Элвис-оператор ?: и функцию let:")
    words.forEach { it?.let { word -> println(word.uppercase()) } ?: println("empty") }
}