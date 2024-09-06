package org.example
import kotlin.math.sqrt

class Vector(public val x: Double, public val y: Double, public val z: Double) {

    val length: Double
        get() = sqrt(x * x + y * y + z * z)

    infix fun dotProduct(another: Vector): Double {
        return x * another.x + y * another.y + z * another.z
    }
}

infix fun Vector.scalarProduct(another: Vector): Double {
    return this.x * another.x + this.y * another.y + this.z * another.z
}

fun main() {
    val vector1 = Vector(1.0, 2.0, 3.0)
    val vector2 = Vector(3.0, 2.0, 1.0)

    println("Длина вектора vector1: ${vector1.length}")
    println("Скалярное произведение векторов (dotProduct): ${vector1 dotProduct vector2}")
    println("Скалярное произведение векторов (scalarProduct): ${vector1.scalarProduct(vector2)}")
}