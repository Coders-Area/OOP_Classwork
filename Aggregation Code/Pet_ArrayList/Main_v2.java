import java.util.ArrayList;
import java.util.Arrays;

public class Main_v2 {
    public static void main(String[] args) {
        // Creating special skills for pets
        ArrayList<String> skills1 = new ArrayList<>(Arrays.asList("Jumping", "Rolling"));
        ArrayList<String> skills2 = new ArrayList<>(Arrays.asList("Fetching", "Swimming"));

        // Creating pet objects
        Pet pet1 = new Pet(7, 5, "Healthy", skills1);
        Pet pet2 = new Pet(4, 2, "Sick", skills2);
        Pet pet3 = new Pet(); // Default pet

       Pet pet4 = new Pet(7, 5, "Healthy", new ArrayList<>(Arrays.asList("Jumping", "Rolling")));
        Pet pet5 = new Pet(4, 2, "Sick", new ArrayList<>(Arrays.asList("Fetching", "Swimming")));
        Pet pet6 = new Pet(); // Default pet

        // Displaying pet details
        System.out.println("--- Pet Details ---");
        pet1.display_details();
        pet2.display_details();
        pet3.display_details();

        // Creating adopter object
        Adopter adopter1 = new Adopter("John Doe", "1234567890");

        // Adopting pets
        adopter1.adopted_pet(pet1);
        adopter1.adopted_pet(pet2);
        adopter1.adopted_pet(pet3);

        // Display adopter details
        System.out.println("\n--- Adopter Details ---");
        adopter1.display();

        // Feeding pets
        System.out.println("\nFeeding pet 1");
        pet1.feed();
        pet1.display_details();

        // Returning a pet
        System.out.println("\nReturning pet at index 1");
        adopter1.return_pet(1);
        adopter1.display();
    }
}
