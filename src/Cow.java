public class Cow extends animal
{
    @Override
    void Sound() {
        System.out.println("Cow sounds Moos");
    }

    public static void main(String[] args) {
        Cow c1=new Cow();
        c1.Sound();
             }
}
