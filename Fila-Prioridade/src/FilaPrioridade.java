import java.util.*;
public class FilaPrioridade {
    private ArrayList<Tarefa> tarefas;

    // Construtor
    public FilaPrioridade(){
        this.tarefas = new ArrayList<>();
    }

    // Método para adicionar uma tarefa à fila de prioridade
    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
        Collections.sort(tarefas);// Ordena as tarefas com base na prioridade
    }

    // Método para remover e retornar a tarefa com maior prioridade
    public Tarefa proximo(){
        if (tarefas.isEmpty()) {
            return null; // Retorna null se a fila estiver vazia
        }
        return tarefas.remove(0); // Remove e retorna a tarefa com maior prioridade (primeira
    }

    // Método para exibir as tarefas na fila de prioridade
    public void exibirTarefas(){
        for (Tarefa t : tarefas){
            System.out.println(t);
        }
    }

}

