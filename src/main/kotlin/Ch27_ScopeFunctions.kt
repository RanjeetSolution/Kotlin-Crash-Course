import java.io.File

//ScopeFunctions
//1. let
//2. run
//3. with
//4. apply
//5. also

fun main() {

    //let
    val user: User? = User("Test", 1)
    val user2: User = User("Test", 1)

    val user1 = user?.let {
        println(it.name)
        println(it.age)
        it //last line value is returned
    }

    val sb = StringBuilder()
    sb.append("Hello")
    sb.append("World")
    val str = sb.toString()

   val str2 = sb.run {
        append("Hello")
        append("Ranjit")
       toString()
    }

    //with
   val str3 = with(user2){
        "Name: $name, Age: $age"
    }
    println(str3)

    class User5(){
            var name: String = "Ram"
        var age: Int = 50
        //custom
        override fun toString(): String {
            return "Name: $name Age $age"
        }
    }

    //apply
    val user5 = User5().apply {
        name = "Ranjite"
        age = 17
    }
    println(user5)

    //also
    val file = File("example.txt").also {
        //Logging
        println("file ${it.name} is being created")
        it.createNewFile()
    }


}