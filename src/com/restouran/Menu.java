package com.restouran;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Food> foods = new ArrayList<>();
    List<Drink> drinks = new ArrayList<>();

    public Menu() {
        this.foods.add(new Burger());
        this.foods.add(new Pizza());
        this.drinks.add(new Cola());
    }

    public void displayMenu(){

        for (Food food : foods ) {
            System.out.println(food.getName() + ": " + food.getPrice());
        }
        for (Drink drink : drinks ) {
            System.out.println(drink.getName() + ": " + drink.getPrice());
        }
    }
}
