import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        // Configuração
        String caminho = "descodificador-cvs/dados.csv";

        // Abertura segura
        try{
            BufferedReader leitor = new BufferedReader(new FileReader(caminho));
          
          // Processamento - Loop
             String linha;
             while ((linha = leitor.readLine()) != null) { 
         
          // Corte e exibição
            String[] dados = linha.split(",");
            System.out.println("Nome: " + dados[0] + "| Idade: " + dados[1]);
        }
             leitor.close();

        }
        catch (IOException e){
            System.out.println("Erro ao ler o arquivo!");
        }

      
        
    }
}
