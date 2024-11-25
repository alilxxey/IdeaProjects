import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // инициализация массива
        int sum = 0;
        for (int number : numbers) {
            sum += number; // суммируем элементы
        }
        double a = (double) sum / numbers.length; // находим среднее арифметическое
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + a);
    }
}

class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int sum = 0, mx, mi;

        int i = 0;
        do {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            i++;
        } while (i < n);

        mx = numbers[0];
        mi = numbers[0];

        i = 0;
        while (i < n) {
            sum += numbers[i];
            if (numbers[i] > mx) {
                mx = numbers[i];
            }
            if (numbers[i] < mi) {
                mi = numbers[i];
            }
            i++;
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + mx);
        System.out.println("Минимальный элемент: " + mi);
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

