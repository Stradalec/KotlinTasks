package org.example

val fahrenheit = { celsius: Int -> celsius * 9 / 5 + 32 }

fun main() {
    val celsiusTemperature = 20
    val fahrenheitTemperature = fahrenheit(celsiusTemperature)
    println("$celsiusTemperature °C = $fahrenheitTemperature °F")
}