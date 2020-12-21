package com.example.singleton;

/**
 * 懒汉式 线程不安全的实现
 */
public class SingleObject2 {


    private static SingleObject2 instance;

    //构造方法私有化
    private SingleObject2() {

    }

    //构造改类的实例
    public static SingleObject2 getInstance() {
        if (null == instance) {
            instance = new SingleObject2();
        }

        return instance;

    }

    //要调用的方法
    public static void showSomething2() {
        System.out.println("这是懒汉式 线程不安全的实现");

    }

}
