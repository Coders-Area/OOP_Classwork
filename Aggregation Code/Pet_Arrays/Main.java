public class Main {
    public static void main(String[] args) {
        // Creating pets
        String[] skills1 = {"Fetch", "Roll Over"};
        String[] skills2 = {"Sit", "Stay"};
        
        Pet pet1 = new Pet(7, 3, "Happy", skills1);
        Pet pet2 = new Pet(5, 4, "Excited", skills2);

        // Creating an adopter
        Adopter adopter = new Adopter("John Doe", "1234567890");

        // Adopting pets
        adopter.adopted_pet(pet1);
        adopter.adopted_pet(pet2);

        // Display adopter and pet details
        adopter.display();

        // Feeding a pet
        pet1.feed();

        // Display updated details
        System.out.println("\nAfter Feeding:");
        adopter.display();

        // Returning a pet
        adopter.return_pet(0);
        
        // Display final details
        System.out.println("\nAfter Returning a Pet:");
        adopter.display();
    }
}
