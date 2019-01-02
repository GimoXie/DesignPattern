package io.gimo.designpattern.structural.decorator;

/**
 * Created by zmxie on 2019/1/2.
 */
class Client {

    public static void main(String[] args) {
        Sourceable source = new Decorator(new Source());
        source.method();
    }
}
