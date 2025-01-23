//Kotlin annotation are a way to attach metadata to code element like classes, functions, properties, and more
//They can be used for various purpose, such as code generation, configuration, di etc...


//JvmField: Exposes a kotlin property as a field to java code without getter and setter

 class KotlinInJavaExample{
    //If we don't use @JvmField annotation, it will show error in java compiler while accessing value field on this class object

     @JvmField
     var value = 42

     fun tests(){
         KotlinUtility.printMessage("MEh")
     }
}

//JvmStatic: Marks a method or property as static when accessed from java
object KotlinUtility {
    //Now we can use it in java like this :
    //KotlinUtility.printMessage("Hello World")
    //But if we don't use @JvmStatic annotation, it will show error in java compiler

    @JvmStatic
    fun printMessage(message: String){

    }

}

//Some Other Annotation such as @Deprecated and @Serializable are also available in kotlin