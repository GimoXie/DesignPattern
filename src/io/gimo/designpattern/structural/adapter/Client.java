package io.gimo.designpattern.structural.adapter;

public class Client {

    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.method1();
        adapter.method2();
    }
}
