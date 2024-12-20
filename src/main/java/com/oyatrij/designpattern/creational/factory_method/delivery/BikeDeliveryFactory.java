package com.oyatrij.designpattern.creational.factory_method.delivery;

public class BikeDeliveryFactory implements DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new BikeDelivery();
    }
}
