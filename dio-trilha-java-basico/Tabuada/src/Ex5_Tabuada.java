import java.util.Scanner;

public class Ex5_Tabuada {

/*
Desenvolva um geradorde tabuada, capaz de gerar a tabuada de qulquer número inteiro entre 1 a 10.
o usuario deve informar de qual numero ele deseja ver a tabuada.
a saída deve ser conforme o exemplo abaixo:
*/    
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

       System.out.println("Tabuada: ");
       int tabuada = scan.nextInt();

       System.out.println("Tabuada de: " + tabuada);

       for(int i = 1; i <= 10; i = i + 1){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
       }

    }
}
