package classes;
import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> collection;

    public Library() {
        collection = new ArrayList<>();
    }

    public void addBookToLibrary(Book book) {
        collection.add(book);
    }

    public void showBooks() {
        System.out.println("All books: ");
        for (Book book : collection) {
            System.out.println("Book name: " + book.returnBookTitle() + " - Author: " + book.returnBookAuthor());
        }
    }
}