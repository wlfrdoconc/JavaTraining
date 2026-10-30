package workbook3.exercise3and4;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Code will run unless an exception is captured
        try {

            // Payroll Part 2 Goals
            // 1. Grab employee information from employees.csv
            // 2. Calculate the gross pay of employees
            // 3. Parse the output into a new custom file

            System.out.println("=== Process Payroll ===");
            System.out.println();

            // Ask for input filename
            System.out.print("Enter the name of the file employee file to process: ");
            String inputFile = read.nextLine();

            // Ask for output filename
            System.out.print("Enter the name of the payroll file to create: ");
            String outputFile = read.nextLine();

            // Create a FileReader object connected to the file
            FileReader fileReader = new FileReader(
                    "src/main/resources/workbook3/exercise3and4/" + inputFile
            );

            // Create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);

            // Create a FileWriter object for the output file
            FileWriter fileWriter = new FileWriter(outputFile);

            // Create a BufferedWriter to manage output stream
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            // Write the header to the output file
            bufWriter.write("id|name|gross-pay");
            bufWriter.newLine();

            String input;

            // Skip the header from employees.csv
            bufReader.readLine();

            // Read until there is no more data
            while ((input = bufReader.readLine()) != null) {

                // Split each line using | as the delimiter
                String[] fields = input.split("\\|");

                // Copy the fields into their correct data types
                int employeeId = Integer.parseInt(fields[0].trim());
                String name = fields[1].trim();
                double hoursWorked = Double.parseDouble(fields[2].trim());
                double payRate = Double.parseDouble(fields[3].trim());

                // Create an Employee object
                Employee employee = new Employee(
                        employeeId, name, hoursWorked, payRate
                );

                // Display employee information
                displayEmployee(employee);

                // Calculate employee's gross pay
                double employeeGrossPay = employee.getGrossPay(hoursWorked, payRate);

                // Write employee information to output file
                bufWriter.write(String.format("%d|%s|%.2f",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employeeGrossPay
                ));

                bufWriter.newLine();
            }

            // Close the streams and release resources
            bufReader.close();
            bufWriter.close();

            System.out.println();
            System.out.println("Payroll processed successfully!");
            System.out.println("Output saved to: " + outputFile);

        }
        catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Error reading employee data: " + e.getMessage());
        }

        read.close();
    }

    // Method to display employee information
    public static void displayEmployee(Employee employee) {
        System.out.printf("%d | %s | $%.2f%n",
                employee.getEmployeeId(),
                employee.getName(),
                employee.getGrossPay(employee.getHoursWorked(), employee.getPayRate()));
    }
}

/*  Program output

    === Process Payroll ===

    Enter the name of the file employee file to process: employees.csv
    Enter the name of the payroll file to create: payroll-oct-2026.csv
    10 | Dana Wyatt | $656.25
    20 | Ezra Aiden | $284.75
    30 | Brittany Thibbs | $660.00
    40 | Zephaniah Hughes | $20.00

    Payroll processed successfully!
    Output saved to: payroll-oct-2026.csv
* */
