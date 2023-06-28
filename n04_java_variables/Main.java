package n04_java_variables;

public class Main {
    public static void main(String[] args) {
        String name = "John";
        int age = 55;
        int age2 = 1_234_567_890; // alt tire'yi kullanarak daha iyi sayıyı gözlemleyebilriiz.
        float balance = 50.30f; // compiler'in double mı float mı ayırımını yapması için.
        char driverLicenseType = 'A';
        boolean doYouHaveCar = true;


        int calculateOne = 96;
        int calculateSecond = 95;

        int total = calculateOne + calculateSecond;

        System.out.println(total);



        System.out.println(name + " " + age + " " + age2 + " " +balance + " " + driverLicenseType + " " + doYouHaveCar);


    }
}
