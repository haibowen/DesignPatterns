package com.example.singleton;

/**
 * 单例的
 * 最简洁的实现方式
 */
public enum SingleObject7 {

    INSTANCE;

    public void whateverMethod() {
        System.out.println("这是枚举实现的单例");

    }


    /**
     * 枚举的形式现实内部类
     */
    public enum SingleObject8 {
        INSTANCE;

        public void somethingShow() {

            System.out.println("这是枚举的实现2");
        }
    }
}

