import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> band =  new ArrayList<>();

        band.add("Paul");
        band.add("John");
        band.add("George");
        band.add("Peter");

//        for(int i = 0; i<band.size(); i++){
//            System.out.print(band.get(i)+" ");
//        }

        System.out.println(band);

        int location = band.indexOf("Peter");
        band.remove(location);

        System.out.println(band);

        System.out.println("At index 1: "+band.get(1));


        band.add(2, "Ringo");

        System.out.println(band);
        System.out.println("SIze: "+band.size());
    }
}