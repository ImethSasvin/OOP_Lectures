public class Main {
    public static void main(String[] args) {

        Person Jack = new Person("Jack Smith", 15, "M");
        System.out.println(Jack);

        Student beth = new Student("Beth Smith", 16, "F", 112233, 1000, 12);
        System.out.println(beth);

        Teacher sam = new Teacher("Sam Hamilton", 34, "M", 50000, "Computer Science");
        System.out.println(sam);


    }
}