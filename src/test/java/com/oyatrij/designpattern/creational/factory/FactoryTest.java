package com.oyatrij.designpattern.creational.factory;

import com.oyatrij.designpattern.creational.payment.PaymentFactoryImpl;
import com.oyatrij.designpattern.creational.payment.Payment;
import com.oyatrij.designpattern.creational.payment.PaymentFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    @Test
    void paymentFactoryTest() {
        /*결제 시스템
        결제 방식: 신용카드, 페이팔, 계좌이체, 카카오페이
        각각의 결제 방식은 '결제하기' 기능을 가짐*/
        //given
        PaymentFactory paymentFactoryImpl = new PaymentFactoryImpl();
        
        //when
        Payment creditPayment = paymentFactoryImpl.createPayment("credit");

        //then
        assertInstanceOf(Payment.class, creditPayment);
    }
}
