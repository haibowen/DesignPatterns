package com.example.builderdesigin;

public class MyClass {

    public static void main(String[] args) {
        Builder builder=new MacBookBuilder();
        Director director=new Director(builder);
        director.construct("因特尔主板","Retina显示屏");

        Computer computer=builder.build();
        System.out.println(computer.toString());

    }
}