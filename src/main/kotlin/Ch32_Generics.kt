//Generics
//use generics to create type-safe and reusable code. Generics allow you to define
//Classes, interfaces, and functions with type parameters
//Sometime we may need to write some code which way need to be used with any data types

class Repository<T>{
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun delete(item: T) {
        items.remove(item)
    }

    fun getAll(): List<T> = items.toList()

    data class SomeProduct(val id: Int, val name: String, val price: Double)

}

fun main() {

    val product1 = Repository.SomeProduct(1, "LAptop", 200.0)
    val product2 = Repository.SomeProduct(1, "LAptop", 200.0)
}