public class Adopter {
    private String adopt_name;
    private String mobile_no;
    private Pet[] pets;
    private int petCount;

    Adopter(String n, String mn) {
        this.mobile_no = mn;
        this.adopt_name = n;
        this.pets = new Pet[5];
        this.petCount = 0;
    }

    public void adopted_pet(Pet px) {
        if (petCount < pets.length) {
            pets[petCount++] = px;
        } else {
            System.out.println("Criteria Already Filled");
        }
    }

    public void return_pet(int i) {
        if (i >= 0 && i < petCount) {
            for (int j = i; j < petCount - 1; j++) {
                pets[j] = pets[j + 1];
            }
            pets[--petCount] = null;
        } else {
            System.out.println("Index out of Bound");
        }
    }

    public void display() {
        System.out.println("Adopter Details");
        System.out.println("Adopter Name: " + this.adopt_name);
        System.out.println("Adopter Mobile: " + this.mobile_no);
        System.out.println("Pet Details");

        for (int i = 0; i < petCount; i++) {
            pets[i].display_details();
        }
    }
}

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
