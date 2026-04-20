# Calculadora em Java

Calculadora simples em Java executada no terminal. O programa realiza operações básicas entre dois números: soma, subtração, multiplicação e divisão.

## Funcionalidades

- Soma de dois números
- Subtração de dois números
- Multiplicação de dois números
- Divisão de dois números
- Execução contínua sem precisar reiniciar o programa

## Requisitos

- Java Development Kit (JDK) instalado
- Terminal aberto na pasta do projeto

## Como executar

1. Abra o terminal dentro da pasta `calculadora`.
2. Compile os arquivos Java:

```bash
javac src/*.java
```

3. Execute o programa:

```bash
java -cp src Main
```

## Como usar

Ao iniciar, o programa exibe um menu com as opções:

- `1` para somar
- `2` para subtrair
- `3` para multiplicar
- `4` para dividir

Depois de escolher a operação, informe os dois números desejados. Ao final do cálculo, o sistema pergunta se você deseja continuar.

## Estrutura do projeto

```text
calculadora/
├── README.md
└── src/
    ├── Calculadora.java
    └── Main.java
```

## Observações

- A divisão por zero é tratada com uma mensagem de erro.
- O programa usa entrada via `Scanner`, então as informações devem ser digitadas no terminal.
