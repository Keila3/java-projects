# Descodificador de CSV

Programa em Java que lê um arquivo CSV e apresenta os dados no terminal. O projeto foi criado para prática de leitura de arquivos, tratamento de exceções e processamento de texto.

## Funcionalidades

- Leitura automática do arquivo `dados.csv`
- Separação dos dados usando vírgula como delimitador
- Tratamento de erros de leitura
- Remoção de espaços desnecessários nos campos lidos

## Requisitos

- Java Development Kit (JDK) instalado
- Terminal aberto na pasta do projeto
- Arquivo `dados.csv` dentro da pasta do projeto

## Como executar

1. Abra o terminal dentro da pasta `descodificador-cvs`.
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
descodificador-cvs/
├── dados.csv
├── README.md
└── src/
    └── Main.java
```

## Observações

- O arquivo `dados.csv` precisa permanecer na pasta do projeto para que a leitura funcione corretamente.
- O programa lê e exibe os dados diretamente no terminal.