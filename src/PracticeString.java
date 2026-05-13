import java.util.Scanner;

public class PracticeString {
    public static void main(String[] args) {
//Find the length of a given string.
        //String name ="MY NAME IS SATHYA";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string task1 ");
        String name = sc.nextLine();
        System.out.println("the length of the string is " + name.length());
        System.out.println("uppercase " + name.toUpperCase());
        System.out.println("lowercase " + name.toLowerCase());
        System.out.println("trim "+name.trim());
        System.out.println("empty" +name.isEmpty());
        System.out.println("Enter the string task2 ");
        String name1 =sc.nextLine();
        System.out.println(name + " Conc " + name1);
        System.out.println("character " +name1.charAt(3));
        System.out.println("Index of Sathya " +name1.indexOf('y'));
        System.out.println("Last " +name1.lastIndexOf('y'));
        System.out.println(name.contains("Sathya"));
        System.out.println(name.concat(" Mr"));
        System.out.println(name.substring(0,5));
        System.out.println(name.replace('t','i'));
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.endsWith("Mu"));
    }
}