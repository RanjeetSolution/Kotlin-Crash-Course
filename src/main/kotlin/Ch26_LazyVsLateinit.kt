//Lazy vs lateinit
//Lazy: Delayed initialization of properties
//lateinit: Non-nullable variable that will be initialized later

class LazyVsLateInit{
    lateinit var userLateInit: User //android views


     val userLazy: User by lazy {
         User("ITSolution", 4)
     }
}

fun main() {

    val obj = LazyVsLateInit()
    println(obj.userLateInit)
    obj.userLateInit = User("ItSolution", 20)
    println(obj.userLateInit)

    println(obj.userLazy)
}