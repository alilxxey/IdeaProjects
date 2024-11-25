import java.util.regex.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.println("Введите строку для разбивки:");
        String inputString = scanner.nextLine();
        String[] elements = inputString.split("\\s+|,|\\.");
        System.out.println("Результат разбивки:");
        for (String element : elements) {
            System.out.println(element);
        }

        // Task 2
        System.out.println("Введите строку для проверки на соответствие шаблону:");
        String testString = scanner.nextLine();
        String regex = "^[a-z]+\\d+$";
        if (testString.matches(regex)) {
            System.out.println("Строка соответствует шаблону.");
        } else {
            System.out.println("Строка не соответствует шаблону.");
        }

        // Task 3
        System.out.println("Введите текст с ценами:");
        String priceText = scanner.nextLine();
        String priceRegex = "\\b\\d{1,}\\.\\d{2}\\s*(USD|RUB|EU)\\b";
        Pattern pattern = Pattern.compile(priceRegex);
        Matcher matcher = pattern.matcher(priceText);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}