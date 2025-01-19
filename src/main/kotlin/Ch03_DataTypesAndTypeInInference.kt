package org.example

//Type Declaration General Code
//We use colon : after the variableName to specify the type of variable Type(String, Int, etc)
//Val variableName: Type = value

fun main() {
    val byte:Byte = 127 // 8 bits
    val shortValue:Short = 32767 // 16 bits
    val intValue: Int = 214748367 // 32 bits
    val longValue: Long = 214748367999 // 64 bits
    val flotValue: Float = 100.2345F // 6-7 decimal, 32 bits
    val doubleValue: Double = 10000.5555666666 // 15 - 16 decimal 64 bits
    val char: Char = 'c'

    //Type Inference
    val boolean = false

    println(byte)
    println(flotValue)
    println(boolean)

}