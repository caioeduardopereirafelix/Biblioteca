package Test;

import Domain.Books;
import Domain.LibrarySystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LibraryTest {
    public static void main(String[] args) {

        LibrarySystem ls = new LibrarySystem();
        Scanner sc = new Scanner(System.in);
        int numeroEscolhido;
        List<Books> livrosParaAdicionarNaLista = new ArrayList<>();


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
                livrosParaAdicionarNaLista.add(book);
                System.out.println("LIVRO CADASTRADO COM SUCESSO");
                ls.listaLivros();
                break;

            case 2:
                System.out.println("Deseja listar somente livros disponíveis? (S/N)");
                char yesOrNo = sc.next().charAt(0);
                Character.toUpperCase(yesOrNo);
                if (yesOrNo == 'S' ){
                livrosParaAdicionarNaLista.stream().filter(p -> p.isAvailable() == true).forEach(System.out::println);

                }else if (yesOrNo == 'N'){
                    ls.listaLivros();
                }
        }
        }while (numeroEscolhido != 0);
    }
}
