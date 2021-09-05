package com.um21.collectionpractice;

public class CountryMapTest {

	public static void main(String[] args) 
	{
		CountryMap countryMap =new CountryMap();
		countryMap.storeCountryCaptial("India", "Delhi");
		countryMap.storeCountryCaptial("Japan","Tokyo");
		System.out.println(countryMap.retrieveCapital("India"));
		System.out.println(countryMap.retrieveCountry("Delhi"));
		System.out.println(countryMap.retrieveCountry("Tokyo"));
	}

}
