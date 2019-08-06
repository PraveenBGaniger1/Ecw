package com.hdfc.loans.eduloans;

public interface Rbi 
{
	public void withdraw();
	public void deposit();
	
	
	public static void main(String[] args) 
	{
		
		Rbi i;
		
		i=new Hdfc();
		i.withdraw();
		i.deposit();
		
	}

}
