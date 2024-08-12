package de.vimo.food;

public class App {
    public static void main(String[] args) {
        Meal meal = new Meal();
        System.out.println(meal.getChickenWing());
        System.out.println(meal.getChickenBreast());

        System.out.println(meal.getCake());
        System.out.println(meal.getEgg());
        meal.eat();
    }
}
