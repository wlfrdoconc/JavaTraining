package workbook4.staticclasses;

public class NameFormatter {

    // Create empty private constructor
    private NameFormatter() {

    }

    // Format first and last name
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    // Format full name with optional components
    public static String format(String prefix, String firstName,
                                String middleName, String lastName,
                                String suffix) {

        String formattedName = lastName + ", ";

        if (prefix != null && !prefix.isBlank()) {
            formattedName += prefix + " ";
        }

        formattedName += firstName;

        if (middleName != null && !middleName.isBlank()) {
            formattedName += " " + middleName;
        }

        if (suffix != null && !suffix.isBlank()) {
            formattedName += ", " + suffix;
        }

        return formattedName;
    }

    // Format a full name provided as a single String
    public static String format(String fullName) {
        // First and last Names

        // Split full name into individual components
        String[] nameParts = fullName.split(" ");

        // Format first and last name
        if (nameParts.length == 2) {
            return  format(nameParts[0], nameParts[1]);
        }

        // Handle other name variations
        return "";
    }
}
