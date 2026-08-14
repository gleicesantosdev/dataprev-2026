package br.com.gleicesantosdev.bibliotecadigital;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bibilioeca Digital ===");

        System.out.print("Digite o nome do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = scanner.nextInt();

        System.out.print("Digite a quantidade disponível: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço do livro: ");
        double preco = scanner.nextDouble();

        scanner.nextLine();

        System.out.println(" Digite o nome do autor: ");
        String autor = scanner.nextLine();

        System.out.println("Quantidade de páginas: ");
        int quantidadePaginas = scanner.nextInt();

        boolean disponivel = quantidade > 0;

        int idadeLivro = 2026 - anoPublicacao;


        boolean livroAntigo = idadeLivro >= 20;



        System.out.println();
        System.out.println(" === Livro cadastrado ===");
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço:  R$ " + preco);
        System.out.println("Disponível: " + disponivel);
        System.out.println("Nome do autor: " + autor);
        System.out.println("Quantidade de páginas: " + quantidadePaginas);
        System.out.println("Idade do livro: " + idadeLivro + " anos");
        System.out.println("Livro antigo: " + livroAntigo);

    }
}