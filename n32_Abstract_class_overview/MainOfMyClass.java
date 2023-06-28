package n32_Abstract_class_overview;

public class MainOfMyClass {


    // studentclass.java
    // abstractclass.java


    public static void main(String[] args) {


        /*

        create an object of the student class (which inherits attributes and methods from AbstractClass)


        * */
           StudentClass myObj = new StudentClass();
           System.out.println("Name : " + myObj.fname);
           System.out.println("Age : " + myObj.age);
           System.out.println("Graduation Year: " + myObj.graduationYear);
           myObj.study(); // call abstract method.

    }


}
