package workbook4.staticclasses;



public class Main {

    // 1. Create a NameFormatter class that only has static methods -> name formatting factory
    // 2. This class acts as a library of functions
    // 3. The class acts as a way to standardize the way a name should be formatted
    // 4. Create test cases and test output to practice here in the Main class

    public static void main(String[] args) {

        // Test NameFormatter

        // First and last name
        System.out.println(NameFormatter.format("Will", "Concepcion"));

        // Test full name
        System.out.println(NameFormatter.format("Mr.", "Bob", "Alexander", "Smith", "Sr."));

    }


}
