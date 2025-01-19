package org.example

//2D Arrays: Array of arrays

fun main() {

    val matrix2 = Array(3){
        IntArray(3)
    }

    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
        intArrayOf(10, 11, 12)
    )

    println(matrix.contentDeepToString())
    println(matrix[1][1])
    println(matrix[2][1])

    val rowSize = matrix.size
    val columnSize = matrix[0].size

    println(rowSize)
    println(columnSize)
}