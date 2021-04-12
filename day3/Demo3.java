package com.uday.day3;

/**
 * Constructors
 * > It is a special method present under a class responsable for initializing the member variables of class
 * > The name of a constructor is exactly the same name of the class in which it was present
 * > Each and every class require constructor if we want to create the instance of that class
 * > It is a responsibility of a programmer to define a constructor but if he fail than on behalf of the programmer
 *   compiler will create a constructor and these constructor are known as implicit constructor
 * > Implicit constructor are also known as default constructor and they are always parameter less
 * > Implicit constructor are define public
 * > we can also define constructor under the class these constructor are called explicit constructor and can be
 *   parameter less or with parameter
 * > A class can have more then one constructor which is know as constructor overloading
 *
 * # Type of Constructor
 * 1. Default or Parameterless Constructor
 * 2. Paramterized constructor
 * 3. Copy constructor
 * 4. Static constructor
 *
 * Default constructor does not take any parameters and can be defined by programmer or else will be define implicitly by compiler
 *
 * Parameterized constructor is define with any parameter and these constructor can only be define by programmer only and never define implicitly
 *
 * Copy constructor is to create multiple instance with the same values then we can use copy constructor. In a copy constructor
 * the constructor takes the same values as a parameters to it
 * */
class Test{
    // Implicit Constructor
    public Test(){

    }
}

class Test2{
    // parameterized
    public Test2(int x, int y){

    }
}

class Test3{
    int a, b,c,d;

    public Test3(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Test3(Test3 obj){
        this.a = obj.a;
        this.b = obj.b;
        this.c = obj.c;
        this.d = obj.d;
    }
}



public class Demo3 {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        Test testObj = new Test();

        Test2 test2Obj = new Test2(10,20);

        Test3 test3Obj = new Test3(10,20,30,40);
        Test3 test3Obj2 = new Test3(test3Obj);

        System.out.println(testObj);
    }
}