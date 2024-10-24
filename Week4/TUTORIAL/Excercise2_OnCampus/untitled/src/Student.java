public class Student extends Person {
    private int IDNumber;
    private double fee;
    private int grade;



    public Student(String name, int age, String myGender,int IDNumber, double fee, int grade) {

        super(name,age,myGender);
        this.IDNumber = IDNumber;
        this.fee = fee;
        this.grade = grade;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public double getFee() {
        return fee;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", student id: " + IDNumber + ", fee: " + fee + ", grade: " + grade;
    }
}
