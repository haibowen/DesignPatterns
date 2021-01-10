package com.example.builderdemo;

public class MyClass {

    public static void main(String[] args) {
        //测试 链式调用
        Student.builder().setAge(20).setGrade("九").setName("hyplo").setNumber(201542586).showMessage();
        System.out.println(getStudentDescription());
        MyClass myClass = new MyClass();
        myClass.test();

        //测试 非内部类
        ChainDemo.builder().setName("test111").setNum(123);
        System.out.println(ChainDemo.builder().getName() + ChainDemo.builder().getNum() + "测试测试测试");
        System.out.println(ChainDemo.builder().getName() + ChainDemo.builder().getNum());

        //测试调用 静态调用
        ChainStaticDemo.test().test2();

        //测试 调用 静态方法的链式调用
        ChainStaticDemo2.test().test2();

    }

    public static String getStudentDescription() {

        return Student.builder().getName();
    }

    public void test() {
        System.out.println("这是测试" + Student.builder().number);

    }
}