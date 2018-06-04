package com.design;


/**
 *  懒汉模式 线程安全
 *  优点： 第一次使用才创建
 *  缺点 使用synchronized关键字 ，效率较低
 */
public class SingleObject3 {

    private static SingleObject3 singleObject3 ;
    private SingleObject3(){}

    public synchronized static SingleObject3 newInstance(){
        if (singleObject3 == null){
            singleObject3 = new SingleObject3();
        }
        return singleObject3;
    }


}
