package io.gimo.designpattern.structural.bridge;

public class Square extends Shape {
    @Override
    public void draw() {
        getColor().tinting("正方形");
    }
}
