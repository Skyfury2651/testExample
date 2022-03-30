package com.company.Facade;

public class Circle implements IShape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}