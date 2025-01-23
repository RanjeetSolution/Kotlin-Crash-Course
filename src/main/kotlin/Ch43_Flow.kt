import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

//A suspending function asynchronously returns a single value,
//but we can return multiple asynchronous computed values? This is where Kotlin Flow come in

//Flow Builders
//1. Flow
//2. flowOf
//3. asFlow

fun simpleFlow() = flow {
    for (i in 1 .. 3){
        emit(i)
    }
}

fun simpleFlow2() = flowOf(4, 5, 6)

fun simpleFlow3() = listOf(7, 8, 9).asFlow()

@OptIn(DelicateCoroutinesApi::class)
fun main() {

    runBlocking {
        simpleFlow().collect{
            println(it)
        }


        simpleFlow2().collect{
            println(it)
        }

        simpleFlow3().collect{
            println(it)
        }

    }

}