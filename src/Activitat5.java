public class Activitat5 {
    static final int NUMEROS_A_GENERAR = 20;
    static final int NUMEROS_MAX = 9;

    public static void main(String[] args) {
    int[] numeros = new int[NUMEROS_A_GENERAR];
        for ( int i = 0; i < numeros.length; i++ ) {
            numeros[i] = (int)(Math.random() *NUMEROS_MAX+1);
        }
        for ( int i = 1; i <= numeros.length; i++ ) {
            System.out.print(numeros[i-1]);
            if (i % 4 == 0 ){
                System.out.print(" ");
            }
        }
    }
}