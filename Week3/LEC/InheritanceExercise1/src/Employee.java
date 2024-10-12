public class Employee extends Person{

    private int salary;

    public Employee(String name, String dob, int salary){
        super(name,dob);
        this.salary =salary;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return  "Name: "+ getName()+" DOB:"+getDob() +" Salary "+ salary;
    }
}
