

public class MinhaBiblioteca

{

    

    public static boolean ehPar (int i)

    {

        return ( i % 2 == 0 );

    }

    

    public static int somaPares (int a, int b)

    {

        int soma = 0;

        

        for (int i = a; i <= b; i++)

        {

            if (  ehPar(i) )

                soma += i;

        }

        

        return soma;

    }

    

    public static int contarDivisores (int val)

    {

        int qtdDivisores = 0;

        

        for (int divisor = 1; divisor <= val; divisor++)

            if (val % divisor == 0)

                qtdDivisores++;

        

        return qtdDivisores;

    }

    

    public static boolean ehPrimo (int val)

    {

        return ( contarDivisores(val) == 2 );

    }

    

    public static int contarPrimos (int a, int b)

    {

        int qtdPrimos = 0;

        

        for (int i = a; i <= b; i++)

        {

            if (  ehPrimo(i) )

                qtdPrimos++;

        }

        

        return qtdPrimos;

    }

    public static void mostrarImpares (int a, int b) {
        for (int i = a; i <= b; i++) 
        {
            if (!ehPar(i))
            {
                System.out.print(i + " ");
            }
            
        }
    }

    


        
    
    

    

    

}

