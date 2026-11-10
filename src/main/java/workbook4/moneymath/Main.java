package workbook4.moneymath;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        // Initialize 3 variables to 0
        float floatValue = 0.0f;
        double doubleValue = 0.0;
        BigDecimal bigDecimal = BigDecimal.ZERO;

        // Create a for loop that iterates 10 times
        // 1. Increase each variable by 10 cents each iteration
        // 2. Print each variable on one line inside the loop
        // 3. Compare and review - Are they the same? Do they differ?

        System.out.println("First Loop - 10 iterations");

        // First Loop - Loop by each value 10 times and increase each variable by 10 cents
        for (int i = 0; i < 10; i++) {
            floatValue += 0.10f;
            doubleValue += 0.10;
            bigDecimal = bigDecimal.add(new BigDecimal("0.10"));

            // Print each variable on one line
            System.out.println("Float: " + floatValue +
                    " | Double: " + doubleValue +
                    " | BigDecimal: " + bigDecimal);
        }

        // Reset all variables back to 0
        floatValue = 0.0f;
        doubleValue = 0.0;
        bigDecimal = BigDecimal.ZERO;

        // Divider
        System.out.println();

        System.out.println("Second Loop - 1000 iterations");

        // Second Loop - Loop by each value 1000 times and increase each variable by 19.99
        for (int i = 0; i < 1000; i++) {
            floatValue += 19.99f;
            doubleValue += 19.99;
            bigDecimal = bigDecimal.add(new BigDecimal("19.99"));

            // Print each variable on one line
            System.out.println("Float: " + floatValue +
                    " | Double: " + doubleValue +
                    " | BigDecimal: " + bigDecimal);

        }

        // Questions to answer

    }
}
