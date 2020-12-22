package com.example.anabstract;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }

        return null;
    }
}
