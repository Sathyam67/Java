public class NewProject {
    //1.	Method without parameters and without return value
    public void hellojava() {
        System.out.println("Hello Java World");
    }

    public static void vennai() {
        System.out.println("vennai number 1");
    }

    //method with return and without parameter
    public String methodwithreturn() {
        System.out.println("method inside the return");
        return "sathyamurthy";
    }

    //method with parameter & without return
    public void hellowjava(int a) {
        System.out.println("Integar calling = " + a);
    }

    //method with parameter & with return
    public String Jayanthi(int b) {
        System.out.println("Cute name is " + b);
        return "Sandy";
    }

    public static void main(String[] args) {
        NewProject obj = new NewProject();//classname()--constructor
        obj.hellojava();
        obj.vennai();
        System.out.println("catching my name " + obj.methodwithreturn());
        obj.hellowjava(420);
        obj.Jayanthi(420);

        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++)
        {

            System.out.println(arr[i]);
        }
    }
}







