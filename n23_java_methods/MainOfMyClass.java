package n23_java_methods;

public class MainOfMyClass {

    public static void main(String[] args) {

        myMethod();
        myMethod();
        myMethod();

        myMethodSecond("Ahmet");
        myMethodSecond("Zeynep");
        myMethodSecond("Diyanet");
        myMethodSecond("Hatice");
        myMethodSecond("Mete");
        myMethodSecond("Gülsüm");
        myMethodSecond("Semih");
        myMethodSecond("Betül");
        myMethodSecond("Meltem");
        myMethodSecond("Mert");
        myMethodSecond("Semih");
        myMethodSecond("Mustafa");


        multipleParam("Mete",19);

        returnValueMethod(5);

        int resultReturnValueMethod = returnValueMethod(535);
        System.out.println(resultReturnValueMethod);
    }


    static int returnValueMethod(int x){
        return 5+x;
    }


    static void multipleParam(String name,int age){
        System.out.println(name + " " + age);
    }


    static void myMethodSecond(String fName){
        System.out.println(fName);
    }

    // creating an method
    static void myMethod(){
        // code to be executed
        // kod işlenecek/olacak olan :
        System.out.println("Hello world");


    }


}
