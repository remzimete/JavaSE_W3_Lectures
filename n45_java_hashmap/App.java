package n45_java_hashmap;



import java.util.HashMap;






public class App {


    public static void main(String[] args) {


        HashMap<String,String> capitalCities = new HashMap<String,String>(); // create a hashmap object

        // Add keys and values (country,city)
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities.size());

        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        for(String i : capitalCities.values()){
            System.out.println(i);
        }

        for(String i : capitalCities.keySet()){
            System.out.println(i + " values : " + capitalCities.get(i));
        }


        capitalCities.clear();







        HashMap<String,Integer> nameAndAge = new HashMap<String,Integer>();

        nameAndAge.put("Name",55);
        System.out.println(nameAndAge);


        




    }






}
