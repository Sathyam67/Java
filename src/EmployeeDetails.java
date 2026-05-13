public class EmployeeDetails {

    static String company ="Wipro Technology";
    static String address ="sozhinganallur";
    static String landMark ="CDC5";

    public void emdetails(String name, int empid, String role, String band, int salary){
        System.out.println("Name : " + name);
        System.out.println("Empid : " + empid);
        System.out.println("Role : "+ role);
        System.out.println("Band : "+band);
        System.out.println("salary per month : "+ salary);
        System.out.println("Company name : " + company);
        System.out.println("Address : " + address);
        System.out.println("Landmark : " + landMark);


    }

   public static void main(String[] args) {
        EmployeeDetails empD =new EmployeeDetails();
       System.out.println("First emp details:");
        empD.emdetails("Sathya",123,"QA","B1",100000);
       System.out.println("*********************************");
       System.out.println("Second emp details:");
       empD.emdetails("Rujana",456,"Developer","B2",200000);
       System.out.println("*********************************");
       System.out.println("Third emp details:");
       empD.emdetails("Jaya",786,"Performance tester","B3",300000);
       System.out.println("*********************************");
       System.out.println("Fourth emp details:");
       empD.emdetails("Om Jasvandt",9007,"All rounder","C1",500000);
    }

}
