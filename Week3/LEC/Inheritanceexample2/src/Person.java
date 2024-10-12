public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name,int age, String email ){
        this.name = name;
        this.age=  age;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setAge(int age){
        this.age= age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String  name){
        this.name=  name;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "name: " +getName() +" Age: "+getAge()+ " email: "+ getEmail();
    }
}
