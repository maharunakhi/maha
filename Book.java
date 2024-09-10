
package book;
public class Book {
    private String title;
    private String author;
    private int year;
    private static int bookCount = 0;  // Class variable to keep track of the total number of books

    // Parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookCount++;  // Increment the book count whenever a new Book object is created
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    // Class method to display the total number of books
    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + bookCount);
    }

    public static void main(String[] args) {
        // Creating three Book objects using the parameterized constructor
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        // Displaying the details of each book
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();
        System.out.println();

        System.out.println("Book 2 Details:");
        book2.displayBookDetails();
        System.out.println();

        System.out.println("Book 3 Details:");
        book3.displayBookDetails();
        System.out.println();

        // Displaying the total number of books
        Book.displayTotalBooks();
    }
}