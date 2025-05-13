// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how

        //create 3 courses
        Course c1 = new Course("C1","ML");
        Course c2 = new Course("C2","Algorithm");
        Course c3 = new Course("C3","TOC");
        //create 3 faculties
        Faculty f1 = new Faculty(1, "Mr. A", "A");
        Faculty f2 = new Faculty(2, "Mr. B", "A+");
        Faculty f3 = new Faculty(3, "Mr. C", "A");
        //set the faculties for different courses
        c1.setFaculty(f1);
        c2.setFaculty(f2);
        c3.setFaculty(f3);
        //add some students
        c1.addStudent(new Student(1,"Student 1","CSE"));
        c1.addStudent(new Student(2,"Student 2","CSE"));
        c1.addStudent(new Student(3,"Student 3","CSE"));
        c2.addStudent(new Student(1,"Student 4","CSE"));
        c2.addStudent(new Student(2,"Student 5","CSE"));
        c3.addStudent(new Student(103,"Student 6","CSE"));
        c3.addStudent(new Student(105,"Student 5","CSE"));
        //print the course information
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //lets test the class by dropping some student
        c1.dropStudent(new Student(1,"Student 1","CSE"));
        System.out.println(c1);
        c1.addStudent(new Student(1,"Student 1","CSE"));
        System.out.println(c1);
    }
}


