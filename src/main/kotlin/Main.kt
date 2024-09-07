package org.example


class Car(var name: String, val speed: Int)

data class Vehicle(val name: String, val speed: Int) {
    //fun copy(name: String = this.name, speed: Int = this.speed) = Vehicle(name,speed)
    // Это не работает, следующие источники: https://github.com/JetBrains/kotlin-web-site/pull/848/commits/9ea9a57252ae09d490431550d7463a4f3fcc2006
    // https://youtrack.jetbrains.com/issue/KT-19468/Data-class-copy-causes-conflicting-overloads-error
    // Цитата: Providing explicit implementations for the `component()` and `copy()` functions is not allowed.
}


fun main() {
    val car1 = Car("Lada", 100)
    val car2 = Car("Lada", 100)


    println("Сравнение car1 и car2: ${car1 == car2}")
    println("Сравнение car1 и car2 : ${car1 === car2}")

    // Вывод hashCode объектов car1 и car2
    println("hashCode car1: ${car1.hashCode()}")
    println("hashCode car2: ${car2.hashCode()}")

    val car3 = car1

    // Сравнение объектов car1 и car3 с помощью операторов "==" и "==="
    println("Сравнение car1 и car3: ${car1 == car3}")  // Ожидается: true, так как объекты имеют одинаковые поля
    println("hashCode car1: ${car1.hashCode()}")
    println("hashCode car3: ${car3.hashCode()}")

    // Изменение свойства name объекта car3
    car3.name = "Belaz"

    // Вывод свойств name объектов car1 и car3
    println("car1.name: ${car1.name}")  // Результат: Belaz, так как объекты ссылаются на одну область памяти
    println("car3.name: ${car3.name}")

    val vehicle1 = Vehicle("Ural", 100)
    val vehicle2 = Vehicle("Ural", 100)

    println("Сравнение vehicle1 и vehicle2: ${vehicle1 == vehicle2}")
    println("Сравнение vehicle1 и vehicle2 : ${vehicle1 === vehicle2}")

    println("hashCode vehicle1: ${vehicle1.hashCode()}")
    println("hashCode vehicle2: ${vehicle2.hashCode()}")

    //val vehicle3 = vehicle1.copy(newName = “ZIL”) Невозможно, т.к. запрещено явно переопределять copy
}





