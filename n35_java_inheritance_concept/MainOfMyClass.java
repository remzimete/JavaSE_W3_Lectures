package n35_java_inheritance_concept;

public class MainOfMyClass {


    public static void main(String[] args) {

        // create a myCar Object
        Car myCar = new Car();

        // call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();


        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println("Brand Name : " + myCar.brand + " ModelName : " + myCar.modelName);


    }


}
