package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<FoodInADish<Food>> dishes = new ArrayList<FoodInADish<Food>>();

        FoodInADish<Food> bananaBlue = new FoodInADish<Food>();
        FoodInADish<Food> blueberryDarkblue = new FoodInADish<Food>();
        FoodInADish<Food> letticeGreen = new FoodInADish<Food>();
        FoodInADish<Food> pepperRed = new FoodInADish<Food>();
        FoodInADish<Food> strawberryWhite = new FoodInADish<Food>();

        Food banana = new Fruit();
        banana.setName("banana");
        banana.setKg(1.0);
        ((Fruit)banana).setReadyToEat(true);

        bananaBlue.setFood(banana);
        bananaBlue.setDishColour("blue");
        dishes.add(bananaBlue);

        Food blueberry = new Fruit();
        blueberry.setName("blueberry");
        blueberry.setKg(0.1);
        ((Fruit)blueberry).setReadyToEat(true);

        blueberryDarkblue.setFood(blueberry);
        blueberryDarkblue.setDishColour("darkblue");
        dishes.add(blueberryDarkblue);

        Food lettice = new Vegetable();
        lettice.setName("lettice");
        lettice.setKg(1.5);
        ((Vegetable)lettice).setFresh(true);

        letticeGreen.setFood(lettice);
        letticeGreen.setDishColour("green");
        dishes.add(letticeGreen);

        Food pepper = new Vegetable();
        pepper.setName("pepper");
        pepper.setKg(1.2);
        ((Vegetable)pepper).setFresh(true);

        pepperRed.setFood(pepper);
        pepperRed.setDishColour("red");
        dishes.add(pepperRed);

        Food strawberry = new Fruit();
        strawberry.setName("strawberry");
        strawberry.setKg(0.5);
        ((Fruit)strawberry).setReadyToEat(true);

        strawberryWhite.setFood(strawberry);
        strawberryWhite.setDishColour("white");
        dishes.add(strawberryWhite);

        Collections.sort(dishes);

        JFrame frame = new JFrame("FoodInADish");
        int x=0;
        int y=50;
        frame.setLayout(new GridLayout(1, 20));
        for(FoodInADish<Food> currentFD : dishes) {
            JPanel panel = currentFD.draw();
            frame.add(panel);
            x+=panel.getWidth();
            if(y<panel.getHeight()) y+=panel.getHeight();
        }
        frame.setSize(x, y);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
