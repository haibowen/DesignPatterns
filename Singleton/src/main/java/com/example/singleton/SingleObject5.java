package com.example.singleton;

/**
 * 双检锁 双重校验
 */
public class SingleObject5 {

    private static volatile SingleObject5 instance;

    //构造方法私有化
    private SingleObject5() {

    }

    //构造该 实例
    public static SingleObject5 getInstance() {

        if (null == instance) {
            synchronized (SingleObject5.class) {
                instance = new SingleObject5();
            }
        }
        return instance;
    }

    //调用该方法
    public static void showSomething5() {
        System.out.println("这是双重检查的单例实现方式");
    }
}
