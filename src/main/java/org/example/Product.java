package org.example;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryofOrigin;
    private double price;
    private boolean isBooked;
    public Product(String name, String productionDate, String manufacturer,
                   String countryofOrigin, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryofOrigin = countryofOrigin;
        this.price = price;
        this.isBooked = isBooked;
    }
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryofOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + (isBooked ? "да" :  "нет"));
    }
}
