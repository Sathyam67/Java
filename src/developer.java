public class developer extends Employee
{
    @Override
    void work() {
        System.out.println("Manager handling team");
    }
    public static void main(String[] args) {
        Employee e=new Employee();
        developer d= new developer();
        e.work();
        d.work();
    }
}
