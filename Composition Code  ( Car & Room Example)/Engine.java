public class Engine {
    private int enige_no;
    private int chasis_no;

    private String engine_material;

    private int hourse_power;

    Engine(int h, int c,int e,String m ){

        this.hourse_power=h;
        this.engine_material=m;
        this.chasis_no=c;
        this.enige_no=e;
    }

    public void start_engine(){
        System.out.println("Engine has been Started");
    }

    public void start_stop(){
        System.out.println("Engine has been Stop");
    }

    public void display(){
        System.out.println("Engine No : " +enige_no);
        System.out.println("Chaisis No : " +chasis_no);
        System.out.println("Engine Material : " +engine_material);
        System.out.println("Hourse Power : " +hourse_power +"CC");

    }

}
