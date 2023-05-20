import java.util.Scanner;

public class Idade {
     public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        
        int idadeDigitada = 0;
        int somaIdades = 0;
        int contPessoas = 1;
        int quantPessoas = 10;
        double mediaIdades;

        System.out.printf("Por favor, digite a idade de %d pessoas!\n", quantPessoas);
        
        while (contPessoas <= quantPessoas)
        {
            System.out.println("Digite a idade da próxima pessoa: ");
            idadeDigitada = in.nextInt();
            somaIdades += idadeDigitada;
            contPessoas++;
        }
        
        mediaIdades = (double)somaIdades / quantPessoas;
        
        System.out.printf("A média das idades é: %.1f", mediaIdades);
         
        


        


        

    }
}