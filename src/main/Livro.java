package main;

public class Livro {

    private String nome;
    private int ano;
    private int avaliacao;

    public Livro(String nome, int ano, int avaliacao) {
        this.nome = nome;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}
