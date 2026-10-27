package workbook3.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("Reading and writing files");

        // 1. Calling text from a file
        // Without files this will return an error
        // Create a poem.txt file at the project root -> JavaTraining -> create new file
        try {

            // Two steps to take in a file - CLARITY over shortness
            // create FileReader object connected to the file
            FileReader fileReader = new FileReader("poem.txt"); // We are importing a pre-made Java class to read files
            // create a BufferedReader to manage the input stream
            BufferedReader bufReader = new BufferedReader(fileReader);

            // One step to take in a file
            // BufferedReader bufReader = new BufferedReader(new FileReader("poem.txt"));

            String input;

            // read input until there is no more data
            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
                System.out.println("The next line"); // Shows after each line gets read from the file
            }

            // close the stream and release the resources
            bufReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 2. Writing text to a file

        // Today - Add the date and time
        LocalDate today = LocalDate.now();
        System.out.println("The date is "  + today);

        // Try/catch
        try {
            // opens the file to append text
            FileWriter writer = new FileWriter("myReasons " + today);

            writer.write("Three reasons why I want to become a software developer:\n");
            writer.write("1. I want to build tangible things that can enrich the lives of people\n");
            writer.write("2. I like being creative and solving problems\n");
            writer.write("3. Make lots of money to take care of my family\n");

            // close the file when you are finished
            writer.close();
        } catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.printStackTrace();
        }


        // 3. Programming with Local Dates

        // Current Time
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        // Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }

}

