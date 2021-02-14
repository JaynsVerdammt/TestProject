package com.jaynsverdammt.goods.beverage;

import com.jaynsverdammt.goods.IGoods;
import com.jaynsverdammt.goods.Unit;

public class Beverage implements IGoods {
    public double getVolume() {
        return volume;
    }

    private final double volume;
    private double price;
    private String name;
    private final Unit unit;

    public Beverage (String name, double price, double volume, Unit unit) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.volume = volume;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return String.format("Beverage: %s Price %.2f", name, price);
    }
}
