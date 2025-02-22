public class Car {
    private String Car_Name;
    private String Model;

    private String Manufacture;

    private String Reg_id;

    private Engine e; // global varaible of engine type name e

    Car(String n, String rn, String m, String mn,Engine e1){
        this.Car_Name=n;
        this.Manufacture=mn;
        this.Model=m;
        this.Reg_id=rn;
        this.e=e1;


    }
    public void Start_Car(){

        e.start_engine();
    }

    public void Stop_Car(){

        e.start_stop();
    }

    public void display_car_details(){
        e.display();
        System.out.println("Car Details");
        System.out.println(this.Car_Name);
        System.out.println(this.Manufacture);
        System.out.println(this.Model);
        System.out.println(this.Reg_id);
        System.out.println(this.e);



    }

}
