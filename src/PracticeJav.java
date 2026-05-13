/*
import java.util.Scanner;

public class PracticeJav {

    //Write a method that prints "Hello, Java!".
    public void welcometojava() {
        System.out.println("Hello Java");
    }

    //Create a method that prints numbers from 1 to 10.
    public static void numbers() {
        for (int i = 1; i <= 10; i++)
            System.out.println("Numbers =" + i);
    }

    //Write a method to display all even numbers from 1 to 20.
    public static void even() {
        for (int i = 1; i <= 20; i++)
            if (i % 2 == 0) {
                System.out.println("Even Numbers=" + i);
            }
    }

    //Create a method that prints your name 5 times.
    public static void repeat() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Sathya");
    }

    public static void tables() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("5 Tables 5x" + i + "=" + (5 * i));
        }
    }

    //Create a method that prints the sum of numbers from 1 to 50 (calculate inside method).
    public void sumnumbers() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum = sum + i;
            System.out.println("Sum=" + sum);
        }
    }

    //Write a method to display the first 10 natural numbers in reverse.
    public void naturalnumbers() {
        for (int a = 10; a >= 1; a--) {
            System.out.println("Reverse numbers= " + a);
        }
    }

    public void starpattern() {
        for (int b = 1; b <= 5; b++){
            for (int c = 1; c <=b; c++) {
                System.out.print("* ");
            }
        System.out.println();
    }
}

//Write a method that prints all odd numbers between 1 and 100.
    public void oddnumbers() {
        for (int d=1;d<=100;d++){
            if (d%2!=0) {
                System.out.println("Odd no.=" +d);
            }
        }
    }
    public void evennumbers() {
        for(int e=1;e<=100;e++) {
            if(e%2==0) {
                System.out.println("even no.= "+e);
            }
        }
    }

    //Create a method that displays whether a fixed number (e.g., 25) is positive or negative
    public void checkingnumbers() {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter one more number");
        int n2= sc2.nextInt();
                if (n > 0) {
                    System.out.println("Number is positive");
                } else {
                    System.out.println("Number is negative");
        } if(n2 < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is positive");
        }
    }

    int num =10;
    //while (num %10==0){

    }
    public static void main (String[] argus)
    {
        PracticeJav obj= new PracticeJav() ;
        obj.welcometojava();
        obj.numbers();
        obj.even();
        obj.repeat();
        obj.tables();
        obj.sumnumbers();
        obj.naturalnumbers();
        obj.starpattern();
        obj.oddnumbers();
        obj.evennumbers();
        obj.checkingnumbers();

    }

}

*/
