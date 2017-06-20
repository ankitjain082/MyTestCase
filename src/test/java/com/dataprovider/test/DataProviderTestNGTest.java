package com.dataprovider.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNGTest {
private PrimeNo prime;


@BeforeMethod
public void initialize(){
	prime=new PrimeNo();
}
@DataProvider (name="test1")
public static Object [] [] verifyPrimeNo(){
	return new Object [][]{{2,true},{6,false},{7,true},{10,false},{17,true}};
}
@Test (dataProvider= "test1")
public void primeNO(int i, Boolean result){
System.out.println("GivenNo is  " + i + " result is " + result );	
//System.out.println(((PrimeNo) pn).testPrimeNo(i));
Assert.assertEquals(result, new PrimeNo().testPrimeNo(i),"Number not matching"+result+" "+prime.testPrimeNo(i));
}
}
