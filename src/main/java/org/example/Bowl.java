package org.example;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food = food + amount;
        }
    }

    // пробует забрать еду; true если хватило, false если нет
    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food = food - amount;
            return true;
        } else {
            return false;
        }
    }

    public void printInfo() {
        System.out.println("В миске еды: " + food);
    }
}