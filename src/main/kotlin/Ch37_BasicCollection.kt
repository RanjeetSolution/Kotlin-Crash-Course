//Basic Collections
//In Kotlin, we have standard library functions for working with collection
//List
//Set
//Map

fun main() {
    val list = listOf<Int>(1, 2, 3, 1)
    //list.add()

    val mList = mutableListOf<Int>(1, 2, 3)
    mList.addLast(4)

    for (item in list){
        println(item)
    }

    for (item in mList){
        println(item)
    }

    val set = setOf<Int>(1, 2, 3, 1)
    println(set)

    val mSet = mutableSetOf<Int>(1, 2, 3, 1)
    mSet.add(6)
    println(mSet)

    val map = mapOf<Int, String>(
        1 to "One",
        2 to "Two",
        Pair(3, "Three")
    )
    println(map)


    val mMap = mutableMapOf<Int, String>(
        1 to "One",
        2 to "Two",
        Pair(3, "Three")
    )
    mMap.put(4, "Four")
    println(mMap)


}