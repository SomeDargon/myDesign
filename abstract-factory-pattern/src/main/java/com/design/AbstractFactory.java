package com.design;

public abstract class AbstractFactory {
    public abstract Shape getShare(String shareType);
    public abstract Color getColor(String colorType);
}
