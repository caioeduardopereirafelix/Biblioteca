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

    public void emprestarLivro(String nameBook){
        if (booksList.stream().filter(p -> p.getTitle().matches(nameBook)).collect()){

        }
    }

}
