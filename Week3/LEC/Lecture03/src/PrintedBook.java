public class PrintedBook extends Book {
    private int pages;

    public PrintedBook(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pages: " + pages);
    }
}