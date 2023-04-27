import java.util.Scanner;

public class App {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        String palavra;
        String contrario = "";

        System.out.println("Digite sua palavra: ");
        palavra = in.nextLine().toUpperCase();

        in.close();
        
        for(int tamanho = palavra.length(); tamanho > 0; tamanho--)
        {
            contrario += palavra.charAt(tamanho -1);

        }

        contrario.toUpperCase();

        if (palavra.equals(contrario))
            {
                System.out.println("Sim, é um palíndromo.");
            }
            else
            {
                System.out.println("Não é um palíndromo.");
            }


    }
}