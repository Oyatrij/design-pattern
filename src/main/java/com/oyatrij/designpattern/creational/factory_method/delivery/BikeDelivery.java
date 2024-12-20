package com.oyatrij.designpattern.creational.factory_method.delivery;

public class BikeDelivery implements Delivery{
    @Override
    public int calculateDeliveryFee() {
        return 5000;
    }
}
