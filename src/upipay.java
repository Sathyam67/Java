public class upipay extends Payment{
    @Override
    void pay (double amount) {
        System.out.println("upi payment- " +amount +" successfull");
    }
}
