package com.um21.collections;
import java.util.SortedSet;

public class UniqueCollectionTest {

	public static void main(String[] args) {
		String s2[]= {"Ram","Akash","Gunal","Raja","Ram","Harish","Dhanush","Raja"};
		UniqueCollection unique1=new UniqueCollection();
		System.out.println(unique1.getCollection(s2));

	}

}
