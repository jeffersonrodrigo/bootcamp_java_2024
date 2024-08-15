package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    //atributos
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public long getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public int hashCode() {
        // Calcula o código hash para o produto
        final int prime = 31; // Fator primo para melhorar a distribuição dos códigos hash
        int result = 1; // Valor inicial do código hash
        result = prime * result + (int) (codigo ^ (codigo >>> 32)); // Calcula o código hash usando o código do produto
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica se dois produtos são iguais com base no código do produto
        if (this == obj) // Verifica se a referência é a mesma
            return true;
        if (obj == null) // Verifica se o objeto é nulo
            return false;
        if (getClass() != obj.getClass()) // Verifica se as classes são diferentes
            return false;
        Produto other = (Produto) obj; // Converte o objeto para a classe Produto
        if (codigo != other.codigo) // Compara os códigos dos produtos
            return false;
        return true; // Os produtos são iguais se o código é o mesmo
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int compareTo(Produto o) { // Compara dois produtos pelo nome (para ordenação natural)
        return nome.compareToIgnoreCase(o.getNome());
    }      
}

class ComparatorPorPreco implements Comparator<Produto> { // Classe interna que define um comparador para produtos baseado no preço

    @Override
    public int compare(Produto o1, Produto o2) { // Compara dois produtos pelo preço
        return Double.compare(o1.getPreco(), o2.getPreco()); // Ordena os produtos por preço
    }

}