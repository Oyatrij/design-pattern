package com.oyatrij.designpattern.creational.payment;


public class PaymentFactoryImpl implements PaymentFactory {
    @Override
    public Payment createPayment(String paymentType) {
        return switch (paymentType) {
            case "credit" -> new CreditPayment();
            case "paypal" -> new PaypalPayment();
            default -> throw new RuntimeException("unKnown type");
        };
    }
}

