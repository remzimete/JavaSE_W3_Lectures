package n10_java_Strings;

import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        String greeting = "          Hello";
        System.out.println(greeting);
        System.out.println(greeting.length());
        String randomText = "qwdlqwüğdlqwğpüdüqwüdlqwdkqwpükdpüqwdpüqwdpüwkqüpdkpqwd";
        System.out.println(randomText.length());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.indexOf("Hello"));
        String txt = "Please locate where locate occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
    }

}
