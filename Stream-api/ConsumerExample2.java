import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    
    public static void main(String[] args) {
        // Criar uma lista de strings
        List<String> nomes = Arrays.asList("Alice", "Bob", "Carlos");

        // Definir um Consumer para imprimir cada nome em letras maiúsculas
        Consumer<String> imprimirMaiusculo = nome -> { 
            // nome -> {...} - Expressão lambda que será atribuída à variável imprimirMaiusculo
            System.out.println(nome.toUpperCase()); // Imprime o nome em letras maiúsculas
        };

        // Usar o Consumer para aplicar a operação em cada elemento da lista
        nomes.forEach(imprimirMaiusculo); // Passa o Consumer para o método forEach, que aplica a operação em cada nome
    }
}