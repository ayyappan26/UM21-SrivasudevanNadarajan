package com.um21.string;

public class DisplayStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This is StringBuffer");
		System.out.println(sb.append("- This is a sample program"));
		System.out.println(sb.insert(21,"Object"));
		System.out.println(sb.reverse());
		sb.reverse();
		System.out.println(sb.replace(14,20,"Builder"));
	}

}
