package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  //atributo
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoas() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorIdade); // Ordena a nova lista de pessoas (pessoasPorIdade) usando a ordem natural definida pela classe Pessoa
      return pessoasPorIdade;
    } else {
      throw new RuntimeException("A lista está vazia!"); // Se a lista original estiver vazia, lança uma exceção com uma mensagem específica
    }
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); // Ordena a nova lista de pessoas (pessoasPorAltura) usando um comparador personalizado para altura
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!"); // Se a lista original estiver vazia, lança uma exceção com uma mensagem específica
    }
  }

  public static void main(String[] args) {
  // Criando uma instância da classe OrdenacaoPessoas
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    // Adicionando pessoas à lista
    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

    // Exibindo a lista de pessoas adicionadas
    System.out.println(ordenacaoPessoas.pessoaList);

    // Ordenando e exibindo por idade
    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    // Ordenando e exibindo por altura
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}