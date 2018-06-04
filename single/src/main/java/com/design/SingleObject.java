package com.design;

/**
 *  恶汉模式 顾名思义 在类加载的时候创建，因为是静态变量
 *  优点： 没有加锁
 *  缺点： 类加载的时候就创建，浪费内存
 */
public class SingleObject {
    private static SingleObject singleObject = new SingleObject();
    public static SingleObject newInstance(){
        return singleObject;
    }
}
