package com.oyatrij.designpattern.creational.factory_method.payment.factory;

import com.oyatrij.designpattern.creational.factory_method.payment.CreditPayment;

public class CreditPaymentFactoryImpl implements CreditPaymentFactory {
    @Override
    public CreditPayment createPayment() {
        return new CreditPayment();
    }
}
