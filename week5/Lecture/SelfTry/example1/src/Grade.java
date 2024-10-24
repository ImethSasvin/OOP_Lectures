public class Grade {
    private String name;
    private int lowerBound;

    public Grade(String grade, int cutoff){
        name = grade;
        lowerBound = cutoff;
    }

    public String toString(){
        return name + "\t" + lowerBound ;
    }
}
