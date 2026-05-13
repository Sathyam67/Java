public class StringQuestionsTask {
    String a ="abcdef";
    String b ="xyz1234";
    String c= "abcxy";
    //String a= ”abcdef”; String b= “xyz1234”; String c= “abcxy”;
    // 1. Verify length of the A variable should be greater than length of the C variable and
    // should be less than length of the B variable.
    public void task1(){
        /*String a ="abcdef";
        String b ="xyz1234";
        String c= "abcxy";*/
        if(a.length()>c.length()&& a.length()<b.length()){
            System.out.println("task1 condition verified");
        }else {
            System.out.println("task1 condition not satisfied");
        }
         }

         //2. A variable should not be same as B variable and C variable
public void task2(){
        if(a != b && a != c){
            System.out.println("task2 conditon passed");
        }else {
            System.out.println("task2 condition not passed");
        }
}
//3. C variable should be same as A variable irrespective of the case.

    public void task3() {
        if(c.equalsIgnoreCase(a)){
            System.out.println("task3 conditon passed");

        }else {
            System.out.println("task3 conditon not passed");
        }
    }

    //4. A variable should contains cd and should not contains xy
     public void task4(){
        if(a.contains("cd") && !a.contains("xy")){
            System.out.println("task4 passed");
        }else {
            System.out.println("task4 not passed");
        }
     }
     //5. Convert B variable into uppercase and verify it should contains “Z” & should not contains “z”
    public void task5(){
        System.out.println("UPPERCASE "+b.toUpperCase());
        if (b.contains("Z") && !b.contains("z")){
            System.out.println(" task5 condition satisfied"+b);
        }else {
            System.out.println("task5 condition not satisfied" + b);
        }
    }

    public static void main(String[] args) {
        StringQuestionsTask obj =new StringQuestionsTask();
        obj.task1();
        obj.task2();
        obj.task3();
        obj.task4();
        obj.task5();

    }
}
