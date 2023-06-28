package n50_java_regular_expression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;








public class App {


    public static void main(String[] args) {


        Pattern pattern = Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE); // burası bir value döndürüyor = obje
        Matcher matcher = pattern.matcher("Visit Schools!"); // o objeyi matcher methodu ile beraber işlesin diyoruz
                          // arrayle arrayın eşleşmesi gibi değer eşleştirmesi yapılyıor sanırım objeler arası ?
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }


    }




}
