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

            String input;

            bufReader.readLine(); // Skips the header row of the CSV file

            while((input = bufReader.readLine()) != null) {

                // Split each line using | as the delimiter
                String[] fields = input.split("\\|");

                // Copy the fields into their correct data types
                int employeeId = Integer.parseInt(fields[0]);
                String name = fields[1];
                double hoursWorked = Double.parseDouble(fields[2]);
                double payRate = Double.parseDouble(fields[3]);

                // Create an Employee object
                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                // Calculate employee's gross pay
                double employeeGrossPay = Employee.getGrossPay(hoursWorked, payRate);

                displayEmployee(employee, employeeGrossPay);
            }
            // Close the reader
            bufReader.close();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void displayEmployee(Employee employee, double employeeGrossPay) {
        // FINISH LATER
        System.out.printf("%d | %s | $%.2f%n",
                employee.getEmployeeId(),
                employee.getName(),
                employeeGrossPay);
    }
}
