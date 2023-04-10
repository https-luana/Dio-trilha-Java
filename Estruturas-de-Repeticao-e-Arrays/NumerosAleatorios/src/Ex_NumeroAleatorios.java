import java.util.Random;

public class Ex_NumeroAleatorios {
    public static void main(String[] args) throws Exception {
      Random random = new Random(); 

      int[] NumeroAleatorios = new int[20];

      for(int i = 0; i < NumeroAleatorios.length; i++){
      int numero = random.nextInt(100);
      NumeroAleatorios[i] = numero;
     }
     System.out.print("Numeros aleatorios");
     for(int numero: NumeroAleatorios){
        System.out.print(numero + " ");
     }
     System.out.print("\nAntecessor dos Numeros aleatorios");
     for(int numero: NumeroAleatorios){
        System.out.print((numero-1) + " ");
     }
     System.out.print("\nSucessores dos Numeros aleatorios");
     for(int numero: NumeroAleatorios){
        System.out.print((numero+1) + " ");
    }

  }
}