package activity1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = " Invincible Volume 1: Family Matters ";
        book1.author = "Robert Kirkman";
        book1.isbn = "978-1582403205";
        book1.publicationDate = "September 14, 2003";

        Book book2 = new Book();
        book2.title = " I Hate Fairyland ";
        book2.author = "Skottie Young";
        book2.isbn = "978-1534303805";
        book2.publicationDate = "December 12, 2017 ";

        book1.printBookInfo();
        book2.printBookInfo();
    }
}