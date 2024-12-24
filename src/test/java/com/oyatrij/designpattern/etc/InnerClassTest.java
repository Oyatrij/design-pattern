package com.oyatrij.designpattern.etc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InnerClassTest {
    @Test
    void nonStaticInnerClass_RequiresOuterClassInstance() {
        // given
        OuterClass outerClass = new OuterClass();

        // when & then
        // 1. 외부 클래스 인스턴스를 통한 생성
        OuterClass.NonStaticInner inner1 = outerClass.new NonStaticInner();
        assertNotNull(inner1);

        // 2. 체이닝을 통한 생성
        OuterClass.NonStaticInner inner2 = new OuterClass().new NonStaticInner();
        assertNotNull(inner2);
        assertInstanceOf(OuterClass.NonStaticInner.class, inner2);
    }
}
