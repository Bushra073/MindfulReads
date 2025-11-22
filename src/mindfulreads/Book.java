package mindfulreads;

public class Book {

    private String title;
    private String author;

    public Book(String t, String a) {
        this.title = t;
        this.author = a;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
