package com.design;

public class FactoryProducer {
    public static AbstractFactory getFactory(String name){
        switch (name){
            case "color" : return new ColorFactory();
            case "share" : return new ShapeFactory();
            default      : return null;
        }
    }
}
