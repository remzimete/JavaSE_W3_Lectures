package n47_java_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        // make a collection i created cars object on ArrayList class
    ArrayList<String> cars = new ArrayList<String>();

        cars.add("BMW");
    cars.add("Volvo");

    cars.add("BMW");
    cars.add("WWDKW");



    ArrayList<Integer> nameOfObjectArrayList = new ArrayList<Integer>();
    nameOfObjectArrayList.add(5);
    nameOfObjectArrayList.add(1);
    nameOfObjectArrayList.add(16);
    nameOfObjectArrayList.add(19);
    nameOfObjectArrayList.add(16);
    nameOfObjectArrayList.add(6);
    nameOfObjectArrayList.add(7);

    Iterator<Integer> itNumbers = nameOfObjectArrayList.iterator();

    while(itNumbers.hasNext()){


        if(itNumbers.next() < 10) itNumbers.remove();

    }
        System.out.println(nameOfObjectArrayList);



    // get the iterator

    Iterator<String> it = cars.iterator();
        System.out.println(it.next()); // print the first item.

        while(it.hasNext()){
            System.out.println(it.next());
       

        }



    }





}
