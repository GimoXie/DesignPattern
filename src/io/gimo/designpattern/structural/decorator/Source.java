package io.gimo.designpattern.structural.decorator;

/**
 * Created by zmxie on 2019/1/2.
 */
class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("Source::method");
    }
}
