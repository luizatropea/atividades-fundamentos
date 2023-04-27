// Luiza Tropea Scaglia - Fundamentos de Programação

import java.util.Scanner;

public class E1 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int adultos;
        int criancas;
        int visitantes;
        int silverAdulto;
        int goldAdulto;
        int silverKids;
        int goldKids;
        double valorTotal;
        int tipoPagamento;
        double valorComDesconto;

        valorTotal = 0;

        System.out.println("Bem-vindo ao parque de diversões. Digite a quantidade de ingressos para adultos: ");
        adultos = in.nextInt();

        System.out.println("Certo! Agora, digite a quantidade de ingressos para crianças: ");
        criancas = in.nextInt();

        if (adultos != 0)
        {
            System.out.println("Quantos ingressos serão Visitantes? (Apenas para adultos)");
            visitantes = in.nextInt();

            System.out.println("Quantos ingressos serão Silver para adultos?");
            silverAdulto = in.nextInt();

            System.out.println("Quantos ingressos serão Gold para adultos?");
            goldAdulto = in.nextInt();

            if (visitantes != 0)
            {
                valorTotal = valorTotal + (visitantes * 35.0);
            }
            if (silverAdulto != 0)
            {
                valorTotal = valorTotal + (silverAdulto * 65.0);
            }
            if (goldAdulto != 0)
            {
                valorTotal = valorTotal + (goldAdulto * 98.0);
            }
        }

        if (criancas != 0)
        {
            System.out.println("Ótimo, estamos quase lá! Quantos ingressos serão Silver para crianças?");
            silverKids = in.nextInt();

            System.out.println("Por fim, quantos ingressos serão Gold para crianças?");
            goldKids = in.nextInt();

            if (silverKids != 0)
            {
                valorTotal = valorTotal + (silverKids * 32.5); 
            }
            if (goldKids != 0)
            {
                valorTotal = valorTotal + (goldKids * 49.0);
            }
               

        }

        System.out.println("Para a forma de pagamento, digite 1 para dinheiro, 2 para PIX e 3 para cartão de crédito: ");
        tipoPagamento = in.nextInt();

        if (tipoPagamento == 1)
        {
            valorComDesconto = valorTotal * (10.0/100.0);

            System.out.printf("Seu valor total sem desconto é: R$%.2f", valorTotal);
            System.out.println();
            System.out.printf("Seu valor com desconto é: R$%.2f", (valorTotal - valorComDesconto));
            System.out.println();
            System.out.printf("Seu valor total a pagar é: R$%.2f", (valorTotal - valorComDesconto));
        }
        

        if (tipoPagamento == 2)
        {
            valorComDesconto = valorTotal * (5.0/100.0);

            System.out.printf("Seu valor total sem desconto é: R$%.2f", valorTotal);
            System.out.println();
            System.out.printf("Seu valor com desconto é: R$%.2f", (valorTotal - valorComDesconto));
            System.out.println();
            System.out.printf("Seu valor total a pagar é: R$%.2f", (valorTotal - valorComDesconto));
        }

        if (tipoPagamento == 3)
        {
            valorComDesconto = valorTotal;
            
            System.out.printf("Seu valor total sem desconto é: R$%.2f", valorTotal);
            System.out.println();
            System.out.printf("Seu valor com desconto é: R$%.2f", (valorTotal - valorComDesconto));
            System.out.println();
            System.out.printf("Seu valor total a pagar é: R$%.2f", (valorTotal - valorComDesconto));
        }
        
        }



    }
