package com.example.singleton;

public class MyClass {

    public static void main(String[] args) {

        SingleObject.getInstance().showSomething();

        SingleObject2.getInstance().showSomething2();
        SingleObject3.getInstance().showSomething3();
        SingleObject4.getInstance().showSomething4();
        SingleObject5.getInstance().showSomething5();
        SingleObject6.getInstance().showSomething6();
        SingleObject7.INSTANCE.whateverMethod();
        SingleObject7.SingleObject8.INSTANCE.somethingShow();
    }
}