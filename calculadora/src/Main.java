import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    // Instanciando a classe Calculadora e o Scanner para leitura de dados
    Scanner leitor = new Scanner(System.in);
    Calculadora calc = new Calculadora();
    String continuar;


    do{
        // Exibindo o menu de opções para o usuário
        System.out.println("Digite o número da opção deseja: ");
        System.out.println("|1| Somar: ");
        System.out.println("|2| Subtarir: ");
        System.out.println("|3| Multiplicar: ");
        System.out.println("|4| Dividir: ");
        int opcao = leitor.nextInt(); // Lendo a opção escolhida pelo usuário

        // Verificando se a opção é válida (entre 1 e 4)
        if (opcao <= 4 && opcao >= 1){

            // Solicitando os números para a operação escolhida
           System.out.println("Digite o primeiro número: ");
           double num1 = leitor.nextDouble();

           System.out.println("Digite o segundo número: ");
           double num2 = leitor.nextDouble();

            // Atribuindo os números lidos aos atributos da classe Calculadora
            calc.numero1 = num1;
            calc.numero2 = num2;

            // Realizando a operação escolhida e exibindo o resultado
            switch (opcao) {
                case 1: // Somar
                    System.out.println("O resultado é: " + calc.somar());
                    break;
                case 2: // Subtrair
                    System.out.println("O resultado é: " + calc.subtrair());
                    break;
                case 3: // Multiplicar
                System.out.println("O resultado é: " + calc.multiplicar());
                     break;
                case 4: // Dividir
                    System.out.println("O resultado é: " + calc.dividir());
                    break;
            
                default: // Caso a opção seja inválida (não entre 1 e 4)
                    System.out.println("Erro! opção invalida");
                    break;
            }
            
            
        }

        else {
           System.out.println("Opção inválida!"); // Exibindo mensagem de erro caso a opção seja inválida (não entre 1 e 4)
        }

        // Perguntando ao usuário se deseja continuar realizando operações
        System.out.println("Deseja continuar? [S/N] ");
        continuar = leitor.next().toUpperCase();



    } while (continuar.equals("S")); // O loop continuará enquanto o usuário escolher "S" para continuar
}}