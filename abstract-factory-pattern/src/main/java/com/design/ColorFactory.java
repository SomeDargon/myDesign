package com.design;

public class ColorFactory extends AbstractFactory {
    public Shape getShare(String shareType) {
        return null;
    }


    @Override
    public Color getColor(String colorType) {
        switch (colorType){
            case "red"  : return new Red();
            case "blue" : return new Blue();
            case "green": return new Green();
            default: return null;
        }
    }
}
