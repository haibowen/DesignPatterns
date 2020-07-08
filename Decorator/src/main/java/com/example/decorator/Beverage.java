package com.example.decorator;


//所有饮料的基类
public abstract class Beverage {

  public   String description = "Unknown Beverage";

    public String getDescription() {

        return description;
    }

    public abstract double cost();


}
