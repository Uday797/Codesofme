package com.uday.day3;


/**
 * Final
 * > The final keyword in java is used to restrict user
 * > The final keyword can be use in many context
 * 1. variable
 * 2. method
 * 3. class
 *
 * When we use final keyword with variable it become constant means its value cannot be changed
 * When we use final keyword with parent class method the child class cannot override that method
 * When we use final keyword with class no other class can able to inherit from the class
 *
 * */

class FinalDemo{
    int a =10;
    final int b;

    public FinalDemo(){
        b = 20;
    }


    public void changeVariable(int a){
        this.a = a;
    }

    public void changeVariableFinal(int b){
        //this.b = b;
    }

    public void parentNotFinalMethod(){
        System.out.println("Parent non final method");
    }

    public final void parentFinalMethod(){
        System.out.println("Parent final method");
    }
}

class FinalChildDemo extends FinalDemo{
    @Override
    public void parentNotFinalMethod() {
        System.out.println("child non final method");
    }


}

public class Demo13 {
    public static void main(String[] args) {
    	
    }
}