package com.um21.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListManager{


	    public ArrayList<String> removeElements(ArrayList arr1,ArrayList arr2)
	    {
	        arr1.retainAll(arr2);
	        return arr1;
	    } 
	    public ArrayList<String> getArrayList(String []s1)
	    {
	    	ArrayList<String> arr3=new ArrayList();
	    	Collections.addAll(arr3,s1);
	    	Collections.sort(arr3);
	    	return arr3;
	    }
}

