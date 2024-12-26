package com.oyatrij.designpattern.structural.adapter.prac.adapter;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.doSomething();
    }
}
