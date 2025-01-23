import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

//Buffered File IO
//Instance of reading or writing one Byte at a time, buffered I/O read or writes data in larger chunks, multiple line at a time
//This batch processing significant improves performance, especially when dealing with large file or
//repetitive I/O operation

//In the unbuffered example, each line read from the file may involve a separate system call
//which is less efficient. In the buffered example,  the BufferedReader reads larger chunks of data
//Into memory at once, making the process faster and more efficient


fun main() {

    val file = File("example5.txt").also {
        if (!it.exists()){
            it.createNewFile()
            it.writeText("Test")
        }
    }

    file.readLines().forEach {
//        println(it)
    }

    val bufferedReader = file.bufferedReader()
    var line: String?
    bufferedReader.use {
        while ((bufferedReader.readLine().also { line = it }) != null){
            println(line)
        }
    }

    BufferedWriter(FileWriter(file))

}