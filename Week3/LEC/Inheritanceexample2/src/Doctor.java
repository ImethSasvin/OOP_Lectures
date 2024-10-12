public class Doctor extends Person {

    private final int docId;
    private final double docSalary;

    public Doctor(String name, int age, String email, int docId,double docSalary){
        super(name,age,email);

        this.docId =docId;
        this.docSalary = docSalary;

    }

    public String toString(){
        return "name: " +getName() +" Age: "+getAge()+ " email: "+ getEmail()+ " Doctor id: "+docId+" salary "+docSalary;
    }
}
