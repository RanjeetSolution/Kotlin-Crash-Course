import org.example.MyInterfaces

//object keyword
//object keyword is used to create a companion object for creating static fields and method of a class
//object keyword can be used to create a singleton
//object keyword can be used to create a factory function
//anonymous object can be created using the object keyword

object MySingleton{
    var name: String = "Singleton"

    fun printName(){
        println(name)
    }
}

 class MyClass5{

     val age: Int = 16

     companion object{
         var name: String = "Singleton"

         fun printName(){
             println(name)
         }
     }
}

fun main() {
    println(MySingleton.name)
    MySingleton.printName()

    println(MyClass5.name)
    MyClass5.printName()

    val obj = MyClass5()
    println(obj.age)

    val anony = object : MyInterfaces{
        override fun abstractMethod() {
            println("Testing object anonymous impl")
        }

        override val property: String
            get() = "Test"
    }
    anony.abstractMethod()
}