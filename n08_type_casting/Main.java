package n08_type_casting;

public class Main {

/*
*
* Type Casting
* Widening Casting.
* Narrowing Casting.
*
* */
    public static void main(String[] args) {

        //Widening Casting
        int myInt = 9;
        double myDouble = myInt; // otomatik olarak integer'dan double'a geçmiş oluyo
        System.out.println(myInt);
        System.out.println(myDouble);

        //

        //Narrowing Casting.

        double myDouble2 = 55.5D;
        int myInt2 = (int) myDouble2;// bir üstündeki değerden kapasitesi kadar değeri alıyor.
        System.out.println(myDouble2);
        System.out.println(myInt2);


        String txt = "Please locate where  where locate occurs!";
        System.out.println(txt.indexOf("occurs"));


    }




}
