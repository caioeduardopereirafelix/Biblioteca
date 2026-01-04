package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID id = UUID.randomUUID();
    private String name;
    List<Books> borrowedBooks = new ArrayList<>();

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Books> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return "Name User = " + name + '\'';
    }
}