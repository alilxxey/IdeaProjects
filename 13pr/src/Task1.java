public class Task1 {

    public static void main(String[] args) {
        String input = "I like Java!!!";

        // 1. Напишите метод, который принимает в качестве параметра любую строку
        processString(input);
    }

    public static void processString(String input) {
        // 2. Распечатать последний символ строки.
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 3. Проверить, заканчивается ли строка подстрокой "!!!".
        boolean endsWith = input.endsWith("!!!");
        System.out.println("Заканчивается ли строка '!!!': " + endsWith);

        // 4. Проверить, начинается ли строка подстрокой "I like".
        boolean startsWith = input.startsWith("I like");
        System.out.println("Начинается ли строка 'I like': " + startsWith);

        // 5. Проверить, содержит ли строка подстроку "Java".
        boolean containsJava = input.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + containsJava);

        // 6. Найти позицию подстроки "Java".
        int indexOfJava = input.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + indexOfJava);

        // 7. Заменить все символы "а" на "о".
        String replacedString = input.replace('a', 'o');
        System.out.println("Замена 'a' на 'o': " + replacedString);

        // 8. Преобразовать строку к верхнему регистру.
        String upperCase = input.toUpperCase();
        System.out.println("Верхний регистр: " + upperCase);

        // 9. Преобразовать строку к нижнему регистру.
        String lowerCase = input.toLowerCase();
        System.out.println("Нижний регистр: " + lowerCase);

        // 10. Вырезать строку "Java" с помощью метода substring().
        String substringJava = input.substring(indexOfJava, indexOfJava + "Java".length());
        System.out.println("Вырезанная строка 'Java': " + substringJava);
    }
}
