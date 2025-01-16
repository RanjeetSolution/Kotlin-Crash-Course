package org.example

//lateinit variable
//Non-nullable variable that will be initialized later
//Cant'n be used with primitive types in kotlin: Byte, Short, Int, Long, Float, Double, Char and Boolean

fun main() {

    val lateinitExample = LateinitExample()
    lateinitExample.initializedName()
    lateinitExample.printName()
}

class LateinitExample{
    lateinit var name:String

    fun initializedName(){
        name = "Kotlin"
    }

    fun printName(){
        if (::name.isInitialized){
            println(name)
        }else{
            println(name)
        }
    }
}
