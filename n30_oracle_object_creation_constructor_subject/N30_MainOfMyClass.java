package n30_oracle_object_creation_constructor_subject;


import java.awt.*;

// create a main class
public class N30_MainOfMyClass {

    //Bir Sınıfın -  Bir obje oluşturuluyor ve onu değişkene atıyoruz.
// https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html






    int x = 5;

    public static void main(String[] args) {
        Point originOne = new Point(23,94);
        Rectangle rectOne = new Rectangle(originOne,100,200);
        Rectangle rectTwo = new Rectangle(50,100);

        System.out.println(rectOne.origin.x);
        System.out.println(rectTwo.origin.y);

        int number = new N30_MainOfMyClass().x;
        System.out.println(number);



    }



    /*
    1. Declaration 1. kısımda önce değişken ismiyle obje tipi ile bir tanımlama gerçekleştiriliyor
    Point originOne gibi
    2. Instantiation Kısmında new keyword'u : birr java operator'ü objeyi oluşturur.
    3. Inıtialization = The new operator is followed by a call to a constructor , which initializes the new object.

    Declaring a variable to Refer to an Object.

    type name;

    Reference variable
    Point originOne
    
        



     */



}
