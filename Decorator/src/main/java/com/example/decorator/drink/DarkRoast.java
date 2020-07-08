package com.example.decorator.drink;

import com.example.decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description="DarkRoast";
    }

    @Override
    public double cost() {
        return 2.20;
    }
}
