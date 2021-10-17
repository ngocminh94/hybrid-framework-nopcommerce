package javaBasic;

import java.util.Iterator;

import org.testng.Assert;

public class Topic_04_Operator {

	public static void main(String[] args) {
		int number = 10;
		
		// number = number + 5 = 10+5=15
		// number += 5;
		// System.out.println(number);
		
		// number=15/5=3 --> lấy phần nguyên = 3
		// System.out.println(number / 5);
		
		// 15%7 = 2 dư 1 --> lấy phần dư = 1
		// System.out.println(number % 7);
		
		
		System.out.println(number++);
		// In number ra trước: 10
		// ++ = tăng number lên 1 = 11
		
		System.out.println(++number);
		// ++ trước: tăng number lên 1 = 12
		// In number ra: 12
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);		
		}
		
		Assert.assertTrue(5 < 6);
		String address = "HCM";
		
		if (address != "HN") {
			System.out.println("Not same address");			
		}
		
		if (address != "HN" && address != "Da nang") {
			System.out.println("Not same address");			
		}	
		
		if (!(address == "HN")) {
			System.out.println("Not same address");			
		}
		
		// Biểu thức tam nguyên - 3 dấu
		boolean status = (address == "HN") ? true : false;
		System.out.println(status);
		
	}

}
