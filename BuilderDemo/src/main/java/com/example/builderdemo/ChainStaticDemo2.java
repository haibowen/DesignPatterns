package com.example.builderdemo;

/**
 * Created on 1/10/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public class ChainStaticDemo2 {
    /**
     * 链式调用静态方法
     */
    public static ChainStaticDemo2 test() {
        System.out.println("这是返回为null的 test方法");
        return null;
    }

    public static ChainStaticDemo2 test2() {
        System.out.println("这是返回null的test2");
        return null;
    }
}
