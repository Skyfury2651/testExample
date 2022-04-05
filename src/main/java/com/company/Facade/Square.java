package main.java.com.company.Facade;

public class Square implements IShape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}