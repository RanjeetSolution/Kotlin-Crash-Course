public class Ch43_UsingKotlinCodeInJava {

    public static void main(String[] arg){
        //If We remove @JvmStatic annotation from KotlinUtility.printMessage() function
        //It will show error in java compiler. Non-static method 'printMessage(java.lang.String)' can't be referred from a

        KotlinInJavaExample cls = new KotlinInJavaExample();
        cls.value = 5;

        KotlinUtility.printMessage("Test");
    }
}
