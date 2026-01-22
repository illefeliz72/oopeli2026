package activity1;

public class Book {
    public String title;
    public String author;
    public String isbn;
    public String publicationDate;

    public Book() {
    }

    public void printBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Published: " + publicationDate);
      
    }
}