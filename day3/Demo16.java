package com.uday.day3;

abstract class A1{
    abstract void test1();
}

abstract class A2 extends A1{
    abstract void test2();
}

abstract class A3 extends A2{
    abstract void test3();
}

class DemoChild extends A3{

    @Override
    void test1() {

    }

    @Override
    void test2() {

    }

    @Override
    void test3() {

    }
}



public class Demo16 {
    public static void main(String[] args) {

    }
}
