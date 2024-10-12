public class Teacher extends Person{

    private final double salary;
    public Teacher(String name, int age, String email, double salary){
        super(name,age,email);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Email: " + getEmail() + ", Salary: " + salary;
    }
}
