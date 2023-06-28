package n35_Inheritance_2;

public class MainOfMyClass {

    public static void main(String[] args) {

        // create myCar obj from Car class
        Car myCar = new Car();

        // call the honk() method, from the vehicle class on the myCar object
        myCar.honk();

        // display them
        System.out.println(myCar.brandName + "  " + myCar.ModelName);

    }

}
