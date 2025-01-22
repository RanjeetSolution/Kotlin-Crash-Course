//Higher-order function in kotlin are functions that can be take other function as parameters or return function
//They are widely used in kotlin for task like filtering collection, event handling, dependency injection, and more

//kotlin's standard library provides useful higher-order function like map, filter, reduce etc. for manipulating collection
//which accept lambdas as parameters

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun getMathOp(opName: String): (Int, Int) -> Int {
    return when(opName){
        "add" -> { a, b -> a+b }
        "sub" -> {a, b -> a-b}
        "mul" -> {a, b -> a*b}
        else -> {_, _ -> 0 }
    }
}

fun main() {

    val result = operateOnNumbers(10, 20){a, b ->
        a+b
    }

    val result2 = operateOnNumbers(10, 20){a, b ->
        a*b
    }

    println(result)
    println(result2)

    val op = getMathOp("add")
    println(op(2, 3))

}