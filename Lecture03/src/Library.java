public class Library {
    private String name;
    private String address;
    private String phone;

    public Library(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void returnBook(Book book) {
        System.out.println("Returning book: " + book.getTitle());
    }

    public void returnBook(Book book, String condition) {
        System.out.println("Returning book: " + book.getTitle() + " in " + condition + " condition");
    }

    public void returnBook(Book book, boolean isDamaged) {
        String condition = isDamaged ? "damaged" : "good";
        System.out.println("Returning book: " + book.getTitle() + " in " + condition + " condition");
    }
}