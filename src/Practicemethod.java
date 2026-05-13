import java.util.Scanner;

public class Practicemethod {
    //Write a method that takes a name and prints a welcome message ?
    public void welcome(String name) {
        System.out.println("welcome Java world-" + name);
    }

//Write a method that takes two integers and prints their sum ?
    public void printssum (int a, int b) {
        int sum= a+b;
        System.out.println("sum of values="+sum);
    }
    //Write a method that takes a number and prints whether it is even or odd.
    public void findEvenorOdd (){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=0; i<=num;i++){
            if(i%2==0){
                System.out.println( i + " is a even number");
            }
            else{
                System.out.println( i + " is a odd number");
            }

        }


    }

    public static void main(String[] args) {
        Practicemethod obj = new Practicemethod();
        obj.welcome(" Hello all");
        obj.printssum(3,5);
        obj.findEvenorOdd();
    }

}