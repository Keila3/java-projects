import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Calculadora calc = new Calculadora();
    String continuar;


    do{
        System.out.println("Digite o número da opção deseja: ");
        System.out.println("|1| Somar: ");
        System.out.println("|2| Subtarir: ");
        System.out.println("|3| Multiplicar: ");
        System.out.println("|4| Dividir: ");
        int opcao = leitor.nextInt();
        if (opcao <= 4 && opcao >= 1){
           System.out.println("Digite o primeiro número: ");
           double num1 = leitor.nextDouble();

           System.out.println("Digite o segundo número: ");
           double num2 = leitor.nextDouble();

            calc.numero1 = num1;
            calc.numero2 = num2;

            switch (opcao) {
                case 1:
                    System.out.println("O resultado é: " + calc.somar());
                    break;
                case 2:
                    System.out.println("O resultado é: " + calc.subtrair());
                    break;
                case 3: 
                System.out.println("O resultado é: " + calc.multiplicar());
                     break;
                case 4:
                    System.out.println("O resultado é: " + calc.dividir());
                    break;
            
                default:
                    System.out.println("Erro! opção invalida");
                    break;
            }
            
            
        }

        else {
           System.out.println("Opção inválida!");
        }

        System.out.println("Deseja continuar? [S/N] ");
        continuar = leitor.next().toUpperCase();



    } while (continuar.equals("S"));
}}