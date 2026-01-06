package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID id = UUID.randomUUID();
    private String name;
    List<String> borrowedBooks = new ArrayList<>();

    public User() {
    }

    public User(String name) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public List<Books> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void loanBook(Books book){
        borrowedBooks.add(book);
    }

    public void listBooksBorrowed(){
        System.out.println(borrowedBooks);
    }

    public void removeBooksUser(String title){
        for (String booksBorrowed : borrowedBooks){
            if (booksBorrowed.equalsIgnoreCase(title)){
                borrowedBooks.remove(title);
            }
        }
    }

    @Override
    public String toString() {
        return "Name User = " + name;
    }
}