package com.oyatrij.designpattern.creational.factory_method.shape;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public void reSize() {
        System.out.println("Circle resize");
    }
}
