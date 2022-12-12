import java.util.Arrays;
public class Activitat5_8 {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 30, 40, 50};
        int[] arrayB = {60, 70, 80, 90, 100};
        int suma = arrayA[3] + arrayB[4];
        int arrayC[] = new int[5];

        arrayC[1] = suma + arrayA[0];
        arrayC[0] = arrayA[0] * arrayA[1] * arrayA[2] * arrayA[3] * arrayA[4];
        arrayC[2] = arrayA[0] + arrayA[1] + arrayA[2] + arrayA[3] + arrayA[4];
        arrayC[3] = arrayC[0] / arrayB[0];
        arrayC[4] = Math.max(arrayB[0], arrayA[4]);

        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(arrayC));
    }
}
