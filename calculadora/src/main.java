import java.util.Scanner;

public static void main(String[] args) {
    do{
        System.out.println("Digite o número da opção deseja: ");
        System.out.println("|1| Somar: ");
        System.out.println("|2| Subtarir: ");
        System.out.println("|3| Multiplicar: ");
        System.out.println("|4| Dividir: ");
        Scanner opcaoUsuario = new Scanner(System.in);
        int opcao = opcaoUsuario.nextInt();
        if (opcao <= 4 && opcao >= 1){
            System.out.println("Digite o primeiro número: ");
            Scanner primeiroNumero = new Scanner(System.in);
            int num1 = primeiroNumero.nextInt();
            Scanner SegundoNumero = new Scanner(System.in);
            int num2 = SegundoNumero.nextInt();
            
        }



    }
}