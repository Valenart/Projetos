
package calculadora_python_java;

import java.util.Scanner;

public class CALCULADORA_PYTHON_JAVA {

    public static void main(String[] args) {
        
        //PARA AS ENTRADAS
            int soma = 1;
            int subtracao = 2;
            int multiplicacao = 3;
            int divisao = 4; 
            int resultadoDaEscolha = 0;

        //VÁRIAVEIS PARA AS CONTAS
            double var1 = 0;
            double var2 = 0;
            double resultado = 0;
        
            
        // SCANNER
        
            Scanner entrada = new Scanner(System.in);
        
        System.out.println("==========TESTE DE CALULADORA JAVA==========");
        
            System.out.println("DIGITE O NUMERO CORRESPONDENTE PARA O TIPO DA"
                    + " A CONTA: "
                + System.lineSeparator() + "1- SOMA"
                + System.lineSeparator() + "2- SUBTRACAO"
                + System.lineSeparator() + "3- MULTIPLICACAO"
                + System.lineSeparator() + "4- DIVISAO");
            System.out.println(" ");
            
            resultadoDaEscolha = entrada.nextInt();    
                    
            switch (resultadoDaEscolha) {
                case 1:
            
               System.out.println("Qual e o primeiro numero da soma? ");
               var1 = entrada.nextDouble();
               
               System.out.println("Qual e o segundo numero da soma? ");
               var2 = entrada.nextDouble();
               
                resultado = var1 + var2; 
               System.out.println("O resultado da soma sera de " +
                       resultado);               
           
           
            case 2:
               System.out.println("Qual e o primeiro numero da subtracao? ");
               var1 = entrada.nextDouble();
               
               System.out.println("Qual e o segundo numero da subtracao? ");
               var2 = entrada.nextDouble();
               
               resultado = var1 - var2; 
               System.out.println("O resultado da subtracao sera de " +
                       resultado);
            break;
                    
            case 3: 
               System.out.println("Qual e o primeiro numero da "
                       + "multiplicacao? ");
               var1 = entrada.nextDouble();
               
               System.out.println("Qual e o segundo numero da "
                       + "multiplicacao? ");
               var2 = entrada.nextDouble();
               
               resultado = var1 * var2; 
               System.out.println("O resultado da multiplicacao sera de " +
                       resultado);
            break;
                    
            case 4 :
                System.out.println("Qual e o primeiro numero da divisao? ");
                var1 = entrada.nextDouble();
               
                System.out.println("Qual e o segundo numero da divisao? ");
                var2 = entrada.nextDouble();
               
                resultado = var1 / var2; 
                System.out.println("O resultado da divisao sera de " +
                       resultado);                                    
                    
                    
            default: 
                System.out.println("Algo de errado não está certo!");
    }
        
    }
    
}
