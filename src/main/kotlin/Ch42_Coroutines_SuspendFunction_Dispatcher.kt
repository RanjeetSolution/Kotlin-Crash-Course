//Coroutines are like lightweight thread that can be launched to perform some work asynchronously
//Unlike Thread, They are not tied to any specific thread in the underlying operating system
//Instead, They are managed by a CoroutineDispatcher, which determines in thread or pool of threads they execute on

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun main() {

    val job = runBlocking {
       val jon1 =launch(Dispatchers.IO) {
            delay(1000L) //api Calling
            println("Api fetched")
           println("Launch Thread: ${Thread.currentThread()}")
        }

        println("Main Thread: ${Thread.currentThread()}")
        println("After Launched")
        //jon1.cancel()

        val job2 = async(Dispatchers.IO) {
            delay(1000L) //api Calling
            println("Async Api fetched")
            println("Launch Thread: ${Thread.currentThread()}")
            5
        }

        val job3 = async(Dispatchers.IO) {
            delay(1000L) //api Calling
            println("Async Api fetched")
            println("Launch Thread: ${Thread.currentThread()}")
            6
        }

        val data = listOf(job2, job3).awaitAll()
        println(data)

    }

    suspend fun test(){
        delay(1000L)
    }







}