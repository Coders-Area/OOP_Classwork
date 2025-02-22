import java.util.ArrayList;

public class Adopter {

private String adopt_name;
private String mobile_no;

private ArrayList<Pet> p  ;

Adopter(String n, String mn){
    this.mobile_no=mn;
    this.adopt_name=n;
    this.p=new ArrayList<>();
}

public void adopted_pet(Pet px){
    if(p.size()<5){
        p.add(px);
    }
    else{
        System.out.println("Criteria Already Filled");
    }



}
    public void return_pet(int i){
    if(i>=0 && i<p.size()){
        p.remove(i);
    }
    else{
        System.out.println("Index out of Bound");
    }

    }

    public void display(){
    System.out.println("Adopter Details");
    System.out.println("Adopter Name" +this.adopt_name);
        System.out.println("Adopter Mobile" +this.mobile_no);
        System.out.println("Pet Details");

        for(Pet x : p){
            x.display_details();
        }
    }
}
