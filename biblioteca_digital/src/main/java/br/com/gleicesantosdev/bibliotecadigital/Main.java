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

        boolean disponivel = quantidade > 0;

        int idadeLivro = 2026 - anoPublicacao;

        String classificacao;

        boolean usuarioAtivo = true;

        if (disponivel){
            System.out.println("Livro disponível para empréstimo");
        } else {
            System.out.println("livro indisponível para empréstimo" );
        }

        if (idadeLivro >= 50) {
            classificacao = "Clássico";
        } else if (idadeLivro >= 20) {
            classificacao = "Antigo";
        } else {
            classificacao = "Recente";
        }

        if (usuarioAtivo && disponivel) {
            System.out.println("Empréstimo permitido.");
        } else {
            System.out.println("Empréstimo não permitido.");
        }


        System.out.println();
        System.out.println("=== MENU ===");
        System.out.println("1 - Consultar informações");
        System.out.println("2 - Verificar disponibilidade");
        System.out.println("3 - Ver classificação do livro");

        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();


        switch (opcao) {
          case 1:
                System.out.println("=== INFORMAÇÕES DO LIVRO === ");
                System.out.println("Título: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Ano: " + anoPublicacao);
                System.out.println("Preço: R$ " + preco);
                System.out.println("Quantidade de páginas: " + quantidadePaginas);
              break;

            case 2:
                if(disponivel) {
                    System.out.println(" O livro está disponível para empréstimo.");
                } else {
                    System.out.println("O livro está indisponível para empréstimo");
                }
                break;

            case 3:
                System.out.println("Classificação: " + classificacao);
                break;

            default:
                System.out.println("Opção inválida.");
        }


        System.out.println();
        System.out.println(" === Livro cadastrado ===");
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Disponível: " + disponivel);
        System.out.println("Nome do autor: " + autor);
        System.out.println("Quantidade de páginas: " + quantidadePaginas);
        System.out.println("Idade do livro: " + idadeLivro + " anos");
        System.out.println("o livro está disponível para empréstimo? " + disponivel);
        System.out.println("Usuário ativo: " + usuarioAtivo);
        System.out.println("Empréstimo permitido: " + (usuarioAtivo && disponivel));

        scanner.close();




    }
}