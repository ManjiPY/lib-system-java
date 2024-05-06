import classes.Book;
import classes.Library;
import classes.User;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book bookRelativity = new Book("Relativity", "Albert Einstein", 3);
        Book bookJava = new Book("Java Basics", "Christian Ullenboon", 7);

        library.addBookToLibrary(bookRelativity);
        library.addBookToLibrary(bookJava);

        library.showBooks();

        User matthew = new User("Matthew");
        //User jorge = new User("Jorge");

        matthew.lendBook(library.collection.get(0));

        System.out.println("The user " + matthew.getUserName() + " lend the book: " + matthew.lendBooks.get(0).returnBookTitle());

        matthew.returnBookToLib(matthew.lendBooks.get(0));

        library.showBooks();
    }
}
