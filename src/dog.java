public class dog extends animal
{
    @Override
    void Sound() {

        System.out.println("Dog Barks");
    }
    public static void main(String[] args) {
        dog d = new dog();
        d.Sound();
    }
}