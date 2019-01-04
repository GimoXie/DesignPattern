package io.gimo.designpattern.structural.proxy;

/**
 * Created by zmxie on 2019/1/4.
 */
class RealSubject implements Subject{
    @Override
    public void method() {
        System.out.println("RealSubject::method");
    }
}
