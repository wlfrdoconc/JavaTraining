package workbook5.vehicleinterface;

public class Car implements Vehicle {

    // Implement the start and stop methods from vehicle here

    @Override
    public void start() {
        System.out.println("Car is starting!");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping!");
    }
}
