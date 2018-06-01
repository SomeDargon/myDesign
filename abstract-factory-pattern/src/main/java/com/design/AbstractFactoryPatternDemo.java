package com.design;


public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory a = FactoryProducer.getFactory("color");
        Color color = a.getColor("red");
        color.fill();
        AbstractFactory b = FactoryProducer.getFactory("share");
        Shape shape =  b.getShare("circle");
        shape.draw();
    }
}
