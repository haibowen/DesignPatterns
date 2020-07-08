package com.example.decorator.souce;

import com.example.decorator.Beverage;
import com.example.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";

    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
