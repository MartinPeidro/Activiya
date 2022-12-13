public class Activitat5_9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        visualizarArrayForEach( array );
        System.out.println();
        visualiarArray( array );
        int[] copia = ontenerCopia( array );
        System.out.println();
        visualizarMultiplos( array, 2 );
        System.out.println();
        visualizarMaximo( array );
        System.out.println();
        visualizarMinimo( array );
    }
    public static void visualizarArrayForEach(int[] array){
        for ( int numero: array) {
            System.out.print(numero + " ");
        }
    }
    public static void visualiarArray(int[] array){
        for ( int i = 0; i < array.length; i++ ) {

            System.out.print(array[i] + " ");
        }
    }
    public static int[] ontenerCopia(int array[]){
       int[] copia = new int[array.length];

        for ( int i = 0; i < array.length; i++ ) {
            copia[i] = array[i];
        }
        return copia;
    }
    public static void visualizarMultiplos(int[] array, int multiplo){
        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] % multiplo == 0){
                System.out.println(array[i]);
            }
        }
    }
    public static void visualizarMaximo(int[] array){
        int mayor = array[0];
        for (int x = 1; x < array.length; x++) {
            int numeroActual = array[x];
            if ( numeroActual > mayor ) {
                mayor = numeroActual;
            }
        }
        System.out.println(mayor);
    }
    public static void visualizarMinimo(int[] array){
        int menor = array[0];
        for (int x = 1; x < array.length; x++) {
            int numeroActual = array[x];
            if ( numeroActual < menor ) {
                menor = numeroActual;
            }
        }
        System.out.println(menor);
    }
}
