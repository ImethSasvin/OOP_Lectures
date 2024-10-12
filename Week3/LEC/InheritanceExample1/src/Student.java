public class Student extends Person {

    private final String idNumber;

    public Student(String name, int age, String email, String idNumber) {
        super(name, age, email);
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Email: " + getEmail() + ", ID Number: " + idNumber;
    }
}
