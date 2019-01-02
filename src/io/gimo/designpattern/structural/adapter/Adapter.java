package io.gimo.designpattern.structural.adapter;

class Adapter implements Target {

    /**
     * Adaptee也可以通过继承的方式被扩展进来
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is new method");
    }
}
