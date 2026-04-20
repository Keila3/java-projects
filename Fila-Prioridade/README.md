# Fila de Prioridade em Java

Projeto em Java que organiza tarefas por nível de prioridade. A ordem de execução não depende apenas da chegada, mas do valor atribuído a cada tarefa.

## Funcionalidades

- Adicionar tarefas com nome e prioridade
- Ordenar automaticamente as tarefas pela prioridade
- Remover a próxima tarefa da fila
- Exibir todas as tarefas pendentes na ordem de execução

## Requisitos

- Java Development Kit (JDK) instalado
- Terminal aberto na pasta do projeto

## Como executar

1. Abra o terminal dentro da pasta `Fila-Prioridade`.
2. Compile os arquivos Java:

```bash
javac src/*.java
```

3. Execute o programa:

```bash
java -cp src Main
```

## Estrutura do projeto

```text
Fila-Prioridade/
├── README.md
└── src/
    ├── FilaPrioridade.java
    ├── Main.java
    └── Tarefa.java
```

## Observações

- O projeto usa orientação a objetos, `ArrayList` e `Comparable`.
- A interface é feita via terminal com `Scanner`.

