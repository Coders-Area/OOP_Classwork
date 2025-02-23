public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(1000, 12345, 45678, "Japnese");
        Car c1 = new Car("Mehran", "Asd5652", "2012", "Suzuki", e1);
        c1.Start_Car();
        c1.Stop_Car();
        c1.display_car_details();
    }
}