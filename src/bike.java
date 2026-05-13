public class bike extends vehicle {
    @Override
    void run() {
        System.out.println("bike runs fast");
    }

    public static void main(String[] args) {
        vehicle v=new vehicle();
        bike b= new bike();
        v.run();
        b.run();
    }
}
