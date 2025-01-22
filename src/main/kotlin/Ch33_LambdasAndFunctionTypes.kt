import MyFunctionalInterface

//Function Types:
//Function can be used as type, thats why called function Types
//In Kotlin, functions are first-class citizens, meaning they can be assigned to variables
//passed as argument, and returned from other function

//Lambdas:
//Lambdas are instances of function types, which can be stored in variables and passed as arguments

//Single Abstract Method
fun interface MyFunctionalInterface {
    fun execute()
}

fun main() {

    val square: (Int) -> Int  = { value ->
        value * value
    }

    val square2: (Int) -> Int  = {
        it * it
    }

    val printMessage = { message: String ->
        "test"
    }

    val sumWithReceiver: Int.() -> Int = {
        this + 1
    }

    val funInterfaceimpl  = MyFunctionalInterface {
        println("executing")
    }

    funInterfaceimpl.execute()

}