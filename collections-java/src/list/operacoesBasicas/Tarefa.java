package list.operacoesBasicas;

public class Tarefa {// Classe que representa uma tarefa com uma descrição

    private String descricao; // Variável de instância que armazena a descrição da tarefa

    public Tarefa(String descricao) { // Construtor da classe Tarefa        // Recebe uma descrição e inicializa a variável de instância
        this.descricao = descricao; // Inicializa a variável de instância 'descricao' com o valor fornecido
    }
    //atalho construtores Ctrl + .
    public String getDescricao() { // Método para obter a descrição da tarefa
        return descricao; // Retorna a descrição da tarefa
    }
    @Override
    public String toString() { // Método para representar a tarefa como uma String
        return descricao; // Retorna a descrição da tarefa como a representação em String da tarefa
    }
}
