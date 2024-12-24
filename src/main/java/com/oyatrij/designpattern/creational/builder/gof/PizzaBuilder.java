package com.oyatrij.designpattern.creational.builder.gof;

public interface PizzaBuilder {
    void buildDough();
    void buildSauce();
    void buildTopping();
    Pizza getPizza();
}
