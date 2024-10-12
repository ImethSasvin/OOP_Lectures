public class Director{
    private String name;
    private String surname;
    private int noOfMovies;

    private Date dateOfBirth;


    public Director(String name, String surname){

        this.name = name;
        this.surname = surname;


    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNoOfMovies(){
        return noOfMovies;
    }

    public void setNoOfMovies(int noOfMovies){
        this.noOfMovies = noOfMovies;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDoB(){
        return dateOfBirth;
    }

    @Override
    public String toString(){
        return "Name: "+name+" Surname: "+surname+" No of Movies: "+noOfMovies+" Date of Birth: "+dateOfBirth;
    }

    public void setNumberOfMovie(int i) {
        this.noOfMovies = i;
    }

    public void setDoB(Date dob) {
        this.dateOfBirth = dob;
    }
}
