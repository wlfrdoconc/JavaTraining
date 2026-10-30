package workbook3.exercise6;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {

        // Create a search terminal app that asks a user to enter something to search for
        // This program should keep looping until the user enters the term X
        // Program will create a new file called logs.txt and store information on there

        // Encapsulate code below within a try catch

        Scanner read = new Scanner(System.in);

        // Keeps the program running until the user enters an X
        String userInput = "";


        // First logs when the application launches
        searchLogger("Launch");

        System.out.println("==== Welcome to the Search Engine Logger ====");

        System.out.print("Enter a term to search for, press X to exit: ");
        String enteredTerm = read.nextLine();

        while (!enteredTerm.equalsIgnoreCase("X")) {
            System.out.print("Enter a term to search for, press X to exit: ");
            userInput = read.nextLine();


            // Checks if the user wants to exit
            if (userInput.equalsIgnoreCase("X")) {
                searchLogger("exit");
                System.out.println("exiting application...");
                break;
            }

            // If they don't want to exit then record the user's input into logs.txt
            searchLogger("search: " + userInput);

        }
    }

    // Initial Approach
     /* public static void searchLogger (String word) {
        try {
            // Create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(new FileReader("logs.txt"));

            String input;

            while((input = bufReader.readLine()) != null) {
                if (input.toLowerCase().contains(keyword.toLowerCase)) {
                    System.out.println(input);
                }
            }
            bufReader.close();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

        */

    // Revised searchLogger() method

    public static void searchLogger(String action) {
        try {
            FileWriter fileWriter = new FileWriter("logs.txt", true);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            // Record the date, time, and user action
            String timestamp = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            bufWriter.write(timestamp + " " + action);
            bufWriter.newLine();

            bufWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
