// Data Access Layer for Book
public class BookRepository {
    public Book findBookByTitle(String title) {
        // Simulate database lookup
        return new Book(title); // In real-world, you'd fetch from DB
    }

    public void updateBookStatus(Book book, String status) {
        // Simulate DB update
        book.updateStatus(status);
        System.out.println("Updated Book Status to: " + status);
    }
}


