package workbook3.exercise3and4;

import java.io.*;
import java.util.Scanner;

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

            while ((input = bufReader.readLine()) != null) {

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


                // Payroll Part 2 Goals - FINISH
                // 1. We want to grab information from employees.csv to an output like in part 1
                // 2. We want to still calculate the gross pay of employees
                // 3. We want to ultimately parse the output into a new custom file

                Scanner read = new Scanner(System.in);

                // Prompt for the input fileName

                System.out.println("=== Process Payroll ===");
                System.out.println();

                // Ask for file input
                System.out.print("Enter the name of the employee file to process: ");
                String inputFile = read.nextLine();

                // Ask for file output
                System.out.print("Enter the name of the payroll to create: ");
                String outputFile = read.nextLine();


                // processPayroll(inputFile, outputFile);


            }
            // Close the reader
            bufReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Display Employee method displayEmployee
    // Passes in Employee object employeeGrossPay and double employeeGrossPay

    public static void displayEmployee(Employee employee, double employeeGrossPay) {
        // FINISH LATER
        System.out.printf("%d | %s | $%.2f%n",
                employee.getEmployeeId(),
                employee.getName(),
                employeeGrossPay);
    }

    // Method to process payroll
    // processPayroll()

    /** public static void processPayroll(String inputFile, String outputFile) {
        try {

            // Create a reader object to parse the specific inputFile the user is entering
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufReader = new BufferedReader(fileReader);

            // Open the output file
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            String input;

            // Read each employee from the file
            while ((input = bufReader.readLine()) != null) {

                // Split each line using | as the delimiter
                String[] fields = input.split("\\|");

                // Convert fields into their correct data types
                int employeeId = Integer.parseInt(fields[0]);
                String name = fields[1];
                double hoursWorked = Double.parseDouble(fields[2]);
                double payRate = Double.parseDouble(fields[3]);

                // Create an Employee object
                Employee employee = new Employee(
                        employeeId, name, hoursWorked, payRate
                );

                // Calculate gross pay
                double employeeGrossPay = employee.getGrossPay(hoursWorked, payRate);

                // Display employee information
                displayEmployee(employee, employeeGrossPay);

                // Write the processed information into the output file
                bufWriter.write(employeeId + "|" + name + "|" + employeeGrossPay);
                bufWriter.newLine();
            }

            // Close the reader and writer
            bufReader.close();
            bufWriter.close();

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    } **/
}

