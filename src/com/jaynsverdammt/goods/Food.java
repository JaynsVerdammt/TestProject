package com.jaynsverdammt.goods;

public class Food implements IGoods {
    private double price;
    private String name;

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
    public String toString() {
        return String.format("Food: %s Price %.2f", name, price);
    }
}
