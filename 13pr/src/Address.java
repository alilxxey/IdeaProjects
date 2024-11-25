
import java.util.StringTokenizer;
public class Address {
    private String country; // Страна
    private String region;  // Регион
    private String city;    // Город
    private String street;  // Улица
    private String house;   // Дом
    private String building; // Корпус
    private String apartment; // Квартира

    public void parseAddressUsingSplit(String address, String delimiter) {
        String[] parts = address.split(delimiter);

        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
        }

        if (parts.length == 7) {
            this.country = parts[0];
            this.region = parts[1];
            this.city = parts[2];
            this.street = parts[3];
            this.house = parts[4];
            this.building = parts[5];
            this.apartment = parts[6];
        } else {
            System.out.println("Некорректный формат строки для split.");
        }
    }

    public void parseAddressUsingTokenizer(String address, String delimiters) {
        StringTokenizer tokenizer = new StringTokenizer(address, delimiters);

        try {
            this.country = tokenizer.nextToken().trim();
            this.region = tokenizer.nextToken().trim();
            this.city = tokenizer.nextToken().trim();
            this.street = tokenizer.nextToken().trim();
            this.house = tokenizer.nextToken().trim();
            this.building = tokenizer.nextToken().trim();
            this.apartment = tokenizer.nextToken().trim();
        } catch (Exception e) {
            System.out.println("Некорректный формат строки для StringTokenizer.");
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

}
