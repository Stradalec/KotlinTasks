package org.example

val concat: (Array<out String>) -> Unit = { strings ->
    strings.sortedBy { it.length }.joinToString(" ").let(::println)
}

fun main() {
    concat(arrayOf("угасает.", "Последствия", "лабораторной.", "быстро", "разум", "Мой"))
}