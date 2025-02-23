// Room class representing a room in a house.
class Room {
    private int roomNumber;
    private String roomType;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void displayRoomInfo() {
        System.out.println("Room Number: " + roomNumber + ", Room Type: " + roomType);
    }
}
