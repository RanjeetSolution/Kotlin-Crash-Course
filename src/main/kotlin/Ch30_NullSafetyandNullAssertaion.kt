//Null safety is a crucial features in programming language like kotlin
//that helps prevent null pointer exception at runtime

//Variables in kotlin are non-nullable by default, to make a variable nullable
//we use the ? symbol

fun main() {

    var nullableString: String? = null

    val length = nullableString?.length ?: 0
    println("Length of nullableString is $length")

    val obj: Any = "Hello"
    val stringLength = obj as? String

}