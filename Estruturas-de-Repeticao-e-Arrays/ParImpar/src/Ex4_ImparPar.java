import java.util.Scanner;

public class Ex4_ImparPar {
/*
 * FAÇA UM PROGRAMA QUE PEÇA N NUMEROS INTEIROS, CALCULE E MOSTRE A QUANTIDADE DE NÚMEROS PARES E A QUANTIDADE DE NUMEROS IMPARES.
 */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

      int quantNumeros; 
      int numero;
      int quantPares = 0, quantImpares = 0;

      System.out.println("quantidade de números: ");
      quantNumeros = scan.nextInt();

      int count = 0;
      do{
        System.out.println("Número: ");
        numero = scan.nextInt();

        if(numero % 2 == 0) quantImpares ++;
        else quantImpares ++;

        count++;
      }while(count < quantNumeros);

      System.out.println("Quantidade de Par: "+ quantPares);
      System.out.println("Quantidade de Impar: "+ quantImpares);
    }
}
