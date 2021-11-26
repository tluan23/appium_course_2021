package lesson06;

public class Book {
    private final String iSBN;
    private final String title;
    private final String author;
    private final int year;

    public Book(String ISBN, String title, String author, int year) {
        this.iSBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getISBN() {
        return iSBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }


}
