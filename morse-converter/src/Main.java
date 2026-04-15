import java.util.Scanner;
import java.util.HashMap;


public class Main{
    public static void main(String[] args){
    // Dicionário
      // HashMap
      HashMap<Character, String> morse = new HashMap<>();
        morse.put('A', ".-");
        morse.put('B', "-...");
        morse.put('C', "-.-.");
        morse.put('D', "-..");
        morse.put('E', ".");
        morse.put('F', "..-.");
        morse.put('G', "--.");
        morse.put('H', "....");
        morse.put('I', "..");
        morse.put('J', ".---");
        morse.put('K', "-.-");
        morse.put('L', ".-..");
        morse.put('M', "--");
        morse.put('N', "-.");
        morse.put('O', "---");
        morse.put('P', ".--.");
        morse.put('Q', "--.-");
        morse.put('R', ".-.");
        morse.put('S', "...");
        morse.put('T', "-");
        morse.put('U', "..-");
        morse.put('V', "...-");
        morse.put('W', ".--");
        morse.put('X', "-..-");
        morse.put('Y', "-.--");
        morse.put('Z', "--..");
        
    // Entrada
    Scanner leitor = new Scanner (System.in);
    System.out.println("Digite a frase para traduzir: ");
    String frase = leitor.nextLine();

    //Conversão
    String resultado = "";
    for (int i = 0; i < frase.length(); i++) {
    char letra = frase.charAt(i);
    
    if (letra == ' ') {
        resultado = resultado + "| ";
    } else {
        String codigo = morse.get(Character.toUpperCase(letra));
        resultado = resultado + codigo + " ";} 
    }
    System.out.println(resultado);
    } 
}