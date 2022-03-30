package com.company.Facade;

public class ShapeMaker {
    private IShape circle;
    private IShape rectangle;
    private IShape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        // do complex thing do handle draw
        circle.draw();
    }

    public void drawRectangle() {
        // do complex thing do handle draw
        rectangle.draw();
    }

    public void drawSquare() {
        // do complex thing do handle draw
        square.draw();
    }
}
