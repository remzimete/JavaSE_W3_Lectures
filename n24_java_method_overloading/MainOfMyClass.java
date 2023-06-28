package n24_java_method_overloading;

public class MainOfMyClass {

    public static void main(String[] args) {


        SayHi();

        SayHi("mete");


    }

    static void SayHi(){
        System.out.println("Hello");
    }

    static void SayHi(String fName){
        System.out.println("hello");
    }



    static void SayHi(String fName,String lName){
        System.out.println("hello");
    }

    static String SayHi(String fName,String lName,String age){
       return fName + lName + age;
    }



}
