package com.example.decorator;


//所有配料的基类
public abstract  class CondimentDecorator extends Beverage{

    //所有的调料装饰者都得实现该方法
    public abstract String getDescription();



}
