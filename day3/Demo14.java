package com.uday.day3;


/**
 * Abstraction
 * > One of the main pillar of the OOPs
 * > A class which declare with abstract keyword is know as abstract class
 * > Abstract class can contain abstract as well as non abstract method
 * > Abstract method are method without the method body
 * > Only the abstract class can contain the abstract methods
 * > Abstract class consider as incomplete hence we cannot able to create instance of the abstract class
 * > Abstract class can always be super class
 * > The class which derived from the abstract class responsable to provide the implementation of all abstract methods
 * > A non abstrac class derived from the abstract class must provide the implementation of all abstract method
 * > Abstract method cannot have body or implementation and we try to do so it will be an compile time error
 * > Only abstract class can contain abstract method
 *
 * */

abstract class AbstractClassDemo{
    public void addNumber(int num1, int num2){
        System.out.println("Sum : "+ (num1+ num2));
    }

    public void subNumber(int num1, int num2){
        System.out.println("Sub : "+ (num1- num2));
    }

    public abstract void mulNumber(int num1, int num2);
    public abstract void divNumber(int num1, int num2);

}

class ChildDemo extends AbstractClassDemo{

    @Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Mul: "+ (num1 * num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Div: "+ (num1 / num2));
    }
}

public class Demo14 {
    public static void main(String[] args) {
        ChildDemo obj = new ChildDemo();
        obj.addNumber(20,10);
        obj.subNumber(20,10);
        obj.mulNumber(20,10);
        obj.divNumber(20,10);
    }
}