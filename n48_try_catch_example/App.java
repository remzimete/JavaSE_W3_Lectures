package n48_try_catch_example;

public class App {


    static void checkAge(int age){

        if(age < 18){
            throw new ArithmeticException("Access denied you must be at least 18 years old");

        }else {
            System.out.println("Access Granted - you are old enough!");
        }

    }

    public static void main(String[] args) {



            checkAge(15);









        // Java exceptions

        // TRY-CATCH

        try{
            // block of code to try


            int[] myNumbers = {1,2,3};

            System.out.println(myNumbers[10]);

        }catch(Exception e){
            // block of code to handle errors


            System.out.println("Something went wrong");







        }finally{
            System.out.println("THE 'tRY CATCH' is finishd.");
        }



    }


}
