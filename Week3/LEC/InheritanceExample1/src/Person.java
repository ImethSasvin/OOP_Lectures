public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(){
        this.age = age;
    }

public void setEmail(){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email;
    }
}
