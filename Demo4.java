package com.uday;

public class Demo4 {
	public static void main(String[] args) {
		

	    for (int i = 1; i <= 5; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
		}
	    int rows = 5;

	    for (int i = rows; i >= 1; --i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	    int i, j, row = 5;        
	  for (i=0; i<row; i++)   
	  {        
	  for (j=2*(row-i); j>=0; j--)         
	  {      
	  System.out.print(" ");   
	  }   
	  for (j=0; j<=i; j++ )   
	  {      
	  System.out.print("* ");   
	  }   
	  System.out.println();   
	  }  
	        
	 
	for (int a=0; a<5; a++)   
	{  
	     
	for (int b=row-i; b>1; b--)   
	{  
	  
	System.out.print(" ");   
	}   
	 
	for (int b=0; b<=i; b++ )   
	{   
	    
	System.out.print("* ");   
	}   
	 
	System.out.println();   
	}   
	     
	}

}
