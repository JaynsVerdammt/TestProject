package com.jaynsverdammt.goods;

public class BasicIngredients implements IGoods{
    private double price;
    private String name;
    private Unit unit;

    public BasicIngredients(String name, double price, Unit unit) {
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) { this.price = newPrice;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) { this.name = newName;

    }

    @Override
    public Unit getUnit() {
        return unit;
    }
}
