public class Employee extends Person {
    private final String empId;
    private final int empSalary;

    public Employee(String name, int age, String email, String empId ,  int empSalary){

        super(name,age,email);
        this.empId = empId;
        this.empSalary =  empSalary;
    }

    @Override
    public String toString(){
        return "name: " +getName() +" Age: "+getAge()+ " email: "+ getEmail()+ " Employee id: "+empId+" salary "+empSalary;
    }
}
