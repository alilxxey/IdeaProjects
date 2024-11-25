// Задание 1
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String developer = "Иванов Иван";
        Date taskReceivedDate = new Date();
        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Дата и время получения задания: " + taskReceivedDate);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date taskSubmissionDate = new Date(); // Дата и время сдачи задания
        System.out.println("Дата и время сдачи задания: " + taskSubmissionDate);
    }
}




class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String formatBirthDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Дата рождения: " + formatBirthDate("yyyy-MM-dd");
    }
}

