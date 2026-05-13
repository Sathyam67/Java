public class servant extends Employee{
    @Override
    void work() {
        System.out.println("Servant cleans office");
    }
    public static void main(String[] args)
    {
        Employee e=new Employee();
        servant s=new servant();
        e.work();
        s.work();
    }
}
