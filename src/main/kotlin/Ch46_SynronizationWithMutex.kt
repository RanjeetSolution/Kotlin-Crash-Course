import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

//Synchronization with Mutex
//In Kotlin, Mutex is a part of the Kotlinx.coroutines.sync package and is used to handle mutual exclusion
//ensuring that only one coroutine can access a particular resources or code block at a time.
//It's a common synchronization tool used to prevent race condition in programming

//Just for testing we are using runBlocking here IN real world we will use some coroutineScope OR
//lifecycleScope or viewModelScope(in android specific Apps)

fun main(): Unit = runBlocking {

    val mutex = Mutex()

    launch {
        mutex.withLock {
            println("Shared Code Block")
        }
    }

}

class BankAccount(private var balance: Int){

    val mutex = Mutex()

    suspend fun deposit(amount: Int){
        mutex.withLock {
            balance += amount
        }
    }

    suspend fun withdrawal(amount: Int){
        mutex.withLock {
            balance -= amount
        }
    }

}