package org.example

//Exceptions: An exception is an error, which occurs during the execution of program
//Exception Handling: We can handle exception with try-catch block

fun main() {

try {
val result = 10/2
}catch (e:Exception){
println(e.message)
}

    try {
        val date = "123a"
        val number = date.toInt()
        println(number)
    }catch (e:NumberFormatException){
        println("Exception Details ${e.message}")
    }catch (e:Exception){
        println("Exception ${e.message}")
    } finally {
        println("It Will always be executed")
    }

    //Custom Exception
    class InvalidException(message: String) : Exception(message)

}