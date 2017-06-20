package com.dataprovider.test;

public class PrimeNo {
public Boolean testPrimeNo(int number){
	for(int i=2; i<=number; i++){
		if (number % 2 == 0){
			System.out.println("false");
			return false;
			
		}
	}
	System.out.println("true");
	return true;
}
}
