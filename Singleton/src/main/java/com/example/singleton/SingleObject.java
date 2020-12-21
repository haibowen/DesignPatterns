package com.example.singleton;

/**
 * 单例模式的几种写法
 */
public class SingleObject {
    //创建SingleObject的对象
    private static SingleObject instance = new SingleObject();

    //构造方法的私有化
    private SingleObject() {

    }

    //获取可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    //要被调用的方法
    public void showSomething() {
        System.out.println("这是要被调用的方法");
    }

}
