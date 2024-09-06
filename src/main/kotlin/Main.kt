package org.example

fun main() {
    print("Число простых чисел: ")
    var numberCount = readln().toInt()
    var count = 0
    var number = 2

    while (count < numberCount) {
        var isSimple = true
        for (index in 2 until number) {
            if (number % index == 0) {
                isSimple = false
                break
            }
        }
        if (isSimple) {
            ++count
            println("${count}-ое число: $number")
        }
        ++number
    }
}