package com.jaynsverdammt;

import com.jaynsverdammt.goods.*;
import com.jaynsverdammt.goods.beverage.Beverage;
import com.jaynsverdammt.goods.beverage.BeverageMenu;
import com.jaynsverdammt.goods.beverage.MixedBeverage;
import com.jaynsverdammt.goods.beverage.BeverageType;
import com.jaynsverdammt.goods.food.Food;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Beverage beverageWeizen = new Beverage("Weizen", 3.20, 0.5, Unit.l);

        Beverage beverageFanta = new Beverage("Fanta", 2.80, 0.4, Unit.l);

        Beverage beverageWaterSilent = new Beverage("Water silent", 1, 1, Unit.l);

        Beverage beverageWaterSparkling = new Beverage("Water sparkling", 1.5, 1, Unit.l);

        Beverage beverageElderflowerSirup = new Beverage("Elderflowersirup", 1.8, 50, Unit.ml);

        Beverage beverageRaspberrySirup = new Beverage("RaspberrySirup", 1.6, 50, Unit.ml);

        Beverage beverageCranberryJuice = new Beverage("Cranberryjuice", 2.8, 300, Unit.ml);

        Food foodPaprika = new Food("Paprika", 1.99, Unit.pcs);

        Food foodAubergine = new Food("Aubergine", 3.99, Unit.pcs);

        Food foodPotato = new Food("Potato", 0.99, Unit.pcs);

        BasicIngredients basicIngredients = new BasicIngredients("Starfruit", 0.80, Unit.slice);

        Map<Beverage, Integer> fantaSchorleRecipe = new HashMap<>();
        fantaSchorleRecipe.put(beverageFanta, 1);
        fantaSchorleRecipe.put(beverageWaterSparkling, 2);
        MixedBeverage beverageFantaSchorle = new MixedBeverage("Fantasschorle", 2.60, 0.5, Unit.l, fantaSchorleRecipe);

        Map<Beverage, Integer> schiwasserRecipe = new HashMap<>();
        schiwasserRecipe.put(beverageRaspberrySirup, 1);
        schiwasserRecipe.put(beverageWaterSparkling, 5);
        MixedBeverage beverageSchiwasser = new MixedBeverage("Schiwasser", 2.70, 0.5, Unit.l, schiwasserRecipe);
        beverageSchiwasser.addMixedBeverageType(BeverageType.schorle);
        beverageSchiwasser.addMixedBeverageType(BeverageType.virgin);

        BeverageMenu beverageMenu = new BeverageMenu();
        beverageMenu.addMenuEntry(beverageSchiwasser);
        beverageMenu.addMenuEntry(beverageWeizen);
        beverageMenu.addMenuEntry(beverageWaterSparkling);
        beverageMenu.addMenuEntry(beverageWaterSilent);
        beverageMenu.addMenuEntry(beverageFanta);
        beverageMenu.addMenuEntry(beverageFantaSchorle);
        beverageMenu.addMenuEntry(beverageCranberryJuice);

        System.out.println(beverageMenu.getMenu());

//        System.out.println(beverageFantaSchorle.getRecipe());
        Order order = new Order(7);
        order.orderGoods(beverageSchiwasser, 2);
        order.orderGoods(foodPotato, 4);
//        System.out.println(order.getBill());
    }
}
