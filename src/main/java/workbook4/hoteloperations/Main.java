package workbook4.hoteloperations;

// Main interface

public class Main {
    public static void main(String[] args) {

        // What objects do we need to run a successful hotel?
        // 1. List out the objects
        // 2. Figure out ways to include inheritance
        // 3. Create methods for their actions
        // 4. Don't need an actual running program

        // Test Employee class
        System.out.println("==== Employee ====");

        Employee employee = new Employee("John", 101, "Front Desk", 20.00, 45);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOvertimeHours());
        System.out.println("Total Pay: $" + employee.getTotalPay());

        // Test Reservation class
        System.out.println("\n==== Reservation ====");

        Reservation reservation = new Reservation("King", 3, true);

        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Nightly Price: $" + reservation.getPrice());
        System.out.println("Reservation Total: $" + reservation.getReservationTotal());

        // Test Room class
        System.out.println("\n==== Room ====");

        Room room = new Room(2, 139.00, false, false);

        System.out.println("Room Available: " + room.isAvailable());

        room.checkIn();
        System.out.println("After Check-In: " + room.isAvailable());

        room.checkOut();
        System.out.println("After Check-Out: " + room.isAvailable());

        room.cleanRoom();
        System.out.println("After Cleaning: " + room.isAvailable());

        // Test Hotel class
        System.out.println("\n==== Hotel ====");

        Hotel hotel = new Hotel("AfterPanel Hotel", 5, 20);

        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());

        hotel.bookRoom(3, false);

        System.out.println("Available Rooms After Booking: " + hotel.getAvailableRooms());
    }
}
