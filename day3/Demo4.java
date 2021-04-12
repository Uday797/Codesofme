package com.uday.day3;

class Car{
    public String brand;
    public String name;
    public String model;
    public String engineType;
    public int price;

    public Car(String brand, String name, String model, String engineType, int price){
        this.brand = brand;
        this.name= name;
        this.model = model;
        this.engineType = engineType;
        this.price = price;
    }

    public Car(Car carObj, int price){
        this.brand = carObj.brand;
        this.name= carObj.name;
        this.model = carObj.model;
        this.engineType = carObj.engineType;
        this.price = price;
    }
}


public class Demo4 {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A4", "2020", "Petrol", 10000);
		Car car2 = new Car(car1, 20000);
        System.out.println(car2);
    }
    
}
