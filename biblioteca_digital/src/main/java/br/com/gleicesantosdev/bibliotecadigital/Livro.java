package br.com.gleicesantosdev.bibliotecadigital;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantidade;
    private double preco;
    private int quantidadePaginas;

    public Livro(
            String titulo,
            String autor,
            int anoPublicacao,
            int quantidade,
            double preco,
            int quantidadePaginas
    ) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return getAnoPublicacao();
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }


    public boolean estaDisponivel(){
        return quantidade >0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public String calcularClassificacao() {
        int idadeLivro = 2026 - anoPublicacao;

        if (idadeLivro >= 50) {
            return "Clássico";
        } else if (idadeLivro >= 20) {
            return "Antigo";
        } else {
            return "Recente";
        }

    }

}


