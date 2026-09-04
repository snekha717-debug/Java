package practice8;
//Base class
class Book {
 protected String title;
 protected String author;

 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 public void display() {
     System.out.println("Book Details:");
     System.out.println("Title  : " + title);
     System.out.println("Author : " + author);
 }
}

//Derived class representing Technical books
class Technical extends Book {
 protected String subject;

 public Technical(String title, String author, String subject) {
     super(title, author);
     this.subject = subject;
 }

 @Override
 public void display() {
     System.out.println("Technical Book Details:");
     System.out.println("Title   : " + title);
     System.out.println("Author  : " + author);
     System.out.println("Subject : " + subject);
 }
}

//Further derived class representing Story books
class Story extends Technical {
 private String genre;

 public Story(String title, String author, String subject, String genre) {
     super(title, author, subject);
     this.genre = genre;
 }

 @Override
 public void display() {
     System.out.println("Story Book Details:");
     System.out.println("Title   : " + title);
     System.out.println("Author  : " + author);
     System.out.println("Subject : " + subject);
     System.out.println("Genre   : " + genre);
 }
} 
public class Question1 {
	public static void main(String[] args) {
        // Base class reference variable
        Book bookRef;

        // 1. Referencing a general Book object
        bookRef = new Book("The Design of Everyday Things", "Don Norman");
        bookRef.display();

        System.out.println("------------------------------------");

        // 2. Referencing a Technical book object (Runtime Polymorphism)
        bookRef = new Technical("Effective Java", "Joshua Bloch", "Computer Science");
        bookRef.display();

        System.out.println("------------------------------------");

        // 3. Referencing a Story book object (Runtime Polymorphism)
        bookRef = new Story("The Martian", "Andy Weir", "Hard Science Fiction", "Survival Adventure");
        bookRef.display();
    }
}
