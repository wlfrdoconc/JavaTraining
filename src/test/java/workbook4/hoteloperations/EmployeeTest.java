package workbook4.hoteloperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {

        // Arrange
        Employee employee = new Employee();

        // Act
        employee.punchIn(900);
        employee.punchOut(1700);

        // Assert
        assertEquals(8.0, employee.getHoursWorked());
    }

    @Test
    void punchOut() {

        // Arrange
        Employee employee = new Employee();

        // Act
        employee.punchIn(900);
        employee.punchOut(1700);

        // Assert
        assertEquals(8.0, employee.getHoursWorked());
    }
}