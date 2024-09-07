package org.example

fun main() {
    val numbers = listOf(-3, 5, -8, 10, -4, 7, 2, -1)
    val negativeNumbers = numbers.filter { it < 0 }
    println("Отрицательные числа: $negativeNumbers")

    val coolNumbers = mutableListOf(-3, 5, -8, 10, -4, 7, 2, -1)
    coolNumbers.replaceAll { if (it > 0) -it else it }
    println("Список с измененными знаками: $numbers")

    val squaredNumbers = numbers.map { it * it }
    println("Список квадратов: $squaredNumbers")

    val newNumbers = (1..7).toList()
    val sumString = newNumbers.joinToString(prefix = "=", postfix = "=", separator = "+")
    println(sumString)

    val phoneBook = mapOf("Alice" to "+8923456789", "Snake" to "+11223344", "Elena" to "+844556677", "Semyon" to "+899996677", "Hisao" to "+2020282737")
    val countryCode = "+8"
    val filteredPhoneBook = phoneBook.filterValues { it.startsWith(countryCode) }
    println(filteredPhoneBook)

    println("Введите число от 0 до 100:")
    val number = readLine()?.toInt() ?: 0

    val result = when (number) {
        in 0..19 -> arrayOf("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")[number]
        in 20..99 -> {
            val tens = arrayOf("", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")[number / 10]
            val ones = arrayOf("", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")[number % 10]
            "$tens $ones"
        }
        100 -> "сто"
        else -> "число вне диапазона"
    }
    println(result)
    val timeString = "01:20:12"
    val (hours, minutes, seconds) = timeString.split(":").map { it.toInt() }
    val totalSeconds = hours * 3600 + minutes * 60 + seconds
    println("Прошло $totalSeconds секунд с начала дня")
}
