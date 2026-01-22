package activity1;

public class Book {

    String title;
    String author;
    String isbn;
    String publicationDate;

    // parameterized

    public Book(String title, String author, String isbn, String publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    void printBookInfo() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println();
    }

}