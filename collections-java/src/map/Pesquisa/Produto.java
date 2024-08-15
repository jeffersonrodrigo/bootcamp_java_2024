package map.Pesquisa;

public class Produto {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;
  
    public Produto(String nome, double preco, int quantidade) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
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
    public String toString() {
        return String.format(
            "Produto:\n" +
            "  Nome: %s\n" +
            "  Preço: R$%.2f\n" +
            "  Quantidade: %d\n\n",
            nome, preco, quantidade);
    }
  }
