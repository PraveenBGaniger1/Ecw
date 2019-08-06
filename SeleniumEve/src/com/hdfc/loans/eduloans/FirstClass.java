package com.hdfc.loans.eduloans;



public class FirstClass 
{
	int a=10,b=20,c; // properties
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition of A and B is: "+c  );
		
	}
	
	public void subtract()
	{
		c=b-a;
		System.out.println("Subtraction of A and B is : "+ c);
	}

	public static void main(String[] args) 
	{

		FirstClass obj=new FirstClass();
		obj.add();
		obj.subtract();
		
		


	}

}
