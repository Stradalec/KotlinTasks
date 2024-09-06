package org.example
import kotlin.math.PI

abstract class Figure {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Square(private val side: Double) : Figure() {
    override fun calculateArea(): Double {
        return side * side
    }

    override fun calculatePerimeter(): Double {
        return 4 * side
    }
}

class Circle(private val radius: Double) : Figure() {
    override fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Triangle(private val side1: Double, private val side2: Double, private val side3: Double) : Figure() {
    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return kotlin.math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }

    override fun calculatePerimeter(): Double {
        return side1 + side2 + side3
    }
}

fun main() {
    val square = Square(5.0)
    println("Площадь квадрата: ${square.calculateArea()}")
    println("Периметр квадрата: ${square.calculatePerimeter()}")

    val circle = Circle(3.0)
    println("Площадь круга: ${circle.calculateArea()}")
    println("Длина окружности: ${circle.calculatePerimeter()}")

    val triangle = Triangle(3.0, 4.0, 5.0)
    println("Площадь треугольника: ${triangle.calculateArea()}")
    println("Периметр треугольника: ${triangle.calculatePerimeter()}")
}