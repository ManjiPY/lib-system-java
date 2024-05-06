package classes;
import java.util.List;
import java.util.ArrayList;
import classes.Book;

public class User {
    private String name;
    public List<Book> lendBooks;


    public User(String name) {
        this.name = name;
        lendBooks = new ArrayList<>();
    }

    public String getUserName() {
        return name;
    }

    public String lendBook(Book book) {
        book.lendBook();
        lendBooks.add(book);
        return book.returnBookTitle();
    }

    public void returnBookToLib(Book book) {
        book.returnBookToLib();
        lendBooks.remove(book);
    }
}