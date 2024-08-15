package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet; // Atributo que armazena um conjunto de produto

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        // Cria um TreeSet para armazenar produtos e ordená-los pelo nome
        // O TreeSet usa o método compareTo da classe Produto para ordenar os produtos
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // TreeSet usa Comparable definido em Produto
        if (!produtoSet.isEmpty()) {
            return produtosPorNome;
          } else {
            throw new RuntimeException("O conjunto está vazio!");
          }
        }

    public Set<Produto> exibirProdutosPorPreco() {
        // Cria um TreeSet para armazenar produtos e ordená-los por preço
        // O TreeSet usa o Comparator definido na classe ComparatorPorPreco para ordenar os produtos
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco()); // TreeSet usa Comparator definido em ComparatorPorPreco
        if (!produtoSet.isEmpty()) {
            produtosPorPreco.addAll(produtoSet); // Adiciona todos os produtos ao TreeSet
            return produtosPorPreco;
          } else {
            throw new RuntimeException("O conjunto está vazio!");
          }
        }

        public static void main(String[] args) {
            // Criando uma instância do CadastroProdutos
            CadastroProdutos cadastroProdutos = new CadastroProdutos();
        
            // Adicionando produtos ao cadastro
            cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
            cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
            cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
            cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
        
            // Exibindo todos os produtos no cadastro
            System.out.println(cadastroProdutos.produtoSet);
        
            // Exibindo produtos ordenados por nome
            System.out.println(cadastroProdutos.exibirProdutosPorNome());
        
            // Exibindo produtos ordenados por preço
            System.out.println(cadastroProdutos.exibirProdutosPorPreco());
          }
        }