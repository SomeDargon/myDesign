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

    /**
     *  用反射实现就不需要 在添加新类的时候在改代码了
     * @param classes
     * @param <T>
     * @return
     */
    public <T> T getClassShape(Class<? extends T> classes){
        T shape = null;
        try {
            shape = (T) Class.forName(classes.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shape;
    }
}
