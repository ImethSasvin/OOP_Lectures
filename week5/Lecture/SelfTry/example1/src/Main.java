public class Main {
    public static void main(String[] args) {

        Grade[] grades =
                {
                        new Grade("A", 95), new Grade("A-", 90),
                        new Grade("B+", 87), new Grade("B", 85), new Grade("B-", 80),
                        new Grade("C+", 77), new Grade("C", 75), new Grade("C-", 70),
                        new Grade("D+", 67), new Grade("D", 65), new Grade("D-", 60),
                        new Grade("F", 0)
                };

        Grade currentGrade;
        for(int i = 0; i < grades.length; i++){
            currentGrade = grades[i];
            System.out.println(currentGrade);
        }
    }
}