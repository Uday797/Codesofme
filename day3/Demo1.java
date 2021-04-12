package com.uday.day3;


	/**
	 * Class
	 * When we define a class we define a blue print for data type
	 * this does not actually mean any data but it does define what the class name means
	 * what class consist of what operation can be performed on object
	 * The method and variables that consitute a class are called as members of the class
	 *
	 * Define a class
	 * <access modifier> class <class Name>{
	 *      // member variable
	 *     <access modifier> <data_type> <variable_name>
	 *      // member function
	 *     <access modifier> <return type> <method_name>(parameter){
	 *         // body
	 *     }
	 * }
	 * access modifier specify the access rule for member as well as class by default it is default and for members it is private
	 * data type specify the type of variable and return type specify the data type of the method return rules
	 * to access the class members we use (.) operator
	 *
	 * Java is case sensitive
	 * Every line should end with semicolon
	 * main is main entry point for you java program
	 *
	 * DRY - Do not Repeat Yourself
	 *
	 * */

	class Book{
	  private String title;
	  private String author;
	  private int price;

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public void print(){
	      System.out.println("Book: Title="+ title+", Author="+ author+", Price="+ price);
	  }

	}

	public class Demo1 {
	    public static void main(String[] args) {
//	        Book bookObj = new Book();
//	        bookObj.title = "Divine Writings";
//	        bookObj.author = "Uday";
//	        bookObj.price = 122.2;
	//
//	        Book bookObj2 = new Book();
//	        bookObj2.title = "Divine Writings2";
//	        bookObj2.author = "Uday";
//	        bookObj2.price = 221.2;

	        // System.out.println("Book: Title="+ bookObj.title+", Author="+ bookObj.author+", Price="+ bookObj.price);
	        //System.out.println("Book: Title="+ bookObj2.title+", Author="+ bookObj2.author+", Price="+ bookObj2.price);


	        Book bookObj = new Book();
	        bookObj.setTitle("Divine Writings");
	        bookObj.setAuthor("Uday");
	        bookObj.setPrice(122);

	        Book bookObj2 = new Book();
	        bookObj2.setTitle("Divine Writings2");
	        bookObj2.setAuthor("Uday");
	        bookObj2.setPrice(221);


	        bookObj.print();
	        bookObj2.print();

	    }
	}

