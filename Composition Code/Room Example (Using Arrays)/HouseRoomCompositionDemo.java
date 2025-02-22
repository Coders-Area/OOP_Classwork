public class HouseRoomCompositionDemo {
    public static void main(String[] args) {
        // Creating Room objects.
        Room livingRoom = new Room(1, "Living Room");
        Room bedroom = new Room(2, "Bedroom");
        Room kitchen = new Room(3, "Kitchen");

        // Creating an array of rooms.
        Room[] roomArray = {livingRoom, bedroom, kitchen};

        // Creating a House object using the rooms array.
        House myHouse = new House(roomArray);
        myHouse.displayHouseInfo();

        // Simulate house deletion:
        myHouse = null;
        System.out.println("\nThe house has been deleted. Its rooms are no longer accessible.");
    }
}
