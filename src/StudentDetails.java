public class StudentDetails {
    //display student details
    static String colgName="oxford";
    static String colgAddress="USA";
    public void studentsdetails(String name, int id ){
        System.out.println( "" + name +id);
        System.out.println("Colg colgname "+ StudentDetails.colgName);
        System.out.println("colg address "+ StudentDetails.colgAddress);
    }

    public static void main(String[] args) {
        StudentDetails obj = new StudentDetails();
        System.out.println("Student details 1 ");
        obj.studentsdetails("bond ",1007);
        System.out.println("Student details 2");
        obj.studentsdetails("dummybond ",123);


    }
}

