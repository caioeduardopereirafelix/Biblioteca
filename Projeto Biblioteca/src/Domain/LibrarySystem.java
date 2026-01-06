package Domain;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    List<Books> booksList = new ArrayList<>();
    List<User> userList = new ArrayList<>();

    public LibrarySystem() {
        this.booksList = booksList;
        this.userList = userList;
    }

    public void registerBook(Books book){
        booksList.add(book);
        System.out.println("LIVRO CADASTRADO COM SUCESSO" + "\n");
        listBooks();
    }

    public void registerUser (User user){
            userList.add(user);
            System.out.println("Usuario cadastrado com sucesso" + "\n");
    }

    public void listBooks(){
        System.out.println(booksList);
    }

    public void listUser(){
        System.out.println(userList);
    }

        public void changeAvailableFalse(String title){
            for (Books books: booksList){
                if (books.getTitle().equalsIgnoreCase(title)){
                    books.setAvailable(false);
                }
            }
        }

    public void changeAvailableTrue(String title){
        for (Books books: booksList){
            if (books.getTitle().equalsIgnoreCase(title)){
                books.setAvailable(true);
            }
        }
    }

    public void toLoanBook(String nameBook, String nameUserLoan) {
        String bookFound = null;
        String userFound = null;

        for (Books books : booksList) {
            if (books.getTitle().equalsIgnoreCase(nameBook)) {
                bookFound = nameBook;
            }
        }

        for (User user : userList) {
            if (user.getName().equalsIgnoreCase(nameUserLoan)) {
                userFound = nameUserLoan;
            }
        }
        User user = new User();
        Books book = new Books();
        user.loanBook(nameBook);
        book.setAvailable(false);
        System.out.println("Livro " + nameBook + " Emprestado para o usuario " + nameUserLoan);


        }

        public void returnBooks(String title, String userReturnBook){
            for (Books book: booksList){
                for (User user: userList){
                    if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable() && user.getName().equalsIgnoreCase(userReturnBook)){
                        user.removeBooksUser(title);
                        changeAvailableTrue(title);
                        System.out.println("Livro " + title + " devolvido com sucesso pelo usuario: " + userReturnBook);
                    }
                }
            }
        }


}
