package n17_java_for_loop;

public class MainOfMyClass {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){

            System.out.println(i);

        }


        for (int i = 0; i < 50; i = i + 5) {
            System.out.println(i);
        }

        System.out.println("nested LOOP:");

        for(int i = 0; i < 2; i++){
            System.out.println(i + " OUTER LOOP");
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
            }

        }







    }

}
