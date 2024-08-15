package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade)); // cod é a key e o new Produto o value
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0d; // Inicializa o valor total do estoque com 0, usando 'd' para especificar que é um double.
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produto p : estoqueProdutosMap.values()) { 
        valorTotalEstoque += p.getQuantidade() * p.getPreco(); // Calcula o valor total multiplicando a quantidade pelo preço e adiciona ao total.
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null; // Inicializa o produto mais caro como null e o maior preço com o menor valor possível para um double.
    double maiorPreco = Double.MIN_VALUE;
    for (Produto p : estoqueProdutosMap.values()) {
      if (p.getPreco() > maiorPreco) { // Se o preço do produto atual é maior que o maior preço registrado, atualiza o produto mais caro e o maior preço.
        produtoMaisCaro = p;
        maiorPreco = p.getPreco();
      }
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null; // Inicializa o produto mais barato como null e o menor preço com o maior valor possível para um double.
    double menorPreco = Double.MAX_VALUE;
    for (Produto p : estoqueProdutosMap.values()) {
      if (p.getPreco() < menorPreco) { // Se o preço do produto atual é menor que o menor preço registrado, atualiza o produto mais barato e o menor preço.
        produtoMaisBarato = p;
        menorPreco = p.getPreco();
      }
    }
    return produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorQuantidadeValorNoEstoque = null; // Inicializa o produto com o maior valor total no estoque como null e o maior valor total como 0.
    double maiorValorTotalProdutoEstoque = 0d;

    if (!estoqueProdutosMap.isEmpty()) {
      for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade(); // Calcula o valor total do produto em estoque (preço * quantidade). 
        
        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) { // Se o valor total do produto atual é maior que o maior valor registrado, atualiza o produto e o maior valor.
          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
        }
      }
    }
    return produtoMaiorQuantidadeValorNoEstoque;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();

    // Exibe o estoque vazio
    estoque.exibirProdutos();

    // Adiciona produtos ao estoque
    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

    // Exibe os produtos no estoque
    estoque.exibirProdutos();

    // Calcula e exibe o valor total do estoque
    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

    // Obtém e exibe o produto mais caro
    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
    System.out.println("Produto mais caro: " + produtoMaisCaro);

    // Obtém e exibe o produto mais barato
    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
    System.out.println("Produto mais barato: " + produtoMaisBarato);

    // Obtém e exibe o produto com a maior quantidade em valor no estoque
    Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
  }
}