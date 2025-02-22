import java.util.ArrayList;

public class Pet {

    private int hung_lvl;
    private int happ_lvl;
    private String hs;

    private ArrayList<String> sp_skills;

    Pet(int h, int hl, String hs, ArrayList<String>s){
        this.happ_lvl=h;
        this.hung_lvl=hl;
        this.hs=hs;
        this.sp_skills=s;
    }
    
    Pet(){
        this(0,0,"Null",new ArrayList<>());
    }

    public void display_details(){
        System.out.println(this.happ_lvl);
        System.out.println(this.hs);
        System.out.println(this.hung_lvl);
        for(String s : sp_skills){
            System.out.println(s);
        }

    }
    public void upd_happiness(){

        if(this.hung_lvl>5){
            happ_lvl--;
        }
        else{
            happ_lvl++;
            if(happ_lvl>10){
                happ_lvl=10;
            }
        }


    }
    public void  updt_hl(int hl){
        this.hung_lvl=hl;

    }

    public void feed(){
        hung_lvl--;
        if(hung_lvl<0){
            hung_lvl=0;
        }
        upd_happiness();
    }

    public void upd_hs(String x){
        this.hs=x;
    }
}
