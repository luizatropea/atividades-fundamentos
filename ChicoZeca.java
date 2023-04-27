public class ChicoZeca
 {
     public static void main (String args[])
     {
         double alturaChico = 1.5;
         double alturaZeca = 1.1;
         int anos = 0;
         
        double taxaCrescimentoChico = 0.02;   
        double taxaCrescimentoZeca = 0.03;    
         
         while (alturaZeca <= alturaChico)
         {
             alturaChico += taxaCrescimentoChico;
             alturaZeca += taxaCrescimentoZeca;
             anos++;
             
             System.out.println("Ano " + anos + " => Chico=" + alturaChico + ", Zeca=" + alturaZeca);
         }        
         
         System.out.println("Serão necessários " + anos + " anos.");
         
     }
 }
 