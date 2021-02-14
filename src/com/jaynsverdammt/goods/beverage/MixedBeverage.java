package com.jaynsverdammt.goods.beverage;


import com.jaynsverdammt.goods.Unit;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class MixedBeverage extends Beverage{
    private Map<Beverage, Integer> ingredients;

    public List<BeverageType> getMixedBeverageTypes() {
        return beverageTypes;
    }

    private final List<BeverageType> beverageTypes = new ArrayList<>();

    public MixedBeverage(String name, double price, double volume, Unit unit, Map<Beverage, Integer> ingredients) {
        super(name, price, volume, unit);
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        String recipe = String.format("Recipe for %s: \n", this.getName());

        Set<Beverage> beverages = ingredients.keySet();
        for (Beverage beverage : beverages) {
            String beverageString = String.format("%d Parts of %s \n", ingredients.get(beverage), beverage.getName());
            recipe = recipe.concat(beverageString);
        }
        return recipe;
    }

    public void addMixedBeverageType(BeverageType beverageType) {
        beverageTypes.add(beverageType);
    }

    public void addMixedBeverageType(List<BeverageType> beverageTypes) {
        for (BeverageType beverageType : beverageTypes) {
            addMixedBeverageType(beverageType);
        }
    }

    public void removeMixedBeverageType(BeverageType beverageType) {
        beverageTypes.remove(beverageType);
    }

    public void removeMixedBeverageType(List<BeverageType> beverageTypes) {
        for (BeverageType beverageType : beverageTypes) {
            removeMixedBeverageType(beverageType);
        }
    }

}
