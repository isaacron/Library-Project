// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Library library = new Library("My Library", null, null);
    Book book1 = new Book("The Lord of The Rings", "J.R.R. Tolkien", "978-0-395-19395-8");
    Book book2 = new Book("To Kill a Mockingbird", "Harper Lee" , "978-0-06-112982-5");
    Book book3 = new Book("1984", "George Orwell", "978-0-06-112982-5");
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    library.displayLibraryBooks();
    
    
  }
}