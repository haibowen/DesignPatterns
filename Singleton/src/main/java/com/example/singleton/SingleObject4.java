package com.example.singleton;

/**
 * 饿汉形式
 */
public class SingleObject4 {

    private static SingleObject4 instance = new SingleObject4();

    //私有构造方法
    private SingleObject4() {

    }

    //获取实例
    public static SingleObject4 getInstance() {
        return instance;
    }

    //调用的方法
    public static void showSomething4() {
        System.out.println("这是饿汉式的实现");
    }


}
