package io.gimo.designpattern.structural.bridge;

public abstract class Shape {
    private Color color;

    public abstract void draw();

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
