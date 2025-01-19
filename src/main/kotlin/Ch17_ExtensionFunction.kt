package org.example

fun String.great(): String {
    return "Hello $this"
}

fun Int.isEven(): Boolean{
    return this % 2 == 0
}

fun main() {

    println("Kotlin".great())
    println(1.isEven())
    println(2.isEven())
}