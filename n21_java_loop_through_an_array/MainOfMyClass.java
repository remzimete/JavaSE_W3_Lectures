package n21_java_loop_through_an_array;

public class MainOfMyClass {

    public static void main(String[] args) {


        // array'deki i eleman kadar
        // i yi döndür. ve tek tek o elemanların invoke edilmesini sağla.

        String[] cars = {"Mazda","Volvo","Auto"};

        for(int i=0; i < cars.length; i++){
            System.out.println(cars[i]);
        }


        int[] pointsOfPeople = {1,2,3,4,5,6,7,373474373,34734737,347437373,34534};

        for(int i = 0; i < pointsOfPeople.length; i++){
            System.out.println(pointsOfPeople[i]);
        }

        for(int i : pointsOfPeople){
            System.out.println(i);
        }

        int[] cards = {0,9,4,6,3,7};
        for (int i : cards){
            System.out.println(i);
                            }

        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }



    }

}
