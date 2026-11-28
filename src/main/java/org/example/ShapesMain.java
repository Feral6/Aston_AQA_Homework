package org.example;

public class ShapesMain {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, "красный", "чёрный"),
                new Rectangle(3, 4, "синий", "белый"),
                new Triangle(3, 4, 5, "зелёный", "жёлтый")
        };

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println("---");
        }
    }
}