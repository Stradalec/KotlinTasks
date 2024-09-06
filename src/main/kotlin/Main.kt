package org.example

fun sqr(n: Double): Double {
    return n * n
}

fun discriminant(a: Double, b: Double, c: Double): Double {
    return sqr(b) - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val discr = discriminant(a, b, c)
    return when {
        discr > 0.0 -> 2
        discr == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val discr = discriminant(a, b, c)
    when {
        discr > 0.0 -> {
            val x1 = (-b + Math.sqrt(discr)) / (2 * a)
            val x2 = (-b - Math.sqrt(discr)) / (2 * a)
            println("У уравнения два корня: x1 = $x1, x2 = $x2")
        }
        discr == 0.0 -> {
            val x = -b / (2 * a)
            println("У уравнения один корень: x = $x")
        }
        else -> {
            println("У уравнения нет  корней")
        }
    }
}

fun main() {
    val a = 1.0
    val b = -3.0
    val c = 2.0

    val rootsCount = rootsNumber(a, b, c)
    println("У уравнения $a*x^2 + $b*x + $c = 0 $rootsCount корня(ей)")

    quadraticRoot(a, b, c)
}