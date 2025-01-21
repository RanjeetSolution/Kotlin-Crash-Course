import javax.sound.midi.MetaMessage

//Any: Used to represent any type of value, parents of all types
//Nothing: USed to represent a value that does not exist, Subtype/child of all types

fun main() {

    val obj: Any = "Hello"

    val str1: String? = obj as? String
    val str2: String = obj as String

    val result = try {
        fail("any erroe")
    }catch (e: IllegalArgumentException){
        println(e.stackTrace)
    }

}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}