import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        Date birthDate = new Date(95, 4, 15); // 15 мая 1995
        Student student = new Student("Иванов Иван", birthDate);

        System.out.println(student);
        System.out.println("Краткий формат: " + student.formatBirthDate("dd/MM/yyyy"));
        System.out.println("Средний формат: " + student.formatBirthDate("MMM dd, yyyy"));
        System.out.println("Полный формат: " + student.formatBirthDate("EEEE, MMMM dd, yyyy"));
    }
}
