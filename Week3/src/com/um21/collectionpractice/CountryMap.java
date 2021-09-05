package com.um21.collectionpractice;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class CountryMap
{
		HashMap<String,String> countryMap = new HashMap<>();
		public HashMap<String,String> storeCountryCaptial(String countryName, String countryCapital)
		{
			countryMap.put(countryName, countryCapital);
			return countryMap;
		}
		
		public String retrieveCapital(String countryName)
		{
			if(countryMap.containsKey(countryName))
			{
				return countryMap.get(countryName);
			}
			return null;
		}

		public String retrieveCountry(String captialName)
		{
			for(Entry<String, String> list: countryMap.entrySet())
			{
				if(list.getValue() == captialName) 
				{
					return list.getKey();
				}
			}
			return null;
		}
	}
		
