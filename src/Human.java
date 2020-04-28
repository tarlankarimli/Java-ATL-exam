public class Human {
    String Fullname, Email;
    protected String Birthdate;

    enum Degree {
        BACHELOR,
        MASTER,
        DOCTORA;
    }

    public Human() {
        System.out.println("This is default constructor");
    }

    public Human(String Fullname, String Email) throws EmailFormatError {
        if(!(Email.contains("@") && Email.contains("."))) {
            throw new EmailFormatError("This email doesn't contain '@' and '.' symbols ");
        }
        this.Fullname = Fullname;
        this.Email = Email;
    }

    public Human(String Fullname, String Email, String Birthdate) throws EmailFormatError {
        if(!(Email.contains("@") && Email.contains("."))) {
            throw new EmailFormatError("This email doesn't contain '@' and '.' symbols ");
        } else {
            this.Fullname = Fullname;
            this.Email = Email;
            this.Birthdate = Birthdate;
        }
    }
    public String getName(){
        String[] name = Fullname.split(" ");
        return name[0];
    }

    public String toString () {
        return "Fullname: " + Fullname
                + "\nEmail: " + Email
                + "\nName: " + getName()
                + "\nBirthdate: " + Birthdate;
    }
}