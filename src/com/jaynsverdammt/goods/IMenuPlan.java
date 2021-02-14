package com.jaynsverdammt.goods;

public interface IMenuPlan<T> {
    public String getMenu();

    public void addMenuEntry(T menuEntry);

    public void removeMenuEntry(T menuEntry);

    public void addGroup(IGroup<T> group);

    public void removeGroup(IGroup<T> group);

    public void addFilter(IFilter<T> filter);

    public void removeFilter(IFilter<T> filter);
}
