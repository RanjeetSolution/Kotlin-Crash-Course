package org.example

//ControlFlow/Condition: When we need to control the flow of program

fun main() {

    val age = 15

    //if else as statement
    if (age>=18){
        println("Adult")
    }else{
        println("Not Adult")
    }

    //if else as expression
    val isAdult = if (age>=18) true else false
    println(isAdult)

    val day = 3
    val dayString = when(day){
        1 -> "Mon"
        2 -> "Tue"
        3 -> "Wed"
        4 -> "Thu"
        5 -> "Fri"
        6 -> "Sat"
        7 -> {

            println("Sunday")
            "Sun"
        }
        else -> "None"
    }
    println(dayString)
}