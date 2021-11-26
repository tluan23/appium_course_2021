package lesson06;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        List <Book> bookLibrary = new ArrayList<>();
        boolean isContinue = true;
        while (isContinue)
        {
            System.out.println("=====Book Management=====");
            System.out.println("1. Add book");
            System.out.println("2. Retrieve Book");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            int userOption =  scanner.nextInt();
            switch(userOption)
            {
                case 1:
                    addBook(bookLibrary);
                    break;
                case 2:
                    retrieveBook(bookLibrary);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Wrong option");
            }
        }
    }

    private static void addBook(List<Book> bookLibrary) {
        Scanner scanner = new Scanner(System.in);

        String bookID = "";
        String bookTitle = "";
        String bookAuthor ="";
        int year = 0;
        System.out.println("Input ID");
        bookID = scanner.nextLine();
        System.out.println("Input title");
        bookTitle = scanner.nextLine();
        System.out.println("Input author");
        bookAuthor = scanner.nextLine();
        System.out.println("Input year");
        year = scanner.nextInt();
        Book book = new Book(bookID,bookTitle,bookAuthor,year);
        bookLibrary.add(book);
    }

    private static void retrieveBook(List<Book> bookLibrary) {
        Scanner scanner = new Scanner(System.in);
        boolean isBookExist = false;
        System.out.println("input book ID");
        String searchBookID = scanner.nextLine();
        for (Book book : bookLibrary) {
            if (book.getISBN().equals(searchBookID)) {
                System.out.println("Book info:");
                System.out.println("Book ID: " + book.getISBN());
                System.out.println("Book Title: " +book.getTitle());
                System.out.println("Book Author: " +book.getAuthor());
                System.out.println("Book Year: " +book.getYear());
                isBookExist = true;
            }
        }
        if (!isBookExist)
            System.out.println("Have no book matched");


    }
}
