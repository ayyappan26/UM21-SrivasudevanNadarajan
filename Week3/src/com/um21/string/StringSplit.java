package com.um21.string;
public class StringSplit {

	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		System.out.println("Drive:"+ sb.substring(0,3));
		System.out.println("Folders:"+ sb.substring(3,18).replace('\\','|'));
		System.out.println("File:"+ sb.substring(19,31));
	}

}
