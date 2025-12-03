package mindfulreads;

public class Book {

    private String title;
    private String author;
    
    
    //constructor,used it for creating Book obj.
    //Accepts a title and author and assigns them to the variables
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
