package org.example

//Simple Function Structure: fun keyword is used to defined a function
//fun functionName(parameter1: Type, parameter2: Type2) : ReturnType{
// //function body
// }

fun main() {

    add(5,6)
    printMessage("Ranjeet Yadav")
    println(multiply(5,6))
    printMessage2()
    println(sumWithVararg(5,6))
}

fun add(a: Int, b: Int) : Int{
    return a+b
}

fun printMessage(message:String){
    println(message)
}

fun multiply(a: Int, b: Int) : Int = a*b

fun printMessage2(message: String = "Default Message"){
    println(message)
}

fun sumWithVararg(vararg numbers: Int) : Int{
    var result = 0
    for (number in numbers){
        result += number
    }
    return result
}