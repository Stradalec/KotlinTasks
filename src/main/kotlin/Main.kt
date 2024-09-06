package org.example

class NumberArray(private val array: IntArray) {

    val sum: Int
        get() = array.sum()

    fun doubleEvens(): IntArray {
        return array.map { if (it % 2 == 0) it * 2 else it * 1 }.toIntArray()
    }

    fun tripleOdds(): IntArray {
        return array.map { if (it % 2 == 1) it * 3 else it * 1 }.toIntArray()
    }

    fun maxElement(): Int {
        return array.max()
    }

    fun minElement(): Int {
        return array.min()
    }
}

fun main() {
    val numbers = intArrayOf(2, 4, 3, 8, 5, 7, 6)
    val array = NumberArray(numbers)

    println("Исходный массив: ${numbers.contentToString()}")
    println("Удвоенные четные элементы: ${array.doubleEvens().contentToString()}")
    println("Утроенные нечетные элементы: ${array.tripleOdds().contentToString()}")
    println("Максимальный элемент в массиве: ${array.maxElement()}")
    println("Минимальный элемент в массиве: ${array.minElement()}")
    println("Сумма элементов массива: ${array.sum}")
}