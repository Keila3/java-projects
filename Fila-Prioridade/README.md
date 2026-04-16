# Sistema de Fila de Prioridades em Java

Este projeto implementa uma lista de tarefas onde a ordem de execução não é definida apenas pela ordem de chegada, mas pelo nível de importância (prioridade) atribuído a cada tarefa.

## 🚀 Funcionalidades

* **Adicionar Tarefa:** Cria uma tarefa com nome e nível de prioridade (ex: 1 a 5).
* **Ordenação Automática:** Utiliza a interface `Comparable` para garantir que tarefas com maior prioridade fiquem no topo da fila.
* **Remover Próxima:** Retira e exibe a tarefa mais importante da fila.
* **Exibição Completa:** Lista todas as tarefas pendentes na ordem em que serão executadas.

## 🛠️ Estrutura do Código

O sistema é dividido em três classes principais:

1.  **Tarefa.java:** Define o objeto tarefa, seus atributos e a lógica de comparação (`compareTo`).
2.  **FilaPrioridade.java:** Gerencia o `ArrayList` de tarefas, lidando com a inserção, ordenação e remoção.
3.  **Main.java:** Interface via terminal que interage com o usuário através de um menu dinâmico.

## 💻 Como Executar

1.  Certifique-se de ter o **JDK** instalado em sua máquina.
2.  Compile os arquivos:
    ```bash
    javac Tarefa.java FilaPrioridade.java Main.java
    ```
3.  Execute a classe principal:
    ```bash
    java Main
    ```

## 🧠 Conceitos Aplicados

* **Orientação a Objetos:** Encapsulamento, construtores e métodos.
* **Collections API:** Uso de `ArrayList` e `Collections.sort()`.
* **Interface Comparable:** Sobrescrita do método `compareTo` para lógica de ordenação personalizada.
* **Entrada de Dados:** Manipulação de fluxo com a classe `Scanner`.

