package Test;

import Domain.Books;
import Domain.LibrarySystem;

import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {

        LibrarySystem ls = new LibrarySystem();
        Scanner sc = new Scanner(System.in);
        int numeroEscolhido;


        do {
            System.out.println("=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("=== 1 - Cadastrar Livro ====");
            System.out.println("=== 2 - Listar Livros Catálogo");
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
                System.out.println("LIVRO CADASTRADO COM SUCESSO");
                ls.listaLivros();
                break;

            case 2:
                System.out.println("Deseja listar somente livros disponíveis? (S/N)");
                char yesOrNo = sc.next().charAt(0);
                if (yesOrNo == 'S' ){

                }else if (yesOrNo == 'N'){
                    ls.listaLivros();
                }
        }
        }while (numeroEscolhido != 0);
    }
}
