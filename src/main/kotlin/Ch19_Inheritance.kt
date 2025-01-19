package org.example

//By default, all classes in kotlin are final, we can't inherit from them
//To inherit from a classes, we use the keyword "open"
//Similarly function and properties are also final by default
//To override a function or property, we use the keyword "open"

open class Vehicle(private val name: String, private val speed: Int){

   open fun displayInfo(){
        println("Vehicle Name: ${this.name}")
        println("Vehicle Speed: ${this.speed}")
    }
}

class Car(
    private val name: String,
    private val speed: Int,
    private val numOfDoors: Int
):Vehicle(name, speed){
    override fun displayInfo(){
        println("numOf Doors: ${this.numOfDoors}")
        super.displayInfo()
    }
}

fun main() {

    val car = Car("Thar", 120, 4)
    car.displayInfo()
}