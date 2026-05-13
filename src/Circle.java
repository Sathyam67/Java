public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle is radius");
    }
    public static void main(String[] args) {
        Circle cr= new Circle();
        cr.draw();
    }
}
