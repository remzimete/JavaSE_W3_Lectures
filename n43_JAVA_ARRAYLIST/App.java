package n43_JAVA_ARRAYLIST;

import java.lang.reflect.Array;
import java.util.ArrayList; // import the array list class
import java.util.Collections;



public class App {








    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<>(); // create an ArrayList object
        cars.add("Volvo");
        cars.add("Tesla");
        cars.add("Ford");
        cars.add("Mazda");


        System.out.println(cars);

        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        cars.set(0,"Opel");
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars.get(0));



        for(String i : cars){
            System.out.println(i);
        }


        cars.clear();

        cars.size();

        ArrayList<Integer> numbersOfDeck = new ArrayList<Integer>();
        numbersOfDeck.add(150);
        numbersOfDeck.add(12);
        numbersOfDeck.add(12);
        numbersOfDeck.add(1634);
        numbersOfDeck.add(16346346);

        for (int i : numbersOfDeck){
            System.out.println(i);
        }

        Collections.sort(numbersOfDeck);

        for (int i : numbersOfDeck){
            System.out.println(i);
        }


    }








}
