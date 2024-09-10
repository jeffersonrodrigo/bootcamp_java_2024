import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
      // Criar uma lista de números inteiros
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5); // Lista de inteiros
  
      // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
      BinaryOperator<Integer> somar = Integer::sum; // Integer::sum -> Referência ao método estático sum para somar dois inteiros
  
      // Usar o BinaryOperator para somar todos os números no Stream
      int resultado = numeros.stream() // Convertendo a lista para um Stream
          .reduce(0, Integer::sum); // Integer::sum -> Referência ao método sum aplicada em cada par de elementos para reduzir a um único valor
  
      // Imprimir o resultado da soma
      System.out.println("A soma dos números é: " + resultado); // Exibe o resultado da soma
    }
  }
  