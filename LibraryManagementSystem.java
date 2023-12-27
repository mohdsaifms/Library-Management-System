package library_ManSystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding sample books to the library
        library.addBook(new Book(1, "Java Programming", "John Doe"));
        library.addBook(new Book(2, "Python Basics", "Jane Smith"));
        library.addBook(new Book(3, "Data Structures", "Alice Johnson"));

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Display All Books");
            System.out.println("2. Find a Book by ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("All Books:");
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter book ID to find: ");
                    int bookId = scanner.nextInt();
                    Book foundBook = library.findBookById(bookId);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        System.out.println(foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}