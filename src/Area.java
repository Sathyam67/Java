public class Area {
    public void circle (double radius) {
        System.out.println("Circle:" +radius);
    }
    public void rectangle (int box) {
        System.out.println("Rectangle:" +box);
    }
    public void square (int opp) {
        System.out.println("Square:" +opp);
    }
    public void triangle (int equal) {
        System.out.println("Triangle:" +equal);
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.circle(3.14);
        obj.rectangle(12);
        obj.square(5);
    }
}
