package practice4;
class Book {
    String title;
    String author;
    double price;

    // Constructor to initialize book variables
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Displays the book information
    public void displayBookInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : $" + price);
        System.out.println("-------------------------");
    }
}

public class Question3 {

	public static void main(String[] args) {
		Book book1 = new Book("Effective Java", "Joshua Bloch", 45.50);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 42.00);

        book1.displayBookInfo();
        book2.displayBookInfo();

	}

}
