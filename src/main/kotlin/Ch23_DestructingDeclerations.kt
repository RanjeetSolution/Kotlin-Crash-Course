//Destructing Declaration:-
//Are used to unpack value from collection into variables

fun main() {
    val user = User("Ranjite", 20)
    val (name, _) = user
    println(name)
}