public class cat extends animal{
    @Override
    void Sound() {
        System.out.println("Cat sound is Meow");
    }
    public static void main (String[] args) {
        cat c= new cat();
        c.Sound();
    }
}

