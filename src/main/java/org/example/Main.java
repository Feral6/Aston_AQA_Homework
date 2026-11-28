package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик", 5);

        dogBobik.run(150);
        dogBobik.run(600);
        dogBobik.swim(5);
        dogBobik.swim(20);

        catMurzik.run(100);
        catMurzik.run(300);
        catMurzik.swim(5);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());

        System.out.println();

        Bowl bowl = new Bowl(20);
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Васька", 8),
                new Cat("Рыжик", 5)
        };

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        bowl.printInfo();
        bowl.addFood(10);
        bowl.printInfo();
    }
}