package n34_java_packages_Scanner;

import java.util.Scanner;

public class MainOfMyClassUsingScanner {


    public static void main(String[] args) {
        // create a object
        Scanner myObjOfScanner = new Scanner(System.in);
        // print Enter UserName
        System.out.println("Enter Username");
        // yeni satırı okuyacak. nextLine() method will get input from the next line that's going to inputted from user
        String userName = myObjOfScanner.nextLine();
        System.out.println("Username is : " + userName);

    }







}
