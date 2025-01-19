package org.example

import java.lang.IllegalArgumentException

class Person4{

    var name: String = "John"
        get() = field.uppercase()

    //custom setter
    set(value) {
        field = value.lowercase()
    }

    var age: Int = 0
        set(value) {
            if (value>=0){
                field = value
            }else{
                throw IllegalArgumentException("Age Can't be negative")
            }
        }

}
fun main() {
val person = Person4()
    person.age = 25
    println(person.age)

    person.name = "Ranjite" //Setter Method Will be call
    println(person.name) //Getter Method Will be call
}