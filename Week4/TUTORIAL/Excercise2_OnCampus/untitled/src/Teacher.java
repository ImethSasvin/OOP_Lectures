public class Teacher extends Person{
    private double salary;
    private String subject;

    public Teacher(String myName, int myAge, String myGender ,double salary, String subject){
        super(myName, myAge, myGender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
