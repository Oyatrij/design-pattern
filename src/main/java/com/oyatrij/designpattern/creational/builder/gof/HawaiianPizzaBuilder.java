package com.oyatrij.designpattern.creational.builder.gof;

public class HawaiianPizzaBuilder implements PizzaBuilder{
    Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildDough() {

    }

    @Override
    public void buildSauce() {

    }

    @Override
    public void buildTopping() {

    }

    @Override
    public Pizza getPizza() {
        return null;
    }
}
