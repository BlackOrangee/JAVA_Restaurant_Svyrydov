package com.restouran;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Food> foodList = new ArrayList<>();
    List<Drink> drinkList = new ArrayList<>();

    public void addToBasket(Food food) {
        foodList.add(food);
    }

    public void addToBasket(Drink drink) {
        drinkList.add(drink);
    }

    public List<Food> getFoodList() {
        return foodList;
    }
    public List<Drink> getDrinkList() {
        return drinkList;
    }

    static Basket basket = null;

    public static Basket getInstance() {
        if (basket == null) {
            basket = new Basket();
        }
        return basket;
    }

    private Basket() {
    }
}
