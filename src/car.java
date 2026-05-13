public class car extends vehicle {
    @Override
    void run () {
        System.out.print("Car runs slow");
    }

    public static void main(String[] args) {
        vehicle v= new vehicle();
        car c= new car();
        v.run();
        c.run();
    }
}
