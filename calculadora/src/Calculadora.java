public class Calculadora{
   // Atributos para armazenar os números a serem operados
   double numero1;
   double numero2;

   // Métodos para realizar as operações matemáticas básicas
   public double somar(){
    return numero1 + numero2;
   }

   public double subtrair(){
    return numero1 - numero2;
   }

   public double multiplicar(){
    return numero1 * numero2;
   }

   public double dividir(){
      if (numero2 == 0) {
        System.out.println("Erro: Divisão por zero!");
        return 0; 
    }
    return numero1 / numero2;
   }
}