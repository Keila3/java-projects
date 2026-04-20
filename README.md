
```markdown
# Projeto: Gestor de Tarefas com Fila de Prioridade

Este repositório contém um sistema desenvolvido em Java para gerenciamento de tarefas. O diferencial deste sistema é a implementação de uma **Fila de Prioridade**, onde tarefas mais urgentes são movidas automaticamente para o início da fila de execução.

## 📋 Sobre o Projeto

O objetivo deste projeto foi aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)** e manipulação de **Estruturas de Dados** dinâmicas em Java.

Diferente de uma fila comum (FIFO), este sistema utiliza uma lógica de comparação para reordenar os elementos sempre que uma nova tarefa é adicionada.

## 🗂️ Organização dos Arquivos

O projeto é composto por três arquivos principais que trabalham em conjunto:

* **`Tarefa.java`**: A classe base que representa o objeto "Tarefa", contendo nome, prioridade e a regra de comparação.
* **`FilaPrioridade.java`**: A classe responsável por armazenar a lista de tarefas e garantir a organização por prioridade.
* **`Main.java`**: O ponto de entrada do programa, contendo o menu interativo e a lógica de comunicação com o utilizador.

## ⚙️ Requisitos de Execução

* Java Development Kit (JDK) 8 ou superior.
* Terminal ou IDE (VS Code, IntelliJ, Eclipse).

## 🛠️ Tecnologias Utilizadas

* **Java SE**: Linguagem principal.
* **ArrayList**: Para armazenamento dinâmico.
* **Collections.sort**: Para a ordenação automática baseada na interface `Comparable`.
* **Scanner**: Para interatividade via terminal.


---
*Este projeto faz parte do portfólio de estudos em Análise e Desenvolvimento de Sistemas.*
```
