public class Main {
    public static void main(String[] args) {
        Person jack = new Person("Jack Smith", 15, "M");
        System.out.println(jack);
        Student beth = new Student("Beth Smith",16,"F","112233");
        System.out.println(beth);
        Teacher sam = new Teacher("Sam Hamilton",34,"M","Computer Science",50000);
        System.out.println(sam);
    }
}