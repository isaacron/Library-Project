public class Book { 
  private String title;
  private String author;
  private String isbn;
  public Book(String title, String author, String isbn) //It initializes the instance variables  
  { 
  this.title = title;
  this.author = author;
  this.isbn = isbn;
  }
  public void displayBookInfo() //It displays the book information
  {
    System.out.println("Title: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("ISBN: " + this.isbn);
  }
}

