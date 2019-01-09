package io.gimo.designpattern.structural.bridge;

public class Client {

    public static void main(String[] args) {
        Shape square = new Square();
        square.setColor(new White());
        square.draw();

        Shape triangle = new Triangle();
        triangle.setColor(new Black());
        triangle.draw();
    }
}
