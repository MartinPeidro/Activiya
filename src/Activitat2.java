import java.util.Scanner;

public class Activitat2 {
    static final Scanner teclado     = new Scanner(System.in);
    static final int     NUM_NUMEROS = 10;
    public static void main(String[] args) {
        String[] strings = new String[NUM_NUMEROS];
        for ( int i = 0; i < strings.length; i++ ) {
            System.out.print("Introduce el valor " + (i+1) + " : ");
            strings[i] = teclado.next();
        }
        for ( int i = 0; i < strings.length; i++ ) {
            if ( i % 2 == 0 ) {
                System.out.print( strings[i] + " " );
            }
        }
    }
}