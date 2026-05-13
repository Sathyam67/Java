public class card extends Payment{
    @Override
    void pay (double amount) {
        System.out.println("Card payment- " +amount +" Processing");
    }
}
