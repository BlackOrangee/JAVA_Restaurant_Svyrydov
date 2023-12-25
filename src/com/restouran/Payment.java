package com.restouran;

import java.util.List;

public class Payment {
    static double calculateAmount()
    {
        List<Drink> drinkList = Basket.getInstance().getDrinkList();
        List<Food> foodList = Basket.getInstance().getFoodList();

        int totalPrice = 0;

        for (Drink dr : drinkList)
        {
            totalPrice += dr.getPrice();
            System.out.println(dr.getName() + " : " + dr.getPrice() + "\n");
        }

        for (Food fo : foodList) {
            totalPrice += fo.getPrice();
            System.out.println(fo.getName() + " : " + fo.getPrice() + "\n");
        }
        return totalPrice;
    }
}
