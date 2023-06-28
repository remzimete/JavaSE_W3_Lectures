package n42_Java_DATEANDTIME;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class App {



    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();


        System.out.println(currentDate);



        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println(currentDateAndTime);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting" + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myFormatObj.format(myDateObj);
        System.out.println(myFormatObj);
        System.out.println(formattedDate);
    }







}
