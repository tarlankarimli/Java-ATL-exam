public class Subject {
    String Name;
    int Credit;
    Teacher Instructor;

    public Subject () {
        System.out.println("This is Subject default");
    }

    public Subject (String Name, int Credit, Teacher Instructor) {
        this.Name = Name;
        this.Credit = Credit;
        this.Instructor = Instructor;
    }
    public String toString () {
        return "Subject name: " + Name
                + "\nCredit: " + Credit
                + "\nInstructor " + Instructor;
    }
}
