package org.example

fun main() {
    val array = arrayOf(3, 7, 2, 8, 1, 5)
    var productFor = 1
    var minFor = array[0]
    var maxFor = array[0]
    for (number in array)
    {
        productFor *= number
        if (number < minFor) minFor = number
        if (number > maxFor) maxFor = number
    }
    println("Используя for (произведение, минимальное, максимальное): $productFor, $minFor, $maxFor" )

    var index = 0
    var productWhile = 1
    var minWhile = array[0]
    var maxWhile = array[0]
    while (index < array.size)
    {
        productWhile *= array[index]
        if (array[index] < minWhile) minWhile = array[index]
        if (array[index] > maxWhile) maxWhile = array[index]
        ++index
    }
    println("Используя while (произведение, минимальное, максимальное): $productWhile, $minWhile, $maxWhile" )

    // Используя функцию reduce()
    val productReduce = array.reduce { acc, reduceIndex -> acc * reduceIndex }
    val minReduce = array.minOrNull()
    val maxReduce = array.maxOrNull()
    println("Используя reduce (произведение, минимальное, максимальное): $productReduce, $minReduce, $maxReduce")

    // Используя оператор forEach
    var productForEach = 1
    var minForEach = array[0]
    var maxForEach = array[0]
    array.forEach {
        productForEach *= it //it == текущий элемент
        if (it < minForEach) minForEach = it
        if (it > maxForEach) maxForEach = it
    }
    println("Используя foreach (произведение, минимальное, максимальное): $productForEach,  $minForEach,  $maxForEach")


}


