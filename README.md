# Java Projects

Este repositório reúne pequenos projetos em Java desenvolvidos para prática de lógica, manipulação de strings, estruturas de dados e leitura de arquivos. Cada pasta contém um exercício independente, com seu próprio código e instruções específicas.

## Projetos

### [Descodificador de CSV](descodificador-cvs/README.md)
Lê um arquivo CSV e apresenta os dados no terminal, com foco em leitura de arquivos, tratamento de exceções e processamento de texto.

### [Fila de Prioridade](Fila-Prioridade/README.md)
Implementa uma fila de tarefas ordenada por prioridade, usando orientação a objetos, `ArrayList` e `Comparable`.

### [Tradutor Morse](morse-converter/README.md)
Converte texto para código Morse a partir da entrada do terminal, explorando estruturas condicionais, laços e `HashMap`.

## Estrutura do repositório

```text
.
├── README.md
├── descodificador-cvs/
│   ├── dados.csv
│   ├── README.md
│   └── src/
│       └── Main.java
├── Fila-Prioridade/
│   ├── README.md
│   └── src/
│       ├── FilaPrioridade.java
│       ├── Main.java
│       └── Tarefa.java
└── morse-converter/
	├── README.md
	└── src/
		└── Main.java
```

## Requisitos

- Java Development Kit (JDK) instalado
- Terminal acessível no diretório do projeto desejado

## Como executar

Cada projeto deve ser executado a partir da sua própria pasta. Em geral, os comandos seguem este padrão:

```bash
javac src/*.java
java -cp src Main
```

No caso do projeto de CSV, mantenha o arquivo `dados.csv` dentro da pasta do projeto para que a leitura funcione corretamente.

## Observações

- Os READMEs individuais trazem instruções mais detalhadas de cada exercício.
- O repositório está organizado como uma coleção de estudos, então cada projeto pode ser compilado e executado de forma independente.
