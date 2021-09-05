package com.um21.collectionpractice;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class CountryName 
{
   Set<String> country=new HashSet();
   public Set<String> storeCountryNames(String CountryName)
   {
	   country.add(CountryName);
	   return country;
   }
   public String retrieveCountry(String CountryName)
   {
	   List<String> count=new ArrayList(country);
	   for(int i=0;i<country.size();i++)
	   {
		   if(count.get(i).equals(CountryName));
		   {
			   return CountryName;
		   }
	   }
	   return null;
   }
}
