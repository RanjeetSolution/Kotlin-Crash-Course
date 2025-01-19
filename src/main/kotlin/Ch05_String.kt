package org.example

//String are immutable, Each time we assign a new value to the variable, a new object is created

//StringBuilder and StringBuffer are mutable, so it can be changed in place

fun main() {
    val name: String = "Ranjeet Kumar"
    println(name)

    val multiLineString = """
        Android Developer
    """.trimIndent()
    println(multiLineString)

    val escapedString = "This is an \"escaped\" string"
    println(escapedString)

    val country = "India"
    println("My name is $name and my Country is $country")
    println("My name length is ${name.length}")

    //use ful method
    println(name.length)
    println(name[0])
    println(name.substring(0, 8))
    println(name.contains("ranjeet"))
    println(name.contains("ranjeet", ignoreCase = true))
    println(name.replace("Kumar", "Yadav"))
    println(name.uppercase())
    println(name.lowercase())
    println(name.isEmpty())
    println(name.isNotBlank())
    println(name.isBlank())
    println(name.isNullOrBlank())
    println(name.isNullOrEmpty())

    //StringBuilder and String Buffer

    val sb = StringBuilder("Hello")
    sb.append(" world", "Hi Kotlin")
    sb.insert(0, "Hi")
    println(sb)

    val sbuffer = StringBuilder("Hello")
    sbuffer.append(" world", "Hi Kotlin")
    sbuffer.insert(0, "Hi")
    println(sbuffer)



}