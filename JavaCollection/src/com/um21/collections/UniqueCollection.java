package com.um21.collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Sr
 *
 */
public class UniqueCollection {
	      public Set<String> getCollection(String [] s2)
	      {
	    	  Set<String> set1=new TreeSet<>();
	    	  Collections.addAll(set1,s2);
	    	 // Collections.sort(set1);
	    	  return set1;
	    	  
	      }

}
