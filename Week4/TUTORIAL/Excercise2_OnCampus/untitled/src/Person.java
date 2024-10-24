public class Person {
    protected String name;
    protected int myAge;
    protected String myGender;

    public Person(String name, int myAge, String myGender) {
        this.name = name;
        this.myAge = myAge;
        this.myGender = myGender;
    }

    public String getName(){
        return name;
    }
    public void getName(String name){
        this.name = name;
    }

    public int getAge(){
        return myAge;
    }
    public void setMyAge(int myAge){
        this.myAge = myAge;
    }

    public String getGender(){
        return myGender;
    }
    public void setGender(String myGender){
        this.myGender = myGender;
    }

    public String toString() {
        return "Name: " + name + ", age: " + myAge;
    }
}