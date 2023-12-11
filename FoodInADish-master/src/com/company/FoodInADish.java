package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FoodInADish <T> extends DrawableObj implements Comparable<FoodInADish<T>>{

    private T food;
    private String dishColour;

    public FoodInADish() {

    }

    public FoodInADish(int xCoord, int yCoord, int width, int height, T food, String dishColour) {
        super(xCoord, yCoord, width, height);
        this.food = food;
        this.dishColour = dishColour;
    }

    public FoodInADish(T food, String dishColour) {
        this.food = food;
        this.dishColour = dishColour;
    }

    @Override
    public int compareTo(FoodInADish<T> f) {
        if(this.getFood() instanceof Fruit && f.getFood() instanceof Fruit){
            return Double.compare(((Fruit) this.getFood()).getKg(), ((Fruit) f.getFood()).getKg());
        } else if(this.getFood() instanceof Vegetable && f.getFood() instanceof Vegetable){
            return Double.compare(((Vegetable) this.getFood()).getKg(), ((Vegetable) f.getFood()).getKg());
        } else if(this.getFood() instanceof Fruit){
            return -1;
        } else return 1;
    }

    @Override
    public String toString() {
        return "A " + food + " in a " + dishColour + " dish";
    }

    @Override
    public JPanel draw() {
        JPanel p = new JPanel();

        ImageIcon foodIcon = new ImageIcon("resources/" + ((Food) food).getName() + ".png");
        ImageIcon dishIcon = new ImageIcon("resources/" + dishColour + ".png");


        JLabel fl = new JLabel(foodIcon);
        fl.setBounds(5, 0, foodIcon.getIconWidth() +10, foodIcon.getIconHeight());
        p.add(fl);

        JLabel dl=new JLabel(dishIcon);
        dl.setBounds(5, foodIcon.getIconHeight()+5, dishIcon.getIconWidth() +10, dishIcon.getIconHeight());
        p.add(dl);

        p.setBounds(5, 0, Math.max(foodIcon.getIconWidth(), dishIcon.getIconWidth()) + 10, foodIcon.getIconHeight() + 5 + dishIcon.getIconHeight());
        p.setBorder(new LineBorder(Color.BLACK));

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
