import javax.swing.*;
import java.awt.*;

public class TableForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Таблица");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[][] data = {
                {"1", "выафыва", "11000"},
                {"2", "фыва", "12200"},
                {"3", "фывам", "15040"},
                {"4", "фывам", "13030"}
        };

        String[] columnNames = {"номер", "строка", "число"};

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
