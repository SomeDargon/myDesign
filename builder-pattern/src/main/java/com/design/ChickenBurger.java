package com.design;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public Float price() {
        return 50.4f;
    }
}
