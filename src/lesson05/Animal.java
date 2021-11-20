package lesson05;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Input your Book ID");
        Scanner scanner = new Scanner(System.in);
        String iSBN = scanner.next();

        System.out.println("Input your Year");
        String bookYear = scanner.next();

        System.out.println("Input your Book Title");
        String bookTitle = scanner.next();

        System.out.println("Input your Book Author");
        String bookAuthor = scanner.next();
    }
}
