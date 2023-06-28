package n26_OOP_introduction;

public class MainOfMyClass {


    public static void main(String[] args) {

        MainOfMyClass objName = new MainOfMyClass();
        MainOfMyClass objName2 = new MainOfMyClass();

        System.out.println(objName2.printName());




    }

        // fields - attributes
        String name = "John";


    public String printName(){

        return name;

    }








}
