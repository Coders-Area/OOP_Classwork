import java.util.ArrayList;
import java.util.List;

public class HouseRoomCompositionDemo {
    public static void main(String[] args) {
        // Creating Room objects.
        Room livingRoom = new Room(1, "Living Room");
        Room bedroom = new Room(2, "Bedroom");
        Room kitchen = new Room(3, "Kitchen");

        // Adding rooms to a list.
        List<Room> roomList = new ArrayList<>();
        roomList.add(livingRoom);
        roomList.add(bedroom);
        roomList.add(kitchen);

        // Creating a House object using the rooms list.
        House myHouse = new House(roomList);
        myHouse.displayHouseInfo();

        // Simulate house deletion:
        // When myHouse is set to null, the rooms are no longer accessible as part of a house.
        myHouse = null;
        // The Room objects will be eligible for garbage collection if no other references exist.
        System.out.println("\nThe house has been deleted. Its rooms are no longer accessible.");
    }
}
