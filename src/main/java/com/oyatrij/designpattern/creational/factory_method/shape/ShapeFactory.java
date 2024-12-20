package com.oyatrij.designpattern.creational.factory_method.shape;

public class ShapeFactory {
    public Shape createShape(String circle) {
        if ("circle".equals(circle)) return new Circle();
        throw new IllegalArgumentException("unKnown shape");
    }
}
