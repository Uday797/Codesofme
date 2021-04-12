package com.uday.day3;

/**
 * Constructor Overloading
 *
 * **/
class Student{
    public int id;
    public String name;
    public String email;

    public Student(){

    }

    public Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

public class Demo5 {
    public static void main(String[] args) {
       
		Student student = new Student(797, "Uday", "rallapalliuck007@gmail.com");

        Student student1 = new Student();
        student1.id = 179;
        student1.name = "Krishna";
        student1.email = "krishna007@gmail.com";
        
    }
    
}