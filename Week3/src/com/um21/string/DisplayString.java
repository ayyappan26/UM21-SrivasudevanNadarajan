package com.um21.string;

public class DisplayString {

	public static void main(String[] args) {
		String str="Welcome to Java Program";
		System.out.println(str.charAt(5));
		String str2="Welcome";
		System.out.println(str.compareTo(str2));
		String str3=str.concat("- Let us learn");
		System.out.println(str3);
		int index=str.indexOf('a');
		System.out.println(index);
		System.out.println(str.replace('a','e'));
		System.out.println(str.substring(4,10));
		System.out.println(str.toLowerCase());
		
	}

}
