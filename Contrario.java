import java.util.Scanner;

public class Contrario {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        String palavra;
        String contrario = "";

        System.out.println("Digite sua palavra: ");
        palavra = in.nextLine().toUpperCase();

        in.close();
        
        for(int tamanho = palavra.length() -1; tamanho >= 0; tamanho--)
        {
            contrario += palavra.charAt(tamanho);

        }

        contrario.toUpperCase();

        System.out.println(contrario);
 
    }
}