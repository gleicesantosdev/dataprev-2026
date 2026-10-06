package br.com.gleicesantosdev.bibliotecadigital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Biblioteca Digital ===");

        System.out.print("Digite o nome do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = scanner.nextInt();

        System.out.print("Digite a quantidade disponível: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço do livro: ");
        double preco = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();

        System.out.print("Quantidade de páginas: ");
        int quantidadePaginas = scanner.nextInt();

        Livro livro = new Livro(
                titulo,
                autor,
                anoPublicacao,
                quantidade,
                preco,
                quantidadePaginas
        );

        boolean disponivel = livro.estaDisponivel();

        String classificacao = livro.calcularClassificacao();

        boolean usuarioAtivo = true;

        if (disponivel) {
            System.out.println("Livro disponível para empréstimo");
        } else {
            System.out.println("Livro indisponível para empréstimo");
        }

        if (usuarioAtivo && disponivel) {
            System.out.println("Empréstimo permitido.");
        } else {
            System.out.println("Empréstimo não permitido.");
        }

        int opcao;

        do {

            exibirMenu();

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    mostrarInformacoes(livro);
                    break;

                case 2:
                    verificarDisponibilidade(disponivel);
                    break;

                case 3:
                    System.out.println("Classificação: " + classificacao);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        String[] livros = new String[3];

        scanner.nextLine();

        for (int i = 0; i < livros.length; i++) {
            System.out.print("Digite o título do livro " + (i + 1) + ": ");
            livros[i] = scanner.nextLine();
        }

        System.out.println("=== LISTAR LIVROS CADASTRADOS ===");

        for (int i = 0; i < livros.length; i++) {
            System.out.println((i + 1) + " - " + livros[i]);
        }

        scanner.close();
    }


    public static void exibirMenu() {

        System.out.println();
        System.out.println("=== MENU ===");
        System.out.println("1 - Consultar informações");
        System.out.println("2 - Verificar disponibilidade");
        System.out.println("3 - Ver classificação do livro");
        System.out.println("0 - Sair");
    }


    public static void verificarDisponibilidade(boolean disponivel) {

        if (disponivel) {
            System.out.println("O livro está disponível para empréstimo.");
        } else {
            System.out.println("O livro está indisponível para empréstimo.");
        }
    }


    public static void mostrarInformacoes(Livro livro) {
        System.out.println("=== INFORMAÇÕES DO LIVRO ===");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano: " + livro.getAnoPublicacao());
        System.out.println("Preço: R$ " + livro.getPreco());
        System.out.println("Quantidade de páginas: " + livro.getQuantidadePaginas());
    }
}