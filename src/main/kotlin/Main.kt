package org.example


fun main() {
    var sum = 0
    var count = 0
    var input: String?

    do {
        print("Введите число: ")
        input = readLine()

        if (input != null) {
            val number = input.toInt()
            if (number != 0) {
                sum += number
                count++
            }
        }
    } while (input?.toInt() != 0)

    println("Количество введенных чисел: $count")
    println("Их сумма: $sum")
    if (count != 0) {
        val average = sum.toDouble() / count
        println("Среднее арифметическое: $average")
    } else {
        println("Среднее арифметическое не может быть вычислено, так как не было введено ни одного числа.")
    }
}