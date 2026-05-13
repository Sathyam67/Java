public class Hospital {
    public static void main(String[] args) {
        Appointment a=new Appointment();
        Generaldoctor g=new Generaldoctor();
        Specialistdoctor s=new Specialistdoctor();
        Videoconsult v=new Videoconsult();
        a.bookapp();
        g.bookapp();
        s.bookapp();
        v.bookapp();
        }

    }

