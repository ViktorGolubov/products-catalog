package tech.bts.productcatalog.bookexample;

public class Book {

    String title;
    String author;
    int numPages;

    public Book (String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;

    }

    public String toString () {
        return this.author + " writes the book " + this.title + " with " + this.numPages + " pages.";
    }
}
