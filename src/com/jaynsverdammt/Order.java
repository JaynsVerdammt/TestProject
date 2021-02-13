package com.jaynsverdammt;

import com.jaynsverdammt.goods.IGoods;

import java.util.*;

public class Order {
    private Map<IGoods, Integer> goodsMap = new HashMap<>();
    private int tableNumber;

    public Order(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void orderGoods(IGoods orderedGoods, int orderedAmount) {
        if (goodsMap.containsKey(orderedGoods)) {
            Integer currentAmount = goodsMap.get(orderedGoods);
            goodsMap.put(orderedGoods, currentAmount + orderedAmount);
        } else {
            goodsMap.put(orderedGoods, orderedAmount);
        }
    }

    public String getBill() {
        Set<IGoods> goodsSet = goodsMap.keySet();
        double totalBill = 0;
        String billString = String.format("Bill for Table %d \n", tableNumber);
        for (IGoods good : goodsSet) {
            Integer amountOrdered = goodsMap.get(good);
            totalBill += good.getPrice() * amountOrdered;
            billString = billString.concat(good + " x" + amountOrdered + "\n");
        }
        billString = billString.concat(String.format("Total Amount: %.2f", totalBill * 1.19));
        return billString;
    }
}
