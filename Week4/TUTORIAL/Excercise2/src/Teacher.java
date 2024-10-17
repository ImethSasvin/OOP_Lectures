public class Teacher extends Person{

    private double salary;
    private String subject;
    public Teacher(String myName, int myAge, String myGender ,double salary, String subject){
        super(myName, myAge, myGender);
        this.salary = salary;
        this.subject = subject;
    }

    public Teacher(String myName, int myAge, String myGender,String subject, double salary){
        super(myName, myAge, myGender);
        this.salary = salary;
        this.subject = subject;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public String toString(){
        return super.toString() + ", salary: " + salary + ", subject: " + subject;
    }
}
