package io.gimo.designpattern.structural.bridge;

public class Black implements Color {
    @Override
    public void tinting(String shape) {
        System.out.println("黑色的" + shape);
    }
}
