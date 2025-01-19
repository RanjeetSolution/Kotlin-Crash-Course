package org.example

//Two Ways to create Arrays
//1. Using the arrayOf function, 2. Using the array constructor
fun main() {

    val name: Array<String> = arrayOf("Kotlin", "java")
    println(name[0])
    println(name[1])

    val intArray = intArrayOf(1, 2, 3)
    println(intArray.contentToString())

    val zeros = Array(5) {0}
    println(zeros[0])
    zeros[0] = 1
    println(zeros[0])
    println(zeros.contentToString())

    val intArray1 = IntArray(5) {1}
    println(intArray1.contentToString())

    val floatArray1 = FloatArray(5) {1.0F}
    println(floatArray1.contentToString())


    //useful methods
    println(name.first())
    println(name.last())
    println(name.size)
    println(name.indexOf("java"))
    println(name.last())

    val copy1 = name.copyOf()
    println(copy1.contentToString())
    println(copy1.contains("java"))
    println(intArray.sum())


}