package com.example.proxypattern;

public class MyClass {

    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("hyplo");
        proxyImage.display();

        Image image=new ProxyImage("test");
        image.display();

        RealImage realImage=new RealImage("flutter");
        ProxyImage2 proxyImage2=new ProxyImage2(realImage);
        proxyImage2.display();

        //目标对象
        Image proxyImage1=new ProxyImage("Android");
        System.out.println(proxyImage1.getClass());

        //给目标对象 创建代理对象
        Image proxy= (Image) new ProxyImageFactory(proxyImage1).getProxyInstance();
        System.out.println("下面的是测试的结果===============》");
        proxy.display();

    }
}