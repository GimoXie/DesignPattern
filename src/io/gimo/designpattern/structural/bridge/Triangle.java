package io.gimo.designpattern.structural.bridge;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println(getColor().tinting() + "三角形");
    }
}
