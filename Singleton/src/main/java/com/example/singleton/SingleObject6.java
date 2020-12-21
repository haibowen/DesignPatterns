package com.example.singleton;

/**
 * 登记式 静态内部类
 * 跟双重检查的机制 一样
 * 但是现实更简单
 */

public class SingleObject6 {

    private static class SingleHolder {
        private static final SingleObject6 INSTANCE = new SingleObject6();

    }

    ;

    //构造方法的私有化
    private SingleObject6() {

    }

    //获取去实现
    public static final SingleObject6 getInstance() {
        return SingleHolder.INSTANCE;

    }

    //调用方法
    public static void showSomething6() {
        System.out.println("这是登记式的静态内部类的实现方法");
    }

}
