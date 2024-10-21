// Book Entity
public class Book {
    private String title;
    private String status;

    public Book(String title) {
        this.title = title;
        this.status = "Available";
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }
}

