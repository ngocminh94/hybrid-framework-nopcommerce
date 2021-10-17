package javaBasic;

import org.testng.annotations.Test;

public class Topic_04_Exercise {
	@Test
	public void TC_01_Age_After_15yrs() {
		int age = 20;
		int ageAfter = age + 15;
		String name = "Min";
		
		System.out.println("After 15 years, age of " + name + " will be " + ageAfter);
	}
	
	@Test
	public void TC_02_swapNumber() {
		int a = 5;
		int b = 6;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);	
	}
	
	@Test
	public void TC_03_Compare() {
		int a = 1;
		int b = 4;
		
		boolean compareResult = (a > b) ? true : false;
		System.out.println(compareResult);
	}
}
