package n14_java_switch;

public class MainOfMyClass {

    public static void main(String[] args) {

        int day = 6;

        switch(day){

            case 0:
                System.out.println("Monday is the day :)");
                break;
            case 1:
                System.out.println("Tuesday is the day :) ");
                break;
            case 2:
                System.out.println("Wednesday is the day :)");
                break;
            case 3:
                System.out.println("Thursday is the day :)");
                break;
            default:
                System.out.println("Girilen Değer Geçersiz.");
                break;

        }

    }


}
