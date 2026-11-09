package workbook4.hoteloperations;

// When extending from a superclass like Person, we don't need to re-initialize variables

import java.time.LocalDate;

public class Guest extends Person {

    // Guest specific attributes
    private int roomNumber;
    private int reservationId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean isCheckedIn;

    // Constructors

    // Empty constructor
    public Guest() {

    }

    // Parameterized Constructor w/ Person attributes
    public Guest(String name, int age, int roomNumber, int reservationId, LocalDate checkInDate, LocalDate checkOutDate, boolean isCheckedIn) {
        super(name, age); // Calls the constructor from Person
        this.roomNumber = roomNumber;
        this.reservationId = reservationId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.isCheckedIn = isCheckedIn;
    }

    // Getters and Setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
    }

    // Note - we don't need to create getters and setters for the Person attributes we are extending from
    // We can simply call the .getName() function after we create a Guest object

    // Methods
    public void makeReservation() {

    }

    public void requestHousekeeping(){

    }

    public void viewChargers() {

    }

}
