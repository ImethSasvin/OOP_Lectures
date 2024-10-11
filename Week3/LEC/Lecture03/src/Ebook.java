public class Ebook extends Book {
    private String format;

    public Ebook(String title, String author, int year, String format) {
        super(title, author, year);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Format: " + format);
    }
}