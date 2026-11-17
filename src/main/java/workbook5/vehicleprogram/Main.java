package workbook5.vehicleprogram;

public class Main {
    public static void main(String[] args) {

        // Create instances of each vehicle type

        // Moped
        Moped mopedOne = new Moped();
        mopedOne.setColor("Red");
        mopedOne.setMakeModel("Vespa");
        mopedOne.setFuelCapacity(5); // Does fuel capacity imply how many gallons we can hold?
        mopedOne.setSeats(2);
        mopedOne.setRange(350);
        mopedOne.setTopSpeed(80); // MPH

        // HoverCraft
        HoverCraft hoverCraftOne = new HoverCraft();
        hoverCraftOne.setColor("Blue");
        hoverCraftOne.setMakeModel("Toyota Air");
        hoverCraftOne.setFuelCapacity(4);
        hoverCraftOne.setSeats(4);
        hoverCraftOne.setRange(400);
        hoverCraftOne.setTopSpeed(100);

        // Car
        Car carOne = new Car();
        carOne.setColor("White");
        carOne.setMakeModel("Toyota Corolla");
        carOne.setFuelCapacity(13);
        carOne.setSeats(5);
        carOne.setRange(350);
        carOne.setTopSpeed(120);

        // SemiTruck
        SemiTruck semiTruckOne = new SemiTruck();
        semiTruckOne.setColor("Green");
        semiTruckOne.setMakeModel("Toyota Tacoma");
        semiTruckOne.setFuelCapacity(15);
        semiTruckOne.setSeats(5);
        semiTruckOne.setRange(400);
        semiTruckOne.setTopSpeed(100);
    }
}
