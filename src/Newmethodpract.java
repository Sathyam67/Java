public class Newmethodpract {
    //Create a class Calculator with overloaded add methods: one that takes two integers
    //and another that takes three integers, 3 double.
    public void calc(int a, int b) {
        System.out.println("Sum of 2 Int: " + (a + b));
    }

    public void calc(int c, int d, int e) {
        System.out.println("Sum of 3 Int: " + (c + d + e));
    }

    public void calc(double x, double y, double z) {
        System.out.println("Sum of 3 Dobl: " + (x + y + z));

    }

    //Write overloaded methods printData that accept an int, a double, and a String and a
//character .
    public void print(int a) {
        System.out.println("Print Int= " + a);
    }

    public void print(double a) {
        System.out.println("Print Dobl= " + a);
    }

    public void print(String a) {
        System.out.println("Print Strng= " + a);
    }

    public void print(char a) {
        System.out.println("Print Char= " + a);
    }
//Create 4 methods display(int a, String b) and display(String b, int a) and
//display(int a, String b, char c ,String d) and display(String b, int a ,double c)
        public void display(int a, String b) {
            System.out.println("Display Int: "+a);
            System.out.println("Display String: "+b);
        }
public void display(String b, int a) {
    System.out.println("Display String: " + b);
    System.out.println("Display Int: " + a);
}
public void display(int a, String b, char c ,String d) {
    System.out.println("Display Int: " + a);
    System.out.println("Display String: " + b);
    System.out.println("Display Char: " + c);
    System.out.println("Display String: " + d);
}
public void display(String b, int a ,double c) {
    System.out.println("Display String: " + b);
    System.out.println("Display Int: " + a);
    System.out.println("Display Dble: " + c);
}

//Attempt to overload methods by changing only the return type. Observe what
//happens during compilation.
public int test(int a, int b){
        return a+b;
}
public double test (double a, int b) {
        return a+b;
}
//create overloaded methods show(int a) and show(double a). Call them with different
   //argument types including a character.
    public void root(int a) {
        System.out.println("Int- " +a);
    }
    public void root (double a) {
        System.out.println("Double- " +a);
    }

    public void main (String[] args) {
        Newmethodpract obj = new Newmethodpract();
        obj.calc(2, 3);
        obj.calc(2, 3, 4);
        obj.calc(2.5, 3.6, 4.7);
        obj.print(6);
        obj.print(98.6);
        obj.print("Sathya");
        obj.print('S');
        obj.display(6, "Hello");
        obj.display("Hi", 6);
        obj.display(7, "Java", 'S', "Sathya");
        obj.display("mass", 7, 98.5);
        obj.test(2,7);
        obj.test(8.5,7);
        obj.root(5);
        obj.root(98.5);
    }
}


