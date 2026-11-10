package workbook4.hoteloperations;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    // Constructors
    // Empty constructor
    public Room() {

    }

    // Parameterized constructor
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    // Getters and Setters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    // Derived Getter
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    // Room Methods
    public void checkIn() {
        if (!isAvailable()) {
            System.out.println("Room is not available.");
            return;
        }

        isOccupied = true;
        isDirty = true;
    }

    public void checkOut() {
        isOccupied = false;
        isDirty = true;
    }

    public void cleanRoom() {
        if (isOccupied) {
            System.out.println("Cannot clean an occupied room.");
            return;
        }

        isDirty = false;
    }
}

