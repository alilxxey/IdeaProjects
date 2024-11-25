import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("Введите дату в формате yyyy-MM-dd HH:mm:ss:");
        String userInput = scanner.nextLine();

        try {
            Date userDate = sdf.parse(userInput);
            Date currentDate = new Date();

            System.out.println("Введенная дата: " + userDate);
            System.out.println("Текущая системная дата: " + currentDate);

            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата раньше текущей.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата позже текущей.");
            } else {
                System.out.println("Даты совпадают.");
            }
        } catch (ParseException e) {
            System.out.println("Неверный формат даты.");
        }
    }
}
