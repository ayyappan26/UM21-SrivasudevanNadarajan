package com.um21.collectionpractice;
import java.util.ArrayList;
import java.util.List;
public class EvenNumbers
 {
     List<Integer> list1=new ArrayList();
     List<Integer> list2=new ArrayList();
     public List<Integer> storeEvenNumbers(int N)
     {
    	 for(int i=2;i<=N;i++)
    	 {
    		 if(i%2==0)
    		 {
    			 list1.add(i);
    		 }
    	 }
    	 return list1;
     }
     public List<Integer> printEvenNumbers()
     {
    	 for(int i=0;i<list1.size();i++)
    	 {
    		 list2.add(list1.get(i)*2);
    	 }
    	 return list2;
     }
     public int retrieveEvenNumber(int N)
     {
    	 for(int i=0;i<list1.size();i++)
    	 {
    		 if(list1.get(i)==N)
    		 {
    			 return N;
    		 }
    	 }
    	 return 0;
     }
}
