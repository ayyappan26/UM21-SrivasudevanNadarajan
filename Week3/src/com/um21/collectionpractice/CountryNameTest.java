package com.um21.collectionpractice;

public class CountryNameTest {

	public static void main(String[] args) {
		  CountryName cn=new CountryName();
		  cn.storeCountryNames("India");
		  cn.storeCountryNames("USA");
		  cn.storeCountryNames("Germany");
		  cn.storeCountryNames("UK");
		  cn.storeCountryNames("France");
		  System.out.println(cn.storeCountryNames("Canada"));
		  System.out.println(cn.retrieveCountry("India"));
	}

}
