package com.company;

public class FoodInADish <T> extends DrawableObj implements Comparable<FoodInADish<T>>{

    private T food;
    private String dishColour;

    @Override
    public int compareTo(FoodInADish<T> o) {
        return 0;
    }
}
