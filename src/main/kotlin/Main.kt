package org.example

fun higherOrderFunction(message: String, convert: (String) -> String): String {
    val convertedMessage = convert(message)
    println(convertedMessage)
    return convertedMessage
}

fun main() {
    val message = "Но сейчас он был сосредоточен на работе и борьбе со сном, потому, в очередной раз отхлебнув крепкого напитка, выпрямился на стуле и окинул небольшую комнатку взглядом. Стена с доской объявлений, завешанная напутствиями в стиле «Не болтай!», металлический стул, обладающий, несомненно, важной способностью крутиться, стол, сейф с кодовым замком да огромное число приборов, стоящих напротив  входа. Обстановка не сказать что удручающая, но и явно не настраивающая на ударный труд."
    higherOrderFunction(message) {
        it.replace(",", " блин")
    }
}