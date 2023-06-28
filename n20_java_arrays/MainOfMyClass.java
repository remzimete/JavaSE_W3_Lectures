package n20_java_arrays;

public class MainOfMyClass {


    public static void main(String[] args) {

        //String[] cars;

       // creating an array.


        String[] cars = {"volvo","bmw","ford","tesla"};

        int[] numbersOfTickets = {10,20,30,40,50};

        // access the elements of an array
        System.out.println(cars[0]);
        System.out.println(numbersOfTickets[0]);


        String zero_Element_Of_Car_Array =  cars[0];
        System.out.println(zero_Element_Of_Car_Array);

        // changing an array element

        cars[0] = "togg";

        // array length

        System.out.println(cars.length);
        System.out.println(cars.length);
        System.out.println(numbersOfTickets.length);



    }




}
