package org.example

//Type Checking and Smart Casts
//type Checking: is a process of checking if a variable is of a certain type
//Smart Casts: is a process of casting a variable to certain type

fun main() {

   println(typeChecker("Ranjit"))
   println(typeChecker(4))
}

fun typeChecker(obj:Any){

    when(obj){

        is String -> {
            //smart casted to string
            println("obj is string && its length is ${obj.length}")
        }

        is Int -> {
            //smart casted to Int
            println("obj is Int")
        }


    }
}