public class Main {
    public static void main(String[] args) {

        Person t1 = new Teacher("John", 35, "abc",25621);
        Person s1 = new Student("Alice", 20, "xyz", "A1234");

        System.out.println(t1);
        System.out.println(s1.toString());

    }
}