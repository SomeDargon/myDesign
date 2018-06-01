package com.design;

public class ShapeFactory extends AbstractFactory {
    public Shape getShare(String shareType) {
        switch (shareType){
            case "circle"    : return new Circle();
            case "rectangle" : return new Rectangle();
            case "square"    : return new Square();
            default          : return null;
        }
    }

    public Color getColor(String colorType) {
        return null;
    }
}
