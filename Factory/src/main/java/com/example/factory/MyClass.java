package com.example.factory;

public class MyClass {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("SQUARE").draw();
        // shapeFactory.getShape("").draw();


    }

}