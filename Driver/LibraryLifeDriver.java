package Driver;

import java.util.Scanner;
import Model.Library;
import Model.Book;

public class LibraryLifeDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add book");
            System.out.println("2. Display books");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = input.nextLine();
                    System.out.print("Author: ");
                    String author = input.nextLine();
                    System.out.print("Year: ");
                    int year = input.nextInt();
                    input.nextLine();
                    Book book = new Book(title, author, year);
                    library.addBook(book);
                    System.out.println("Book added.");
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Tencuuu!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
       
        while (!exit);
    }
}