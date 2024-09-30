import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // инициализация массива
        int sum = 0;
        for (int number : numbers) {
            sum += number; // суммируем элементы
        }
        double average = (double) sum / numbers.length; // находим среднее арифметическое
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}


class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int sum = 0, max, min;

        int i = 0;
        do {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            i++;
        } while (i < n);

        max = numbers[0];
        min = numbers[0];

        i = 0;
        while (i < n) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}

class Task5 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Аргумент: " + arg);
        }
    }
}
class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("1/%d = %.2f%n", i, 1.0 / i);
        }
    }
}

class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int num = sc.nextInt();
        System.out.println("Факториал " + num + " = " + factorial(num));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

