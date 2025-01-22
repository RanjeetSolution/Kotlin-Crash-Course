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

    fun <T> getAllItems(repo: Repository<T>) : List<T>{
        return repo.getAll()
    }

}

fun main() {

    val product1 = Repository.SomeProduct(1, "Laptop", 200.0)
    val product2 = Repository.SomeProduct(1, "Laptop", 200.0)

    val productRepo = Repository<Repository.SomeProduct>()
    productRepo.add(product1)
    productRepo.add(product2)

//    productRepo.getAll().forEach {
//        println(it)
//    }

    getAllItems(productRepo)

    //
    val userRepo = Repository<User>()
    userRepo.add(User("USer1", 21))
    userRepo.add(User("USer2", 25))

    userRepo.getAll().forEach {
        println(it)
    }

}

//star projections
fun getAllItems(repo: Repository<*>) : List<*>{
    return repo.getAll()
}

fun <T: Comparable<T>> compare(repo: Repository<T>) : List<T>{
    return repo.getAll()
}
