import java.util.Arrays;

public class Activitat10 {

    public static void main(String[] args) {
        int[] array1 = crearAleatorios( 10 );
        int[] array2 = crearAleatorios( 10 );

        System.out.println( Arrays.toString(array1));
        System.out.println( Arrays.toString(array2));

        ordcenarPorIntercambio( array1 );
        ordcenarPorIntercambio( array2 );

        System.out.println( Arrays.toString(array1));
        System.out.println( Arrays.toString(array2));
    }

    public static void ordcenarPorIntercambio(int [] array){
        for ( int i = 0; i < array.length-1; i++ ) {
            for ( int j = i+1; j < array.length; j++ ) {
                if (array[j] < array[i]){
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static int[] crearAleatorios(int tamanyo){
        int[] numeros = new int[tamanyo];
        for ( int i = 0; i < numeros.length; i++ ) {
            numeros[i] = (int)(Math.random() * 30);
        }
        return numeros;
    }

}