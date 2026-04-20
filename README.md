# Java Projects

Repositório com pequenos projetos em Java para prática de lógica, leitura de arquivos, estruturas de dados e entrada de dados via terminal. Cada pasta contém um exercício independente, com código e instruções próprias.

## Projetos

- [Descodificador de CSV](descodificador-cvs/README.md): lê um arquivo CSV e exibe os dados no terminal.
- [Calculadora](calculadora/README.md): calcula soma, subtração, multiplicação e divisão no terminal.
- [Fila de Prioridade](Fila-Prioridade/README.md): organiza tarefas por prioridade usando orientação a objetos.
- [Tradutor Morse](morse-converter/README.md): converte texto para código Morse a partir da entrada do terminal.

## Estrutura do repositório

```text
.
├── README.md
├── calculadora/
│   ├── README.md
│   └── src/
│       ├── Calculadora.java
│       └── Main.java
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
- Terminal aberto na pasta do projeto desejado

## Como executar

Em geral, cada projeto pode ser executado a partir da sua própria pasta com os comandos abaixo:

```bash
javac src/*.java
java -cp src Main
```

No projeto de CSV, mantenha o arquivo `dados.csv` dentro da pasta do projeto para que a leitura funcione corretamente.

## Observações

- Os READMEs individuais trazem detalhes específicos de cada exercício.
- O repositório está organizado como uma coleção de estudos, então cada projeto pode ser compilado e executado de forma independente.

---

*Este projeto faz parte do portfólio de estudos em Análise e Desenvolvimento de Sistemas.*
