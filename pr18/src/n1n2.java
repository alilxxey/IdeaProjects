import java.util.Scanner;

public class n1n2 {
    public void task1() {
        System.out.println("Задание 1: Handling ArithmeticException");

        System.out.println("шаг 1: Attempting 2 / 0");
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }

        System.out.println("шаг 2: Попытка 2.0 / 0.0");
        try {
            System.out.println(2.0 / 0.0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("Шаг 3");
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        }
    }

    public void task2() {
        System.out.println("\nЗадание 2: Handling input and exceptions");
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите число:");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println("2 / " + i + " = " + (2 / i)); // Деление
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат.");
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        } finally {
            System.out.println("саксесс");
        }
    }

    public static void main(String[] args) {
        n1n2 demo = new n1n2();

        demo.task1();

        demo.task2();
    }
}
