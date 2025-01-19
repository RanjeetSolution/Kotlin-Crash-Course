package org.example

//Visibility Modifier:- public, private, protected, internal
//internal: visible in the same module

//Default visibility: public, visible, everyWhere
//protected: only visible in the same package to subclasses of that classes
//private: only visible in the same class

class Person1(){

    //Properties
    var name: String = ""
    var age: Int = 0

    //Method
    fun printInfo(){
        print("Name: $name. Age $age")
    }

}

//Primary Constructor
class Person2(var name: String = "",
              var age: Int = 0){

    init {
        println("Person is created with name = $name and age $age")
    }

    //Method
    fun printInfo(){
        print("Name: $name. Age $age")
    }

}

//Secondary Constructor
class Person3(private var name: String = "",
              private var age: Int = 0){

    init {
        println("Person is created with name = $name and age $age")
    }

    //only one constructor
    constructor(
        name: String
    ): this(){

    }

    constructor(person2: Person2): this(){
        this.age = person2.age
        this.name = person2.name

    }

    //Method
    fun printInfo(){
        print("Name: $name. Age $age")
    }

}

fun main() {

    val person1 = Person1()
    person1.name = "User"
    person1.age = 10

    var person2 = Person2("Ranjit", 25)

    var person3 = Person3("Ranjit", 25)

    var person4 = Person3(person2)

    person1.printInfo()
    person2.printInfo()
    person3.printInfo()
    person4.printInfo()
}