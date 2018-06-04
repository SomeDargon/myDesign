package com.design;


/**
 *  懒汉模式，顾名思义，需要的时候加载，不需要的时候不加载，常见的spring 类的懒加载
 */
public class SingleObject1 {

    private static SingleObject1 singleObject1;
    private SingleObject1() {}

    public static SingleObject1 newInstance(){
        return  singleObject1 == null?singleObject1 = new SingleObject1():singleObject1;
    }
}
