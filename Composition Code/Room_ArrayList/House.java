import java.util.ArrayList;
import java.util.List;

// House class using composition to include Room objects.
class House {
    private List<Room> rooms;

    // Constructor requires at least one room to create a House.
    public House(List<Room> rooms) {
        if (rooms == null || rooms.isEmpty()) {
           System.out.println("A house must have at least one room.");
        }
        // Deep copy can be done if necessary.
        this.rooms = new ArrayList<>(rooms);
    }

    // Method to display all rooms in the house.
    public void displayHouseInfo() {
        System.out.println("House Information:");
        for (Room room : rooms) {
            room.displayRoomInfo();
        }
    }

    // Add a room to the house.
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Remove a room from the house.
    public void removeRoom(Room room) {
        rooms.remove(room);
        if (rooms.isEmpty()) {
            System.out.println("House must have at least one room.");
        }
    }
}
