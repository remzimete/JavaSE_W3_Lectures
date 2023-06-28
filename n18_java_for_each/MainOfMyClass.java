package n18_java_for_each;

public class MainOfMyClass {


    public static void main(String[] args) {


        // following code outputs all elements in the cars array, using a for each loop

        String[] cars = {"Volvo", "BMW", "Ford", "Mustang"};


        for (String eachCar : cars){
            System.out.println(eachCar);
        }


    }

}
