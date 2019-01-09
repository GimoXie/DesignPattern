package io.gimo.designpattern.structural.proxy;

/**
 * Created by zmxie on 2019/1/4.
 */
class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy(new ConcreteSubject());
        subject.method();
    }
}
