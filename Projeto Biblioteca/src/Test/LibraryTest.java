package Test;

import Domain.Books;
import Domain.LibrarySystem;
import Domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LibraryTest {
    public static void main(String[] args) {

        LibrarySystem ls = new LibrarySystem();
        Scanner sc = new Scanner(System.in);
        int numeroEscolhido;
        User user = new User();
        List<Books> livrosParaAdicionarNaLista = new ArrayList<>();


        do {
            System.out.println("=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("=== 1 - Cadastrar Livro ====");
            System.out.println("=== 2 - Listar Livros Catálogo");
            System.out.println("=== 3 - Cadastrar usuário");
            System.out.println("=== 4 - Listar Usuario");
            numeroEscolhido = sc.nextInt();
            sc.nextLine();


        switch (numeroEscolhido){
            case 1:
                System.out.println("Qual o nome do livro que deseja cadastrar?");
                String nomeLivro = sc.nextLine();
                System.out.println("Qual o autor desse livro?");
                String autorLivro = sc.nextLine();
                Books book = new Books(nomeLivro.toUpperCase(), autorLivro.toUpperCase());
                ls.registerBook(book);
                livrosParaAdicionarNaLista.add(book);
                break;

            case 2:
                System.out.println("Deseja listar somente livros disponíveis? (S/N)");
                char yesOrNo = sc.next().charAt(0);
                String charEmString = "" + yesOrNo;
                if (charEmString.equalsIgnoreCase("s")){
                livrosParaAdicionarNaLista.stream().filter(p -> p.isAvailable() == true).forEach(System.out::println);

                }else if (charEmString.equalsIgnoreCase("n")){
                    ls.listBooks();
                }
                break;

            case 3:
                System.out.println("Qual o nome do usuário?");
                String nameUser = sc.nextLine();
                ls.registerUser(new User(nameUser));
                break;

            case 4:
                ls.listUser();
                break;

            case 5:
                System.out.println("Qual o nome do livro que deseja pegar emprestado?");
                String nameBook = sc.nextLine();
                ls.emprestarLivro(nameBook.toUpperCase());


        }
            }while (numeroEscolhido != 0);
    }
}
