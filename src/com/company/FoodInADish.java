package com.company;

import javax.swing.*;

public class FoodInADish <T> extends DrawableObj implements Comparable<FoodInADish<T>>{

    private T food;
    private String dishColour;

    public FoodInADish() {
        food= (T) new Object();
        dishColour="";
    }

    public FoodInADish(T food, String dishColour) {
        this.food = food;
        this.dishColour = dishColour;
    }

    @Override
    public int compareTo(FoodInADish<T> f) {
        if(f.getFood() instanceof Fruit){
            return Double.compare(((Fruit) this.getFood()).getKg(), ((Fruit) f.getFood()).getKg());
        }
        if(f.getFood() instanceof Vegetable){
            return Double.compare(((Vegetable) this.getFood()).getKg(), ((Vegetable) f.getFood()).getKg());
        }
        if(f.getFood() instanceof Fruit && this.getFood() instanceof Vegetable){
            return 1;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return "A " + food + " in a " + dishColour + " dish";
    }

    @Override
    public JPanel draw() {
        ImageIcon foodIcon = new ImageIcon("resources/" + ((Food) food).getName() + ".png");
        ImageIcon dishIcon = new ImageIcon("resources/" + dishColour + ".png");
        JPanel p = new JPanel();

        JLabel fl = new JLabel(foodIcon);
        fl.setBounds(0, 0, foodIcon.getIconWidth(), foodIcon.getIconHeight());
        p.add(fl);

        JLabel dl=new JLabel(dishIcon);
        dl.setBounds(0, foodIcon.getIconHeight()+5, dishIcon.getIconWidth(), dishIcon.getIconHeight());
        p.add(dl);

        p.setBounds(getxCoord(), getyCoord(), Math.max(foodIcon.getIconWidth(), dishIcon.getIconWidth()), foodIcon.getIconHeight());
        return p;
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


}
