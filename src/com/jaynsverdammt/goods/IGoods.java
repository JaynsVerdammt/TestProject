package com.jaynsverdammt.goods;

public interface IGoods {
    public double getPrice();

    public void setPrice(double newPrice);

    public String getName();

    public void setName(String newName);

    public Unit getUnit();
}
