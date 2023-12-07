package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FoodInADish<Food>> dishes = new ArrayList<>();

        FoodInADish f1 = new FoodInADish("banana","blue");
        dishes.add(f1);
        FoodInADish f2 = new FoodInADish("blueberry","darkblue");
        dishes.add(f2);
        FoodInADish f3 = new FoodInADish("lettice","green");
        dishes.add(f3);
        FoodInADish f4 = new FoodInADish("pepper","red");
        dishes.add(f4);
        FoodInADish f5 = new FoodInADish("strawberry","white");
        dishes.add(f5);

        //Arrays.sort(dishes);
        for(FoodInADish t : dishes) {
            System.out.println(t.toString());
        }

    }
}
