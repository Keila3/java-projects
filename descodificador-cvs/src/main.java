import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        // Configuração
        String caminho = "dados.csv";

        // Abertura segura
        try{
            BufferedReader leitor = new BufferedReader(new FileReader(caminho));
        }
        catch (IOException e){
            System.out.println("Erro!");
        }

        // Processamentp - Loop

        // Corte e exibição
    }
}
