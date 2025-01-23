//Typealias:
//typealias is a keyword use to create an alias for an extension type, This can make code more readable and concise
//by providing a more meaningful name for a complex or less description type.

//UseCases:
//1. Simplifying the type names
//2. Complex Generic Types
//3. Function Types

typealias UserId = String
typealias StringMap = Map<String, String>

typealias ClickHandler = (Int) -> Unit

fun setClickHandler(handler: ClickHandler) {
    handler(5)
}

fun main() {

    val userId: UserId = "Ranjeet"
    val stringMap: StringMap = mapOf("1" to "One")

    val clickHandler: ClickHandler = {
        println("Handling Click Event")
    }

    setClickHandler(clickHandler)

}