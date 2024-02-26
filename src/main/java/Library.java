public class Library {
  private String libraryName;
  private Book firstBook;
  private Book secondBook;

  public Library(String libraryName, Book firstBook, Book secondBook) { //constructor that initializes the instance variables.
    this.libraryName = libraryName;
    this.firstBook = null;
    this.secondBook = null;
  }
  void addBook(Book book) { //adds a book to the library.
    if (this.firstBook == null) {
      this.firstBook = book;
    } 
    else {
      this.secondBook = book;
    }
  }
  void displayLibraryBooks() { //displays the books in the library.
    System.out.println("Library Name: " + this.libraryName);
    if (firstBook!=null) {
      firstBook.displayBookInfo();
    }
    if (secondBook!=null) {
      secondBook.displayBookInfo();
    }
  }
}