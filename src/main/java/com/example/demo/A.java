package com.example.demo;

public class A {

    public void mA1() {
        C c = new C();
        new B().mB1();
        c.mC1();
    }
    public void mA2() {
        new B().mB2();
        new C().mC2();
    }
    public void mA3() {
        B b = new B();
        b.mB3();
        new C().mC3();
    }
    public void mA4() {
        new C().mC4();
    }
    public void mA5() {
        new C().mC5();
    }
}
