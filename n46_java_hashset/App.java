package n46_java_hashset;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("Tesla");
    cars.add("Tesla");
    cars.add("Car Bla Bla");
        System.out.println(cars);

        System.out.println(cars.contains("Mazda"));
        System.out.println(cars.remove("2Mazda"));

        cars.size();
        for (String i:cars) {
            System.out.println(i + "cars.size(); " + cars.size());
        }




        // create a hashset object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
        // add values to the set
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
            // show which numbers between 1 and 10 are in the set
        for (int i = 0; i <= 10; i++) {
            if(numbers.contains(i)){
                System.out.println(i + " found in the set.");
            }else{
                System.out.println(i + " not found bro");
            }
        }





    }

}
