package workbook3.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) throws IOException {
        // Load the file using a FileReader object

        // Code will run unless an exception is captured
        try {

            // Create a file reader object connected to the file
            FileReader fileReader = new FileReader("src/main/resources/workbook3/exercise3/employees.csv");

            // Create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
