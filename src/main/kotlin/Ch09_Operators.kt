package org.example

//Operators: Are used to perform mathematical or boolean operation on two or more variable
//Arithmetic operator: +, -, *, /, %
//Comparison operators: <, >, <=, >=
//Logical Operator: &&, ||, !

fun main() {
    val a = 10
    val b = 5

    val sum = a+b
    val sub = a-b
    val mul = a*b
    val div = a/b
    val mod = a%b

    println(sum)
    println(sub)
    println(mul)
    println(div)
    println(mod)

    var num = 4
    println(num++)
    println(++num)
    println(--num)

    println("a > b = ${a>b}")
    println("a < b = ${a<b}")
    println("a >= b = ${a>=b}")
    println("a <= b = ${a<=b}")

    //Assignment Operator
    var d = 20
    d = d + 5
    d += 5

    //logical operator
    var var1 = false
    var var2 = true
    println("a < b && b < 6 = ${a < 5 && b < 6}")
    println("var1 && var2 = ${var1 && var2}")
    println("var1 || var2 = ${var1 || var2}")
    println("!var2 = ${!var2}")

}