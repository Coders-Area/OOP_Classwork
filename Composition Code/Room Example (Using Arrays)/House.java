// House class using composition to include Room objects.
class House {
    private Room[] rooms;

    // Constructor requires at least one room to create a House.
    public House(Room[] rooms) {
        if (rooms == null || rooms.length == 0) {
           System.out.println("A house must have at least one room.");
        }
        // Shallow copy to avoid external modification
        this.rooms = Arrays.copyOf(rooms, rooms.length);
    }

    // Method to display all rooms in the house.
    public void displayHouseInfo() {
        System.out.println("House Information:");
        for (Room room : rooms) {
            room.displayRoomInfo();
        }
    }
}
