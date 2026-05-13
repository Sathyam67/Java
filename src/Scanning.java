import java.util.Scanner;

public class Scanning {

    public void printNumber(){
        Scanner obj =new Scanner(System.in);
        System.out.println("numberai podavum");
        int num = obj.nextInt();
        int num1 = obj.nextInt();
        for(int i=num; i<=num1; i++){
            System.out.println("number=" + i);
        }
    }
    public static void main(String[] args) {

        Scanning sc = new Scanning();
        sc.printNumber();


    }


}
