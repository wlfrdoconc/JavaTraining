package workbook3.exercise1;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        // Objective: Create an application that displays famous sayings or quotes
        // Bonus: Add a loop to the program asks the user if they want to see another quote/saying
        // If yes, repeat the process. Do not shut the application down when if an exception occurs, continue with iteration

        // Bonus: Add a way to display a random quote - TO DO

        System.out.println("=== Welcome to the Famous Quotes Generator ===");

        // Prompt the user to select a number from 1 to 10 and display that quote
        Scanner read = new Scanner(System.in);

        // Keeps the program running until the user exits
        String currentChoice = "";

        // Displays the menu STARTER LOGIC
        // While loop that navigates through the program
        while (!currentChoice.equalsIgnoreCase("No")) {

            // Try/Catch
            try {
                // Create an array of strings that stores 10 quotes
                String[] quotes = {
                        "Small habits lead to big changes.",
                        "Focus on progress, not perfection.",
                        "Every action shapes who you become.",
                        "Consistency matters more than intensity.",
                        "Success starts with daily improvement.",
                        "Build systems, not just goals.",
                        "Your habits shape your future.",
                        "Make good habits easy to follow.",
                        "Improve yourself one percent every day.",
                        "Lasting change starts with small steps."
                };


                System.out.print("Pick a quote (select from #1 to #10): ");
                int enteredIndex = read.nextInt();

                enteredIndex--; // Change number from range 1-10 to 0-9

                read.nextLine();
                // As long as the user entered a number in the range of 1-10 the program will work

                // Prints out the requested quote from the array
                System.out.println(quotes[enteredIndex]);
            } catch (Exception e) {
                System.out.println("Your number was out of range!");
                e.printStackTrace(); // Prints the complete history of an exception to the standard error stream
            }

            System.out.print("Would you like to see another quote? Enter yes/no: ");
            currentChoice = read.nextLine();
        }
    }
}