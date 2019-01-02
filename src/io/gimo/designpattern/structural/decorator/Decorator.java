package io.gimo.designpattern.structural.decorator;

/**
 * Created by zmxie on 2019/1/2.
 */
class Decorator implements Sourceable {

    private Sourceable source;

    Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("Decorator::method");
        source.method();
    }
}
