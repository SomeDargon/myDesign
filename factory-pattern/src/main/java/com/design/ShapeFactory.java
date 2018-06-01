package com.design;

public class ShapeFactory {

    public Shape getShape(String name){
        switch (name){
            case "circle":  return new Circle();
            case "square":  return new Square();
            case "Rectangle": return new Rectangle();
            default:return null;
        }
    }
}
