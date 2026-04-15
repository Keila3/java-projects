

public class Tarefa implements Comparable<Tarefa>{
    public String nome;
    public int prioridade;

    // Construtor
    public Tarefa(String nome, int prioridade){
        this.nome = nome;
        this.prioridade = prioridade;

    }
    // Getters
    public String getNome(){
        return nome;
    }
    public int getPrioridade(){
        return prioridade;
    }

    // Método para comparar tarefas com base na prioridade
    public int compareTo(Tarefa outraTarefa){
        return outraTarefa.prioridade - this.prioridade; // Ordem decrescente de prioridade
    }
    // Método para exibir a tarefa
    public String toString(){
        return "Tarefa: " + "Nome: " + nome + " | Prioridade: " + prioridade;
    }


}
