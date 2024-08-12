package de.vimo.food;

public class Meal implements Food {
    Chicken chicken;
    Cake cake;
    Egg egg;
    public Meal() {
        this.chicken = chicken;
    }
    public Chicken getChickenWing() {
        return chicken.CHICKEN_WING;
    }
    public Chicken getChickenBreast() {
        return chicken.CHICKEN_BREAST;
    }
    public Cake getCake() {
        return cake.CHOCOLATE_CAKE;
    }
    public Egg getEgg() {
        return egg.BAVARIAN_EGG;
    }
    public void eat() {
        System.out.println("eat all");
    }
}
