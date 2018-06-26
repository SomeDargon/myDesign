package com.design;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public Float price() {
        return 25.0f;
    }
}
