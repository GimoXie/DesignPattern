package io.gimo.designpattern.structural.bridge;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println(getColor().tinting() + "正方形");
    }
}
