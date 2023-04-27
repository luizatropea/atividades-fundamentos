import java.util.Scanner;

public class NumerosPrimos {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int numero;
        int qntdDivisor = 0;

        System.out.println("Digite seu número: ");
        numero = in.nextInt();

        in.close();
        

        for (int divisor = 1; divisor <= numero; divisor++)
        {
            if ((numero % divisor == 0))
            {
                qntdDivisor++;
            }
        }

        if (qntdDivisor == 2)
        {
            System.out.println("É um número primo."); //
        }
        else
        {
            System.out.println("Não é um número primo.");
        }
    
    
    }
}