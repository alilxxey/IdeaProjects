import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                return computer;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers +
                '}';
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addComputer(new Computer("Apple", "MacBook Pro"));
        shop.addComputer(new Computer("Dell", "XPS 15"));
        shop.addComputer(new Computer("HP", "Pavilion"));

        System.out.println(shop);

        Computer found = shop.findComputer("Apple", "MacBook Pro");
        System.out.println("Found: " + (found != null ? found : "Not found"));
    }
}
