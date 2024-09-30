import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        double[] arrMath = new double[10];
        for (int i = 0; i < arrMath.length; i++) {
            arrMath[i] = Math.random();
        }

        Random random = new Random();
        double[] arrRandom = new double[10];
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = random.nextDouble();
        }

        System.out.println("Math.random(): ");
        System.out.println(Arrays.toString(arrMath));
        Arrays.sort(arrMath);
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(arrMath));

        System.out.println("Random: ");
        System.out.println(Arrays.toString(arrRandom));
        Arrays.sort(arrRandom);
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(arrRandom));
    }
}


