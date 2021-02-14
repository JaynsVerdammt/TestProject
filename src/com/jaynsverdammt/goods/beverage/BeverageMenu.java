package com.jaynsverdammt.goods.beverage;

import com.jaynsverdammt.goods.IFilter;
import com.jaynsverdammt.goods.IGroup;
import com.jaynsverdammt.goods.IMenuPlan;

import java.util.ArrayList;
import java.util.List;

public class BeverageMenu implements IMenuPlan<Beverage> {
    List<Beverage> beverageList = new ArrayList<>();
    List<IGroup<Beverage>> groupList = new ArrayList<>();
    List<IFilter<Beverage>> filterList = new ArrayList<>();

    @Override
    public String getMenu() {
        String menuString = String.format("Menu Beverages");
        for (Beverage beverage : beverageList) {
            menuString = menuString.concat(String.format("\n%s -- %s %s - %.2f €", beverage.getName(), getFormattedVolume(beverage), beverage.getUnit(), beverage.getPrice()));
        }
        return menuString;
    }

    private String getFormattedVolume(Beverage beverage) {
        String volumeString;
        switch (beverage.getUnit()) {
            case ml:
                volumeString = String.format("%.0f", beverage.getVolume());
                break;
            case l:
                volumeString = String.format("%.1f", beverage.getVolume());
                break;
            default:
                volumeString = String.format("%.2f", beverage.getVolume());
        }
        return volumeString;
    }

    @Override
    public void addMenuEntry(Beverage menuEntry) {
        beverageList.add(menuEntry);
    }

    @Override
    public void removeMenuEntry(Beverage menuEntry) {
        beverageList.remove(menuEntry);
    }

    @Override
    public void addGroup(IGroup<Beverage> group) {
        groupList.add(group);
    }

    @Override
    public void removeGroup(IGroup<Beverage> group) {
        groupList.remove(group);
    }

    @Override
    public void addFilter(IFilter<Beverage> filter) {
        filterList.add(filter);
    }

    @Override
    public void removeFilter(IFilter<Beverage> filter) {
        filterList.remove(filter);
    }
}
