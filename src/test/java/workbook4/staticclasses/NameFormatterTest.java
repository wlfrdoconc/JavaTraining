package workbook4.staticclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void format() {

        // Arrange
        String firstName = "John";
        String lastName = "Doe";

        // Act
        String result = NameFormatter.format(firstName, lastName);

        // Assert
        assertEquals("John Doe", result);
    }

    @Test
    void testFormat() {

        // Arrange
        String prefix = "Mr.";
        String firstName = "John";
        String middleName = "Michael";
        String lastName = "Doe";
        String suffix = "Jr.";

        // Act
        String result = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        // Assert
        assertEquals("Mr. John Michael Doe Jr.", result);
    }
}