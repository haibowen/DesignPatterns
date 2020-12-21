package com.example.proxypattern;

/**
 * 静态代理的实现
 * <p>
 * 静态代理的不好的地方是
 * <p>
 * 目标类跟 代理类是实现的同一个接口,当接口有变的时候，需要两处都要更改
 * <p>
 * 静态代理好的地方是
 * <p>
 * 可以实现对目标对象的不更改，并拓展其功能
 */
public class ProxyImage2 implements Image {

    //接口
    private Image image;

    public ProxyImage2(Image image) {
        this.image = image;
    }

    @Override
    public void display() {
        image.display();
    }
}
