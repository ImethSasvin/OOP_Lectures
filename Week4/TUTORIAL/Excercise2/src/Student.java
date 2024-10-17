public class Student  extends Person{
    private String myIdNum; // Student Id
    private double fee; // Grade Point Average
    private int grade;

    public Student(String myName,int myAge,String myGender,String myIdNum,double fee,int grade){
        super(myName,myAge,myGender);
        this.myIdNum = myIdNum;
        this.fee = fee;
        this.grade = grade;
    }

    public Student(String myName,int myAge,String myGender,String myIdNum){
        super(myName,myAge,myGender);
        this.myIdNum = myIdNum;
    }
    public String getMyIdNum() {
        return myIdNum;
    }
    public void setMyIdNum(String myIdNum){
        this.myIdNum = myIdNum;
    }

    public double getFee() {
        return fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }

    public String toString(){
        return super.toString() + ", student id: " + myIdNum + ", fee: " + fee + ", grade: " + grade;
    }
}
