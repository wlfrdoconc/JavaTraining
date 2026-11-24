package workbook5.vehicleinterface;

public class Motorcycle implements Vehicle {

    // Implement the start and stop methods from vehicle here

    @Override
    public void start() {
        System.out.println("Motorcycle is starting!");
    }

    @Override
    public void stop() {
        System.out.println("Motorcyle is stopping!");
    }

}
