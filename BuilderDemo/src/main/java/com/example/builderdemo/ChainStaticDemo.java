package com.example.builderdemo;

/**
 * Created on 1/10/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public class ChainStaticDemo {

    /**
     * 对静态方法设置静态调用
     * 的事例
     */

    public static ChainStaticDemo chainStaticDemo = new ChainStaticDemo();

    public static ChainStaticDemo test() {
        System.out.println("做了一些必要的操作");
        return chainStaticDemo;
    }

    public static ChainStaticDemo test2() {
        System.out.println("这是第二个方法");
        return chainStaticDemo;
    }
}
