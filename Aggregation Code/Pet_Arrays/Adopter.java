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

    public void adopt_pet(Pet px) {
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
