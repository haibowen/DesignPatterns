package com.example.anabstract;

public class MyClass {

    public static void main(String[] args) {

        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        //获取形状为 Circle的对象
        Shape shape = shapeFactory.getShape("CIRCLE");
        //调用Circle 的draw方法
        shape.draw();
//        //获取形状为Rectangle 的对象
//        Shape shape1=shapeFactory.getShape("RECTANGLE");
//        //rectangle
//        shape1.draw();

        AbstractFactory factoryColor = FactoryProducer.getFactory("COLOR");
        //获取颜色为red的对象
        Color color = factoryColor.getColor("RED");
        color.fill();

    }
}