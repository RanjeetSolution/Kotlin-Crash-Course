//Operator Function
//Kotlin operator function allow you to define custom behavior for operator, like +, -, *, /, [], == etc in your classes
//They make possible to use these operators with your custom types in a more intuitive and readable way.

data class Point(val x: Int, val y: Int){

    operator fun plus(other: Point): Point{
        return Point(x = x + other.x, y = y + other.y)
    }

    operator fun minus(other: Point): Point{
        return Point(x = x - other.x, y = y - other.y)
    }

    operator fun times(scalar: Int): Point{
        return Point(x = x * scalar, y = y * scalar)
    }

}

fun main() {

    val point = Point(1, 3)
    val point2 = Point(3, 6)

    val point3 = point + point2
    val point4 = point3 * 4

    println(point3.x)
    println(point3.y)
    println(point4)

}

//Arithmetic Operator function
//plus: +
//minus: -
//times: *
//div: /
//rem: %
//unaryPlus: +a
//unaryMinus: -a
//inc: ++
//dec: --

//Comparison Operator Function
//compareTo: <,>, <=, >=
//equals: ==, !=

//Collection-like Operator function
//get: a[i]
//set: a[i] = b
//contains: in
//iterator: for(a in b)

//other Useful operator functions:
//invoke: a()
