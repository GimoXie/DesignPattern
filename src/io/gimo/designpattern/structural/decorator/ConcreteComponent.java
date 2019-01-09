package io.gimo.designpattern.structural.decorator;

/**
 * Created by zmxie on 2019/1/2.
 */
class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("Source::method");
    }
}
