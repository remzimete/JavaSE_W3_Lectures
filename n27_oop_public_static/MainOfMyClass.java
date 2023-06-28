package n27_oop_public_static;

public class MainOfMyClass {

    public static void main(String[] args) {

        // static method created without object.
        myStaticMethod();


        // public method created by object of a class which is With an instance
        MainOfMyClass objMain = new MainOfMyClass();
        objMain.myPublicMethod();


    }



    // static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    // public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }


}
