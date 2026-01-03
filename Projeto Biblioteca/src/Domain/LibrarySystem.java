package Domain;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    List<Books> booksList = new ArrayList<>();

    public LibrarySystem() {
        this.booksList = booksList;
    }

    public void registerBook(Books book){
        booksList.add(book);
    }
    public void listaLivros(){
        System.out.println(booksList);
    }

}
