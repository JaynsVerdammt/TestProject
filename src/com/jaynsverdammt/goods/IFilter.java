package com.jaynsverdammt.goods;

public interface IFilter<T> {
    public boolean isFiltered(T menuEntry);
}
