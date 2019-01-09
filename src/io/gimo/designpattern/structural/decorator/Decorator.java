package io.gimo.designpattern.structural.decorator;

/**
 * Created by zmxie on 2019/1/2.
 */
class Decorator implements Component {

    private Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        System.out.println("Decorator::method");
        component.method();
    }
}
