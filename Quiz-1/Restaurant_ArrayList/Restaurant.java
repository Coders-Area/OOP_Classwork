public class Restaurant {
    public static void occupyTable(ArrayList<Table> tables, int groupSize) {
        for (Table table : tables) {
            if (table.getFreeSeats() >= groupSize) {
                table.useTable(groupSize);
                break;
            }
        }
    }

    public static void emptyTable(ArrayList<Table> tables, int tableIndex) {
        tables.get(tableIndex).leaveTable();
    }

    public static void main(String[] args) {
        ArrayList<Table> tables = new ArrayList<>();
        tables.add(new Table(8));
        tables.add(new Table(8));
        tables.add(new Table(4));
        tables.add(new Table(4));
        tables.add(new Table(4));

        occupyTable(tables, 4); // Assume this is table 1
        occupyTable(tables, 6); // Assume this is table 2

        tables.get(0).useTable(4); // Using table 1
        tables.get(0).haveLunch(); // Having lunch on table 1
        tables.get(0).leaveTable(); // Leaving table 1
        tables.get(0).cleanTable(); // Cleaning table 1

        emptyTable(tables, 1); // Emptying table 2
    }
}
