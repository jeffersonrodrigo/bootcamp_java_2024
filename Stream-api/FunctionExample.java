import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    Function<Integer, Integer> dobrar = numero -> numero * 2; // numero -> numero * 2 - Expressão lambda

    List<Integer> numerosDobrados = numeros.stream() // Convertendo a lista para um Stream
        .map(n -> n * 2) // n -> n * 2 - Expressão lambda usada no método map para aplicar a função de dobrar em cada elemento
        .toList(); // Converte o Stream em uma nova lista

    // Imprimir a lista de números dobrados
    numerosDobrados.forEach(System.out::println); // System.out::println -> Method Reference
  }
}