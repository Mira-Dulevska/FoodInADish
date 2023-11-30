package com.company;

public class FoodInADish <T> extends DrawableObj implements Comparable<FoodInADish<T>>{

    private T food;
    private String dishColour;

    public FoodInADish() {

    }

    public FoodInADish(T food, String dishColour) {
        this.food = food;
        this.dishColour = dishColour;
    }

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColour() {
        return dishColour;
    }

    public void setDishColour(String dishColour) {
        this.dishColour = dishColour;
    }

    @Override
    public int compareTo(FoodInADish<T> o) {
        return 0;
    }

    @Override
    public void draw() {

    }
}
