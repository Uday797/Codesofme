package com.uday.day3;

class Parent2{
    public void test1(){
        System.out.println("Parent test 1");
    }
}

class Child2 extends Parent2{
    public void test1(int a){
        System.out.println("Child test 2");
    }
}

public class Demo11 {
    public static void main(String[] args) {
        Child2 child = new Child2();
        child.test1();
        child.test1(10);

    }
}
