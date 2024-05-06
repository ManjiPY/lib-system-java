package classes;

public class Book {
    private String title;
    private String author;
    private int examples;

    public Book(String title, String author, int examples) {
        this.title = title;
        this.author = author;
        this.examples = examples;
    }

    public String returnBookTitle() {
        return title;
    }

    public String returnBookAuthor() {
        return author;
    }

    public int returnNumExamples() {
        return examples;
    }

    public void lendBook() {
        if(examples > 0) {
            examples--;
            System.out.println("=========================================");
            System.out.println("The book was borrowed from the bookstore.");
            System.out.println("=========================================");
        } else {
            System.out.println("==================================================================================");
            System.out.println("It's a shame, it seems that there are no copies/quantities of this book available.");
            System.out.println("==================================================================================");
        }
    }

   public void returnBookToLib() {
    examples++;
    System.out.println("======================================");
    System.out.println("Thanks for return the book for ours :D");
    System.out.println("======================================");
   }
}
