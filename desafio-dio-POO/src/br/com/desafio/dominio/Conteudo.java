package br.com.desafio.dominio;

public abstract class Conteudo {
    //atributos
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    //Método
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}