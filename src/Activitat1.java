import java.util.Scanner;

public class Activitat1 {
    static final Scanner teclado     = new Scanner(System.in);
    static final int     NUM_NUMEROS = 10;
    public static void main(String[] args) {
        int[] numeros = new int[NUM_NUMEROS];
        for ( int i = 0; i < numeros.length; i++ ) {
            System.out.print("Introduce " + (i+1) + " : ");
            numeros[i] = teclado.nextInt();
        }
        for ( int i = 0; i < numeros.length; i++ ) {
            System.out.print(numeros[i] + " ");
        }

    }
}
