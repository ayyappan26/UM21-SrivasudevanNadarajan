package com.ultamain.u21.basics;



public class Test {
	public static void main(String args[])
	{
	  Laptop myLaptop=new Laptop();
		myLaptop.setcompanyName("Lenovo");
		myLaptop.setprocessorType("Intel i5"); 
		myLaptop.setramSize("4GB");
		myLaptop.setpurchaseYear(2020);
		Display dis=new Display();
		dis.displayLaptopDetails(myLaptop);
		
	}

}
