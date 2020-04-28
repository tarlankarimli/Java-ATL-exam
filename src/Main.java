import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        Human human1 = new Human("Tarlan Karimli", "terlankerimli@gmail.com");

        Date date = new Date();
        SimpleDateFormat birthdate = new SimpleDateFormat("");
        String Birthdate =  birthdate.format(date);

        Human human2 = new Human("Tarlan Karimli", "terlankerimli@gmail.com", Birthdate);

        Teacher teacher = new Teacher("Tarlan Karimli", "terlankerimli@gmail.com", Birthdate, "Engineer", Human.Degree.DOCTORA);

        Subject math = new Subject("Math", 25, teacher);

        Dictionary<Subject, Integer> subjects = new Hashtable<Subject, Integer>();

        Student student = new Student(subjects, "Turan Karimli", "turankerimli@gmail.com", "21-04-1992");
        System.out.println("smahahaha: " +student + "  " + student.Subjects);

        Subject biology = new Subject();
        student.AddSubject(biology, 48);
    }
}