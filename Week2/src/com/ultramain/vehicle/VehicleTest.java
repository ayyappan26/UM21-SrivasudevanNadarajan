package com.ultramain.vehicle;


public class VehicleTest 
{
	public static void main(String args[]) 
	  {
              Bike b= new Bike();
              b.printBrand("TATA");
              b.printBrand("MARUTI",2020);
	  }
}
	 class Bus
	  {
		 public Bus()
		  {
			  System.out.println("Bus has diesel engine");
		  }
	  }
	   class Car extends Bus
	  {
		  public Car()
		  {
			  System.out.println("Car has both petrol and diesel engines");
		  }
		  public void printBrand(String str)
		  {
			  System.out.println("The car brand is "+str);
		  }
		  public void printBrand(String str,int year)
		  {
			  System.out.println("The car Brand is "+str+" And making year "+year);
		  }
	  }
	  class Bike extends Car
	  {
		  public Bike()
		  {
			  System.out.println("Bike has petrol engine");
		  }
	  }
