package n40_enums;

import java.sql.SQLOutput;
import java.util.ArrayList;
public class App {



    enum Color {
        RED,GREEN,YELLOW,BLUE
    }



    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1,City.ANKARA,"Ahmet",Color.BLUE));
        customers.add(new Customer(2,City.Istanbul,"Ayse",Color.RED));
        customers.add(new Customer(3,City.Izmir,"Merve",Color.GREEN));
        customers.add(new Customer(4,City.Istanbul,"Ayse",Color.BLUE));

        for (Customer customerEach : customers){
            if(customerEach.getFavoriteColor() == Color.BLUE){
                System.out.println("MAVİ OLANLAR:" + customerEach.getName());
            }


            switch(customerEach.getFavoriteColor()){

                case BLUE:

                    System.out.println("SONUÇ MAVİ: " + customerEach.getName() + customerEach.getCity().plateCode);

                    break;
                case YELLOW:

                    System.out.println("SONUÇ SARI: " + customerEach.getName() + customerEach.getCity().plateCode);

                    break;
                case RED:

                    System.out.println("SONUÇ KIRMIZI: " + customerEach.getName() + customerEach.getCity().plateCode);
                    break;
                case GREEN:


                    System.out.println("SONUÇ YEŞİL : " + customerEach.getName() + customerEach.getCity().plateCode);
                    break;

            }



        }

        // ENUM FOREACH
        City[] cities = City.values();


        for(City city : cities){
            System.out.println(city + " code : " + city.plateCode);
        }





    }

}
