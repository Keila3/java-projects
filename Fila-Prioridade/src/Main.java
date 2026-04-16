import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilaPrioridade minhaFila = new FilaPrioridade();

        // Entrada de dados para as tarefas
        Scanner entrada = new Scanner(System.in);
        while (true) {
            // Exibe o menu para o usuário
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Ver Próxima Tarefa");
            System.out.println("3. Exibir Tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção do usuário
            int opcao = entrada.nextInt();
            entrada.nextLine();// Para limpar o Enter

            // Processa a opção escolhida
            switch (opcao) {
                case 1:
                    // Pergunta os dados 
                    System.out.println("Nome da tarefa:");
                    String nome = entrada.nextLine();
                    System.out.println("Prioridade (1-5):");
                    int prioridade = entrada.nextInt();

                    // Cria a tarefa e adiciona à fila
                    Tarefa novaTarefa = new Tarefa(nome, prioridade);
                    minhaFila.adicionarTarefa(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    Tarefa proximaTarefa = minhaFila.proximo(); 
                    if (proximaTarefa != null) {
                        System.out.println("Próxima tarefa: " + proximaTarefa);
                    } else {
                        System.out.println("A fila de prioridade está vazia.");
                    }
                    break;

                case 3:
                        System.out.println("Tarefas na fila de prioridade:");
                        minhaFila.exibirTarefas();
                    
                    break;

                case 4:
                    System.out.println("Saindo...");
                    entrada.close();
                    return;
    
                default:
                    System.out.println("Opção inválida!");
                    break;
            
           
        }
    }
}
}
