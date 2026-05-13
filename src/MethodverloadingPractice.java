public class MethodverloadingPractice {
    public void display(int a){
        System.out.println("integer " + a);
    }
    public void display(char a){
        System.out.println("Char "+ a);
    }
    public void display(String name){
        System.out.println("String "+name);
    }
    public void display(byte a){
        System.out.println("Byte "+(byte)a);
    }

   public static void main(String[] args) {
        MethodverloadingPractice obj = new MethodverloadingPractice();
        obj.display(2);
        obj.display((byte)23);// type casting
        obj.display('S');
        obj.display("Trainer");

    }
}
