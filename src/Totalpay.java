public class Totalpay {
    public static void main(String[] args) {
        Payment p= new Payment();
        cash c=new cash();
        card c1= new card();
        upipay u= new upipay();
        p.pay(0);
        c.pay(500);
        c1.pay(100);
        u.pay(1000);
    }
}
