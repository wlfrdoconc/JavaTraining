package workbook3.fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Reading and writing files");

        // Without files this will return an error
        // Create a poem.txt file at the project root -> JavaTraining -> create new file
        try {
            // create FileReader object connected to the file
            FileReader fileReader = new FileReader("poem.txt"); // We are importing a pre-made Java class to read files

            // create a BufferedReader to manage the input stream
            BufferedReader bufReader = new BufferedReader(fileReader);

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
    }

}

