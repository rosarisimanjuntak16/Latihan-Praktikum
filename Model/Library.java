// Library.java
package Model;

import java.util.ArrayList;
import java.util.List;

public class Library implements OperasiLib {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Perpustakaan kosong.");
        } else {
            System.out.println("Daftar Buku:");
            for (Book book : books) {
                System.out.println("Judul: " + book.getTitle() + ", Pengarang: " + book.getAuthor());
            }
        }
    }
}
