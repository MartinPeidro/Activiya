import java.util.Arrays;

public class Activitat7 {

    public static void main(String[] args) {
        String[] diasSemana = {"dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte", "diumenge"};
        String[] diasSemana2 = diasSemana;

        diasSemana2[0] = "Monday";

        System.out.println( Arrays.toString(diasSemana));
        System.out.println( Arrays.toString(diasSemana2));

        String[] diasSemana3 = copiaArray( diasSemana2 );
        diasSemana3[0] = "Lunes";

        System.out.println( Arrays.toString(diasSemana));
        System.out.println( Arrays.toString(diasSemana2));
        System.out.println( Arrays.toString(diasSemana3));
    }
    public static String[] copiaArray(String[] array){
        String[] copia = new String[array.length];

        for ( int i = 0; i < array.length; i++ ) {
            copia[i] = array[i];
        }
        return copia;
    }
}
