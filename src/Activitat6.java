public class Activitat6 {

    static final int NUM_ARRAYS = 50;
    static final int LONG_ARRAY = 10;
    public static void main(String[] args) {
        int[] array = crearArray();
        visualitzarArray( array );
        int posicion = cecarZero( array );
        if ( posicion == -1 ){
            System.out.println("No hay cero");
        } else {
            System.out.println("El cero esta en la posición " + posicion);
        }
        intercambia( array );
        visualitzarArray( array );
    }
    public static int[] crearArray(){
        int[] numeros = new int[LONG_ARRAY];
        for ( int i = 0; i < numeros.length; i++ ) {
            numeros[i] = (int) (Math.random()* NUM_ARRAYS);
        }
        return numeros;
    }

    public static void visualitzarArray(int[] array){
        for (int numeros: array) {
            System.out.print(numeros + " ");
        }
    }
    public static int cecarZero(int[] array){
        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] == 0 ){
                return i;
            }
        }
        return -1;
    }
    public static void intercambia(int[] array){
        if (array.length < 2){
            return;
        }
        int ayud = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = ayud;
    }
}
