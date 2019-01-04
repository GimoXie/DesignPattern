package io.gimo.designpattern.structural.proxy;

/**
 * Created by zmxie on 2019/1/4.
 */
class Proxy implements Subject {

    private RealSubject subject;

    /**
     * 此处体现与装饰模式的区别
     * 装饰模式可以传入任意该接口的实现类
     * 代理模式只能传入具体的一个实现类
     * @param subject
     */
    public Proxy(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void method() {
        System.out.println("Proxy start...");
        subject.method();
        System.out.println("Proxy end...");
    }
}
