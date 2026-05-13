public class rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Opps are equal in Rectange");
    }

    public static void main(String[] args) {
        rectangle ra=new rectangle();
        ra.draw();
    }
}
