package Domain;

import java.util.UUID;

public class Books {
    private UUID idBook = UUID.randomUUID();
    private String title;
    private String author;
    private boolean available = true;

    public Books(String titulo, String author) {
        this.title = titulo;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return
                "\n" + "Title Book: " + title + "\n"
                + "Author Book: " + author + "\n"
                + "Id Book: " + idBook + "\n"
                + "Available: " + available + "\n";
    }
}
