package com.design;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public Float price() {
        return 2.5f;
    }
}
