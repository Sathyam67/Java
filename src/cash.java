public class cash extends Payment {
    @Override
    void pay (double amount) {
        System.out.println("Cash Payment- " +amount +" completed");
    }
}
