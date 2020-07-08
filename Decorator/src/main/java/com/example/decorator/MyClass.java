package com.example.decorator;

public class MyClass {
    public static void main(String[] args) {


        // 制造一个Espresso 对象
        // 不要调料
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        //制造一个DarkRoast对象
        //要调料
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);//装饰
        beverage1 = new Mocha(beverage1);//装饰
        beverage1 = new Whip(beverage1);//装饰
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

        //制造一个HouseBlend
        //要调料
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);//装饰
        beverage2 = new Mocha(beverage2);//装饰
        beverage2 = new Whip(beverage2);//装饰
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());


    }

}