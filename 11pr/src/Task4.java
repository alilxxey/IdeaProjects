import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц (1-12): ");
        int month = scanner.nextInt() - 1; // В Calendar месяцы начинаются с 0
        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        System.out.println("Введите часы: ");
        int hour = scanner.nextInt();
        System.out.println("Введите минуты: ");
        int minute = scanner.nextInt();

        Calendar calendar = new GregorianCalendar(2024, 10 , 25);
        calendar.set(year, month, day, hour, minute);

        Date date = calendar.getTime();
        System.out.println("Созданный объект Date: " + date);
    }
}