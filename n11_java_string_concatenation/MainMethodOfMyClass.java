package n11_java_string_concatenation;

public class MainMethodOfMyClass {

    public static void main(String[] args) {

        // Java String Concatenation

        String firstName,lastName;
        firstName = "John";
        lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.concat(lastName));

        int x = 10;
        int y = 20;
        int z = x + y;

        String xNumber = "10";
        String yNumber = "20";
        String zNumber = xNumber + yNumber;
    
        System.out.println(z);
        System.out.println(zNumber);

        System.out.println(xNumber + x);

    }

}
