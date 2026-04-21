public class Product {
    private String name;
    private String data;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isReserved;

    Product(String name, String data, String manufacturer, String country, double price, boolean isReserved) {
        this.name = name;
        this.data = data;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void info() {
        String status = isReserved ? "Забронирован" : "Не забронирован";
        System.out.println("Товар: " + name);
        System.out.println("Дата производства: " + data);
        System.out.println("Производитель: " + manufacturer + " (" + country + ")");
        System.out.println("Цена: " + price);
        System.out.println("Статус: " + status);
    }

    public static void main(String[] args) {
        Product item = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 85000.0, true);
        item.info();
    }
}
