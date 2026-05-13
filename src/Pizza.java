public class Pizza extends Food {
    @Override
    void eat () {
        System.out.println("Triangle shaped Pizza");
    }

    public static void main(String[] args) {
    Pizza pz=new Pizza();
    pz.eat();
    burger bg=new burger();
    bg.eat();
    }
}
