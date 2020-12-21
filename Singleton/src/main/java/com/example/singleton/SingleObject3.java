package com.example.singleton;

/**
 * 懒汉式 线程安全
 */
public class SingleObject3 {

    private static SingleObject3 instance;

    //构造方法的私有化
    private SingleObject3() {

    }

    //构造实例
    public static synchronized SingleObject3 getInstance() {

        if (null == instance) {
            instance = new SingleObject3();
        }
        return instance;
    }

    //调用方法
    public static void showSomething3() {
        System.out.println("这是懒汉式的 线程安全的方法调用");
    }
}
