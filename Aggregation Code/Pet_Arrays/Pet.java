public class Pet {
    private int hung_lvl;
    private int happ_lvl;
    private String hs;
    private String[] sp_skills;

    Pet(int h, int hl, String hs, String[] s) {
        this.happ_lvl = h;
        this.hung_lvl = hl;
        this.hs = hs;
        this.sp_skills = s;
    }

    Pet() {
        this(0, 0, "Null", new String[0]);
    }

    public void display_details() {
        System.out.println("Hapinesss Level: " + this.happ_lvl);
        System.out.println("HS: " + this.hs);
        System.out.println("Hungry Level: " + this.hung_lvl);
        System.out.println("Pet's Skills:");
        for (String s : sp_skills) {
            System.out.println(s);
        }

        System.out.println();
    }

    public void upd_happiness() {
        if (this.hung_lvl > 5) {
            happ_lvl--;
        } else {
            happ_lvl++;
            if (happ_lvl > 10) {
                happ_lvl = 10;
            }
        }
    }

    public void updt_hl(int hl) {
        this.hung_lvl = hl;
    }

    public void feed() {
        hung_lvl--;
        if (hung_lvl < 0) {
            hung_lvl = 0;
        }
        upd_happiness();
    }

    public void upd_hs(String x) {
        this.hs = x;
    }
}
