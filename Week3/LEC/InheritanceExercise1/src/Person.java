public class Person {
    private String name;
    private String dob;

    public Person(String name, String dob){
        this.name = name;
        this.dob = dob;
    }
    public Person(String name){
        this.name =name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public String getDob(){
        return dob;
    }


    public String toString(){
        return  "Name: "+ getName()+" DOB:"+getDob();
    }


}
