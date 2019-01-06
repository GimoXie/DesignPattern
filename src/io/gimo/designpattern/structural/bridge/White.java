package io.gimo.designpattern.structural.bridge;

public class White implements Color {
    @Override
    public void tinting(String shape) {
        System.out.println("白色的" + shape);
    }
}
