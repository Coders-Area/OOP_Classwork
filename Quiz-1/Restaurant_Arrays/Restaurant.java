public class Restaurant {
    public static void occupyTable(Table[] tables, int groupSize) {
        for (Table table : tables) {
            if (table.getFreeSeats() >= groupSize) {
                table.useTable(groupSize);
                break;
            }
        }
    }

    public static void emptyTable(Table[] tables, int tableIndex) {
        tables[tableIndex].leaveTable();
    }

    public static void main(String[] args) {
        Table[] tables = {
            new Table(8), new Table(8), new Table(4), new Table(4), new Table(4)
        };

        occupyTable(tables, 4); // Assume this is table 1
        occupyTable(tables, 6); // Assume this is table 2

        tables[0].useTable(4); // Using table 1
        tables[0].haveLunch(); // Having lunch on table 1
        tables[0].leaveTable(); // Leaving table 1
        tables[0].cleanTable(); // Cleaning table 1

        emptyTable(tables, 1); // Emptying table 2
    }
}
