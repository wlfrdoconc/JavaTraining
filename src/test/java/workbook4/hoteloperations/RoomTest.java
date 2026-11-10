package workbook4.hoteloperations;

// Exercise - Creating Unit Tests
// 1. How many tests should you write?
// 2. Should you be able to check in a room, if it is already occupied?
// 3. What if it is dirty?
// 4. Should housekeeping be able to clean the room if it is occupied?

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    // Verify if the room should be occupied and dirty
    @org.junit.jupiter.api.Test
    void checkIn() {

        // Arrange - create a room object
        Room room = new Room(2, 150.00, false, false);

        // Act - check in the room
        room.checkIn();

        // Assert - check if the room is occupied and dirty
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    // Verify if the room is no longer occupied and is dirty
    @org.junit.jupiter.api.Test
    void checkOut() {

        // Arrange - create an occupied room
        Room room  = new Room(2, 150.00, true, true);

        // Act - check out the room
        room.checkOut();

        // Assert - verify the room is no longer occupied and is dirty
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

    // Verify if the room is no longer dirty after cleaning
    @org.junit.jupiter.api.Test
    void cleanRoom() {

        // Arrange - create an occupied but dirty room
        Room room = new Room(2, 150.00, false, false);

        // Act - clean the room
        room.cleanRoom();

        // Assert - verify the room is clean and available
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }

    @Test
    void cleanOccupiedRoom() {

        // Create an occupied and dirty room
        Room room = new Room(2, 150.00, true, true);

        // Attempt to clean the room
        room.cleanRoom();

        // Verify the room remains dirty and occupied
        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
    }
}