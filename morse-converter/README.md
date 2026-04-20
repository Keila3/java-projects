# Tradutor de Código Morse

Programa simples em Java que converte texto para Código Morse a partir da entrada no terminal. O projeto foi criado para prática de lógica de programação, strings e estruturas de dados.

## Funcionalidades

- Recebe uma frase via terminal
- Converte cada letra para o código Morse correspondente
- Substitui espaços entre palavras pelo símbolo `|`
- Ignora diferenças entre maiúsculas e minúsculas

## Requisitos

- Java Development Kit (JDK) instalado
- Terminal aberto na pasta do projeto

## Como executar

1. Abra o terminal dentro da pasta `morse-converter`.
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
morse-converter/
├── README.md
└── src/
    └── Main.java
```

## Observações

- O projeto usa `HashMap` para armazenar a tradução dos caracteres.
- A entrada é lida pelo terminal com `Scanner`.