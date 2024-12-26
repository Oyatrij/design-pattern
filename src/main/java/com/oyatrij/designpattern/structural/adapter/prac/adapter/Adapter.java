package com.oyatrij.designpattern.structural.adapter.prac.adapter;

public class Adapter implements Target{
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doSomething() {
        adaptee.performAction();
    }
}