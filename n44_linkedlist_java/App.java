package n44_linkedlist_java;

import java.util.LinkedList;

public class App {


    public static void main(String[] args) {

        // initilization Type String - value Type = String ?
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("cars");
        cars.add("volvo");
        cars.add("tesla");
        cars.add("ford");

        System.out.println(cars);


        System.out.println(cars.get(0));
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        cars.addFirst("first");
        cars.addLast("laast");
        System.out.println(cars.removeFirst());
        System.out.println(cars.removeLast());
    }




}
