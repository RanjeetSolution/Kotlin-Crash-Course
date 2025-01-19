package org.example

interface MyInterfaces{

    fun abstractMethod() //abstract Method

    fun concreteMethod(){
        println("This is Concrete Method")
    }

    val property: String
    val propertyWithDefault: String
        get() =  "Default"
}

class MyClass : MyInterfaces{

    override fun abstractMethod() {
        println("Abstract Method Implemented")
    }

    override val property: String = "Property Value"

}

interface MyInterfaces2{

    fun abstractMethod() //abstract Method

    fun concreteMethod(){
        println("This is Concrete Method")
    }
}

class MyClass2 : MyInterfaces, MyInterfaces2{

    override fun abstractMethod() {
        println("Abstract Method Implemented")
    }

    override fun concreteMethod() {
        super<MyInterfaces>.concreteMethod()
    }

    override val property: String = "Property Value"

}

fun main() {
val obj = MyClass()
    obj.abstractMethod()
    obj.concreteMethod()
    println(obj.property)
    println(obj.propertyWithDefault)

    val obj2 = MyClass2()
    obj2.abstractMethod()
    obj2.concreteMethod()
    println(obj2.property)
    println(obj2.propertyWithDefault)
}