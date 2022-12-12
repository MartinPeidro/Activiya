public class Activitat4 {
    static final int NUMEROS_A_GENERAR = 200;
    static final int NUMEROS_MAX = 200;

    public static void main(String[] args) {
    int[] numeros = new int[NUMEROS_MAX];
        for ( int i = 0; i < numeros.length; i++ ) {
            numeros[i] = (int)(Math.random() *NUMEROS_MAX);
        }
        int suma = 0;
        for ( int numero: numeros){
            suma += numero;
        }
        System.out.println("La suma total es " + suma);
    }
}