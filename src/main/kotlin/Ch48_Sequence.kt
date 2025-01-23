//Kotlin Sequence are a powerful feature for handling collections in a more efficient
//and lazy way compared to traditional collection

//Benefits:
//Lazy Processing: Sequence process elements one at a time, so they don't need to build intermediate collection
//for each step of the transformation chain.

//Performance:
//Because of lazy evaluation, sequence can be more memory-efficient and faster for certain operation,
//especially when dealing with large data sets or complex pipelines.

fun main() {

    val number = sequenceOf(1, 2, 3)
    println(number.toList())

    val number2 = listOf(4, 5, 7).asSequence()
    println(number2.toList())

    val result = number.filter {
        it % 2 == 0
    }.map {
        it * it

    }

    println(result)

}