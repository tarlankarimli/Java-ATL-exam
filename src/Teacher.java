public class Teacher extends Human {
    String Specialty;
    Degree AcademicDegree;

    public Teacher() {
        System.out.println("This is default dude");
    }

    public Teacher(String Fullname, String Email, String Birthdate, String Specialty, Degree AcademicDegree) {
            super(Fullname, Email, Birthdate);
            this.Specialty = Specialty;
            this.AcademicDegree = AcademicDegree;
        }
    public String toString () {
        return super.toString() + "\nSpecialty: " + Specialty + "\nAcademic Degree: " + AcademicDegree;
    }
    }

