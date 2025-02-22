import java.util.ArrayList;

class Table {
    private final int capacity;
    private int occupiedSeats;
    private boolean clean;

    public Table(int capacity) {
        this.capacity = capacity;
        this.occupiedSeats = 0;
        this.clean = true;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    public int getFreeSeats() {
        return capacity - occupiedSeats;
    }

    public boolean isClean() {
        return clean;
    }

    public void useTable(int groupSize) {
        if (clean && groupSize <= capacity) {
            occupiedSeats = groupSize;
            clean = false;
            System.out.println("Table with capacity " + capacity + " assigned to a group of " + groupSize + ".");
        }
    }

    public void haveLunch() {
        if (!clean) {
            System.out.println("Having lunch on the table.");
            clean = false;
        }
    }

    public void leaveTable() {
        System.out.println("Leaving the table.");
        occupiedSeats = 0;
    }

    public void cleanTable() {
        if (occupiedSeats == 0) {
            System.out.println("Cleaning the table.");
            clean = true;
        } else {
            System.out.println("Cannot clean the table while people are still seated.");
        }
    }
}
