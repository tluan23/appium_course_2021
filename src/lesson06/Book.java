package lesson06;

public class Book {
    private String iSBN = "";
    private String title = "";
    private String author = "";
    private int year = 0;

    public Book(String ISBN, String title, String author, int year) {
        this.iSBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getiSBN() {
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
