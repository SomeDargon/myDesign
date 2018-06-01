package com.design;


/**
 * 普通工厂类
 * 统一创建管理实体类
 */
public class FactoryPatterDome {
    public static void main(String[] args) {
        ShapeFactory s = new ShapeFactory();
        Shape square = s.getShape("square");
        square.draw();
        Shape circle = s.getShape("circle");
        circle.draw();
    }
}
