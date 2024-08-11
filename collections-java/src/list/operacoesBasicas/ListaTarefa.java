package list.operacoesBasicas;

import java.util.ArrayList; // Importa a classe ArrayList, que é uma implementação da interface List
import java.util.List; // Importa a interface List

public class ListaTarefa {
    
    private List<Tarefa> tarefaList; // Variável de instância que armazena a lista de tarefas

    // Construtor da classe ListaTarefa
    public ListaTarefa() { // Inicializa a lista de tarefas como uma nova ArrayList
        this.tarefaList = new ArrayList<>(); // Cria uma nova ArrayList para armazenar as tarefas
    }

    public void adicionarTarefa(String descricao) { // Adiciona uma nova tarefa à lista        // Recebe a descrição da tarefa como parâmetro
        tarefaList.add(new Tarefa(descricao)); // Cria uma nova tarefa com a descrição fornecida e a adiciona à lista de tarefas
      }
    
      public void removerTarefa(String descricao) { // Remove tarefas com uma descrição específica da lista        // Recebe a descrição da tarefa a ser removida como parâmetro
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); // Cria uma nova lista para armazenar as tarefas que devem ser removidas

        if (!tarefaList.isEmpty()) {// Verifica se a lista de tarefas não está vazia
          for (Tarefa t : tarefaList) { // Itera sobre a lista de tarefas (for each)

            if (t.getDescricao().equalsIgnoreCase(descricao)) {// Se a descrição da tarefa atual corresponder à descrição fornecida, adiciona à lista de remoção
              tarefasParaRemover.add(t);
            }
          }
          tarefaList.removeAll(tarefasParaRemover); // Remove todas as tarefas da lista de tarefas que estão na lista de remoção
        } else {
          System.out.println("A lista está vazia!"); // Caso a lista de tarefas esteja vazia, exibe uma mensagem informando isso
        }
      }

      public int obterNumeroTotalTarefas() {
        return tarefaList.size();
      }
    
      public void obterDescricoesTarefas() {

          System.out.println(tarefaList);
        
      }

      public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
      }
}
