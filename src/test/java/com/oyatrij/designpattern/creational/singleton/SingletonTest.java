package com.oyatrij.designpattern.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;


public class SingletonTest {

    @Test
    void singletonInstanceShouldBeSame() {
        //Given
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        //Then
        assertSame(singleton, singleton2, "Singleton instances should be same");
    }
}
