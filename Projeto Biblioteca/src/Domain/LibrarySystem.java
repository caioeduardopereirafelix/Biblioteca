package Domain;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    List<Books> booksList = new ArrayList<>();
    List<User> userList = new ArrayList<>();

    public LibrarySystem() {
    }

    public void registerBook(Books book) {
        booksList.add(book);
        System.out.println("LIVRO CADASTRADO COM SUCESSO" + "\n");
        book.setAvailableBook(AvailableBook.AVAILABLE);
        listBooks();
    }

    public void registerUser(User user) {
        userList.add(user);
        System.out.println("Usuario cadastrado com sucesso" + "\n");
    }

    public void listBooks() {
        System.out.println(booksList);
    }

    public void listUser() {
        System.out.println(userList);
    }

    public void toLoanBook(String nameBook, String nameUserBorrowed) {
        Books localNameBookBorrowed = null;
        User localUsernameBorrowed = null;

        for (Books book : booksList) {
            if (book.getTitle().equalsIgnoreCase(nameBook)) {
                localNameBookBorrowed = book;
                break;
            }
        }

        if (localNameBookBorrowed == null){
            System.out.println("Livro nao encontrado");
            return;
        }

        if (localNameBookBorrowed.getAvailableBook() == AvailableBook.BORROWED){
            System.out.println("Livro ja emprestado");
            return;
        }

        for (User user : userList){
            if (user.getName().equalsIgnoreCase(nameUserBorrowed)){
                localUsernameBorrowed = user;
                break;
            }
        }

        if (localUsernameBorrowed == null){
            System.out.println("Usuario nao encontrado");
            return;
        }

        localNameBookBorrowed.setAvailableBook(AvailableBook.BORROWED);
        localUsernameBorrowed.loanBook(localNameBookBorrowed);
        System.out.println("Livro " + nameBook + " emprestado com sucesso para o usuario " + nameUserBorrowed);
    }

    public void returnBooks(String nameBookForReturn, String userReturnBook) {
        Books localNameBookForReturn = null;
        User localNameUserReturnBook = null;

        for (Books books : booksList){
            if (books.getTitle().equalsIgnoreCase(nameBookForReturn)){
                localNameBookForReturn = books;
                break;
            }
        }

        if (localNameBookForReturn == null){
            System.out.println("Livro nao encontrado na lista");
            return;
        }

        for (User user : userList){
            if (user.getName().equalsIgnoreCase(userReturnBook)){
                localNameUserReturnBook = user;
                break;
            }
        }

        if (localNameUserReturnBook == null){
            System.out.println("Usuario nao encontrado em sistema");
        }

        localNameUserReturnBook.returnBooks(localNameBookForReturn);
        System.out.println("Livro " + nameBookForReturn + " devolvido com sucesso pelo usuario " + userReturnBook);
    }

}
