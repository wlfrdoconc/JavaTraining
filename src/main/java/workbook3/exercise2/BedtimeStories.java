package workbook3.exercise2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        // Do Workbook 3

        // Scanner to let users choose which quotes they would like to pick
        Scanner read = new Scanner(System.in);

        try {

            printMenu();

            String fileName = fileSwitch(read);

            // create a FileReader object connected to the File
            FileReader fileReader = new FileReader(fileName);

            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            // read until there is no more data
            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }

            // close the stream and release the resources
            bufReader.close();

        }
        catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }

    }

    // Method to display the menu
    public static void printMenu() {
        System.out.println("==== Bedtime Stories ====\n");
        System.out.println("Choose a bedtime story:\n 1. Goldilocks\n 2. Hansel and Gretel\n 3. Mary had a Little Lamb" );
    }

    // Method to switch between the different files
    public static String fileSwitch(Scanner read) {
        System.out.println();
        System.out.print("Enter your choice: ");
        int userChoice = read.nextInt();

        // Create an empty String called fileName to switch between the different files
        String fileName = "";

        if (userChoice == 1) {
            fileName = "goldilocks.txt";
        } else if (userChoice == 2) {
            fileName = "hansel_and_gretel.txt";
        } else if (userChoice == 3) {
            fileName = "mary_had_a_little_lamb.txt";
        } else {
            System.out.println("Invalid choice!");
        }

        return fileName;

    }
}
