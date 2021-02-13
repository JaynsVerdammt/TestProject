package com.jaynsverdammt;

import com.jaynsverdammt.goods.Beverage;
import com.jaynsverdammt.goods.Food;

public class Main {

    public static void main(String[] args) {
        Beverage beverageWeizen = new Beverage();
        beverageWeizen.setName("Weizen");
        beverageWeizen.setPrice(3.20);

        Beverage beverageFanta = new Beverage();
        beverageFanta.setName("Fanta");
        beverageFanta.setPrice(2.80);

        Food foodPaprika = new Food();
        foodPaprika.setName("Paprika");
        foodPaprika.setPrice(1.99);

        Food foodAubergine = new Food();
        foodAubergine.setName("Aubergine");
        foodAubergine.setPrice(3.99);

        Food foodPotato = new Food();
        foodPotato.setName("Potato");
        foodPotato.setPrice(0.99);



        Order order1 = new Order(1);
        order1.orderGoods(beverageWeizen, 5);
        order1.orderGoods(beverageFanta, 2);
        order1.orderGoods(foodAubergine, 1);
        order1.orderGoods(foodPaprika, 3);
        order1.orderGoods(foodPotato, 4);
        order1.orderGoods(beverageWeizen, 7);
        System.out.println(order1.getBill());
    }
}
