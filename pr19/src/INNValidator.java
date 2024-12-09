import java.util.Scanner;

class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }
}

public class INNValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО:");
        String fullName = scanner.nextLine();

        System.out.println("Введите номер ИНН:");
        String inn = scanner.nextLine();

        try {
            validateINN(inn);
            System.out.println("ИНН действителен. Заказ оформлен на " + fullName);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void validateINN(String inn) throws InvalidINNException {
        if (inn == null || !inn.matches("\\d{12}")) {
            throw new InvalidINNException("Недействительный номер ИНН: " + inn);
        }
    }
}
