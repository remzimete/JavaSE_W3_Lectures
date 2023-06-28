package n31_java_modifiers;

public class MainOfMyClass {

final int x = 10;
final double PI = 3.14;




    public static void main(String[] args) {


        MainOfMyClass myObj = new MainOfMyClass();
//        myObj.x = 50; // will generate an error : cannot assign a avlue to a final variable
//        myObj.PI = 50; // WİLL GENERATE AN ERROR : CANNOT ASSİGN A VALUE TO A FİNAL VARİABLE


        System.out.println(myObj.x);
        System.out.println(myObj.PI);


        myStaticMethod();

//        MainOfMyClass myObj = new MainOfMyClass();
        myObj.myPublicMethod();


    }

    static void myStaticMethod(){
        System.out.println("Static methods can be aclled without creating objects");

    }

    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }






}
