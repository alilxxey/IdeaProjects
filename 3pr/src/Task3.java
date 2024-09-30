import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10;
        }

        System.out.print("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean isIncreasing = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Строгое возрастание");
        } else {
            System.out.println("Не возрастает");
        }
    }
}
