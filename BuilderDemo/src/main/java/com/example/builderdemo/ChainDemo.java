package com.example.builderdemo;

/**
 * Created on 1/10/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public class ChainDemo {

    /**
     * 非静态方法的
     * 链式调用的使用
     */
    private int num;
    private String name;
    private static ChainDemo chainDemo;


    public ChainDemo() {

    }

    public static ChainDemo builder() {

        if (chainDemo == null) {
            chainDemo = new ChainDemo();

        }
        return chainDemo;
    }

    public int getNum() {
        return num;
    }

    public ChainDemo setNum(int num) {
        this.num = num;
        return this;
    }

    public String getName() {
        return name;
    }

    public ChainDemo setName(String name) {
        this.name = name;
        return this;
    }
}
