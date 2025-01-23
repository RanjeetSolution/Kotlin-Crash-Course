import kotlin.reflect.KClass

//Reflection: Kotlin reflection is a feature that allow you to inspect and manipulate kotlin classes, functions
//properties, and other element at runtime, It can be quite powerful but should be used as less as possible
//Due to potential performance overhead and increased complexity
//We may need them(::class) in android in specific scenarios: While Using Intent, Service etc..

class YourClass(val name: String){

    fun yourFun(){
        println(name)
    }
}

fun main() {

    val kcls: KClass<YourClass> = YourClass::class
    val cls: Class<YourClass> = YourClass::class.java

    val func = YourClass::yourFun

}