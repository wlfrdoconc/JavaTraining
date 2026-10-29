package workbook3.exercise5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        // Create an application that gets the current date and time and prints it in these formats
        // 1. 09/05/2021 10:02             <-- in GMT time
        // 2. 2021-09-05
        // 3. September 5, 2021
        // 4. Sunday, Sep 5, 2021
        //
        //
        // CHALLENGE (your local time zone):
        // 5:02 on O5-Sep-2021
        //

        System.out.println("Welcome to the Format Dates Program!");
        printFormattedDates();

    }

    public static void printFormattedDates() {
        System.out.println();

        // Get the current day
        LocalDateTime todayDate = LocalDateTime.now();

        // 1. 09/05/2021
        System.out.println("==== Format 1 ====");

        // Specify the date/format
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = todayDate.format(format1);
        System.out.println(formattedDate1);

        System.out.println();

        // 2. 2021-09-05
        System.out.println("==== Format 2 ====");

        // Specify the date/time format
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = todayDate.format(format2);
        System.out.println(formattedDate2);

        System.out.println();

        // 3. September 5, 2021
        System.out.println("==== Format 3 ====");

        // Specify the date/time format
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate3 = todayDate.format(format3);
        System.out.println(formattedDate3);

        System.out.println();

        // 4. Sunday, Sep 5, 2021
        System.out.println("==== Format 4 ====");

        // Specify the date/time format
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        String formattedDate4 = todayDate.format(format4);
        System.out.println(formattedDate4);
    }
}
