package workbook5.vehicleprogram;

// Super class that all the subclasses will inherit from

public class Vehicle {

    // Initialize variables all the subclasses will inherit from
    private String color;
    private String makeModel;
    private int range;
    private int seats; // Number of passengers
    private int topSpeed;
    private int fuelCapacity;

    // Constructors

    // Empty Constructor
    public Vehicle() {

    }

    // Parameterized Vehicle constructor
    public Vehicle(String color, String makeModel, int range, int seats, int topSpeed, int fuelCapacity) {
        this.color = color;
        this.makeModel = makeModel;
        this.range = range;
        this.seats = seats;
        this.topSpeed = topSpeed;
        this.fuelCapacity = fuelCapacity;
    }


    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    // Methods
    public void drive() {

    }

    public void brake() {

    }

    public void refuel() {

    }

    public void startEngine() {

    }

    public void stopEngine() {

    }
}
