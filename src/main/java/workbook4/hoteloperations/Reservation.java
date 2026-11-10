package workbook4.hoteloperations;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;


    // Constructors
    public Reservation() {

    }

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    // Getters and Setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    // Methods

    // Get the price
    public double getPrice() {
        double price = 0;

        // Determine base price of the room
        if (roomType.equalsIgnoreCase("King")) {
            price = 139.00;
        }
        else if (roomType.equalsIgnoreCase("Double")) {
            price = 124.00;
        }
        else {
            throw new IllegalArgumentException("Invalid room type");
        }

        // Check if it is a weekend, if it is increase price by 10%
        if (isWeekend) {
            price += 1.10;
        }


        return price;
    }

    // Determine reservation total
    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }

}
