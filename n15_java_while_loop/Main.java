package n15_java_while_loop;

public class Main {


    public static void main(String[] args) {



        // i dışarıda olduğu için i artmış oluyo haliyle :P main bloğu arasında scope u arasında.

        int iWhile = 0;

        while (iWhile < 5) {
            System.out.println(iWhile);
            iWhile++;
        }

        while(iWhile<10){
            System.out.println("hey" + "  " + iWhile);
            iWhile++;
        }
    }



}
