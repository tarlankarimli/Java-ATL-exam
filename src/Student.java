import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Student extends Human{
    Dictionary<Subject, Integer> Subjects;

    public Student (Dictionary Subjects, String Fullname, String Email, String Birthdate) {
        super(Fullname, Email, Birthdate);
        this.Subjects = Subjects;
    }

   public void AddSubject (Subject subject, int number) {
       if (number > 50) {
           System.out.println("Murad took Introduction to " + subject.Name+ " subject and passed it successfully");
       }
       else {
           System.out.println("Murad took Introduction to " + subject.Name+ " subject and failed");
       }

    }
}
