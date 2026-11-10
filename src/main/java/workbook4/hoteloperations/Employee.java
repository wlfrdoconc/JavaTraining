
package workbook4.hoteloperations;

// Employee extends (inherits) from Person

import java.time.LocalTime;

public class Employee extends Person {

    // Clerk specific attributes
    // private String name; -> Extends from Person class
    private int employeeId;
    private String department;
    private double payRate;
    private double hoursWorked;
    private Integer startTime = null;

    // Constructors

    // Empty constructor
    public Employee() {

    }

    // Parameterized constructor
    public Employee(String name, int employeeId, String department, double payRate, double hoursWorked) {
        super(name);
        this.employeeId = employeeId;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Methods
    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;

        return regularPay + overtimePay;
    }

    // Convert military time (HHmm) to minutes
    private int toMinutes(int time) {
        int hours = time / 100;
        int minutes = time % 100;

        if (hours < 0 || hours > 23 || minutes > 59) {
            throw new IllegalArgumentException("Invalid time");
        }

        return hours * 60 + minutes;
    }

    // Calculates hours worked from a shift
    public void punchTimeCard(int startTime, int endTime) {
        int minutesWorked = toMinutes(endTime) - toMinutes(startTime);

        if (minutesWorked < 0) {
            minutesWorked += 24 * 60;
        }

        hoursWorked += minutesWorked / 60.0;
    }

    // Punch in with a specified time
    public void punchIn(int time) {
        toMinutes(time);
        startTime = time;
    }

    // Punch in using current time
    public void punchIn() {
        LocalTime now = LocalTime.now();
        punchIn(now.getHour() * 100 + now.getMinute());
    }

    // Punch out with a specified time
    public void punchOut(int time) {
        if (startTime == null) {
            throw new IllegalStateException("Employee has not punched in");
        }

        punchTimeCard(startTime, time);
        startTime = null;
    }

    // Punch out using current time
    public void punchOut() {
        LocalTime now = LocalTime.now();
        punchOut(now.getHour() * 100 + now.getMinute());
    }

}

