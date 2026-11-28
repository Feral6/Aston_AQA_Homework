package org.example;

public class Cat extends Animal {
    private static int catCount = 0;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(appetite)) {
            satiety = true;
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCatCount() {
        return catCount;
    }
}