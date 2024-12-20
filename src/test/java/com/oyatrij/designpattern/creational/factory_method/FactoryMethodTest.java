package com.oyatrij.designpattern.creational.factory_method;

import com.oyatrij.designpattern.creational.factory_method.delivery.BikeDelivery;
import com.oyatrij.designpattern.creational.factory_method.delivery.BikeDeliveryFactory;
import com.oyatrij.designpattern.creational.factory_method.delivery.Delivery;
import com.oyatrij.designpattern.creational.factory_method.delivery.DeliveryFactory;
import com.oyatrij.designpattern.creational.factory_method.shape.Circle;
import com.oyatrij.designpattern.creational.factory_method.shape.Shape;
import com.oyatrij.designpattern.creational.factory_method.shape.ShapeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryMethodTest {
    @Test
    void shouldCreateCircle() {
        //Given
        ShapeFactory factory = new ShapeFactory();

        //When
        Shape shape = factory.createShape("circle");

        //Then
        assertInstanceOf(Circle.class, shape);
    }

    @Test
    void createBikeDelivery() {
        //Given
        DeliveryFactory bikeFactory = new BikeDeliveryFactory();

        //When
        Delivery delivery = bikeFactory.createDelivery();

        //Then
        assertInstanceOf(BikeDelivery.class, delivery);
        assertEquals(5000, delivery.calculateDeliveryFee());
    }
}

