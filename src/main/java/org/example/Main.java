package org.example;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 17 Pro", "15.03.2025",
                "Apple Inc.", "USA", 6200, false);
        productsArray[2] = new Product("Xiaomi 15", "10.01.2025",
                "Xiaomi Corp.", "China", 2800, true);
        productsArray[3] = new Product("Sony WH-1000XM6", "20.04.2025",
                "Sony Corp.", "Japan", 950, false);
        productsArray[4] = new Product("Dell XPS 15", "05.02.2025",
                "Dell Technologies", "USA", 4100, true);

        for (Product product : productsArray) {
            product.printInfo();
            System.out.println("---------------------------");
        }
    }
}