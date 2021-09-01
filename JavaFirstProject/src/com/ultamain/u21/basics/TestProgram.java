package com.ultamain.u21.basics;
//import statements
public class TestProgram
{
	
	public int addNumbers (int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	public static void main(String args[]) {

		System.out.println("Welcome to java program");
		TestProgram t=new TestProgram();
		System.out.println(t.addNumbers(10,20));
		t=null;}}