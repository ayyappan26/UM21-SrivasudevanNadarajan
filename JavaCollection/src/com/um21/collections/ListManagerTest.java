package com.um21.collections;
import java.util.ArrayList;

import com.um21.collections.*;

public class ListManagerTest {

	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList();
		arr1.add("Maruti");
		arr1.add("Honda");
		arr1.add("Tata");
		arr1.add("Ford");
		arr1.add("BMW");
		arr1.add("Mahindra");
		System.out.println("List 1 :"+arr1);
		ArrayList<String> arr2=new ArrayList();
		arr2.add("Maruti");
		arr2.add("Ford");
	    arr2.add("Mahindra");
	    arr2.add("Tata");
	    System.out.println("List 2: "+arr2);
	    String s1[]= {"Car","Bike","Bus","Van","Auto"};
		ListManager lm=new ListManager();
		System.out.println("After removing non-occurance elements: "+lm.removeElements(arr1,arr2));
		System.out.println("The sorted arraylist: "+lm.getArrayList(s1));
	}

}
