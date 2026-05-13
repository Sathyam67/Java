public class iplteam {
    String Teamname;
    int TeamID;
    double runrate;
    char TeamGrp;

    iplteam(String name, int id, double rr, char grp){
        System.out.println("Teamname:" +name);
        System.out.println("id:" +id);
        System.out.println("Run rate:" +rr);
        System.out.println("Group:" +grp);
    }
public static void main (String[] args) {
    iplteam obj=new iplteam("csk",1,1.25,'A');
}
}
