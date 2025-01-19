//A Data class must have at least one parameter in the primary constructor
//data class Empty() //Not Allowed

//Data Classes Can't be abstract, open, sealed or inner
//data class User2(val name: String, val age: Int): User(name, age)
data class User(val name: String, val age: Int){

    //custom
    override fun toString(): String {
        return "Name: $name Age $age"
    }
}

fun main() {
    val user1 = User("Ranjeet", 18)
    val user2 = User("Ranjeet", 18)

    println(user1 == user2)
    println(user1)

    val user3 = user1.copy()

    println(user1 == user3)

    println(user3.component1())
    println(user3.component2())

}
