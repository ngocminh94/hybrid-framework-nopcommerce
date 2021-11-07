package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_Exercise {
	String courseName = "AutOmatiOn Testing Advanced 23";
	
	@Test
	public void TC_01() {
		char courseNameArr[] = courseName.toCharArray();
		int countUpper = 0;
		int countLower = 0;
		int countNumber = 0;
		
		for (char character : courseNameArr) {
			// Uppercase
			if (character <= 'Z' && character >= 'A') {
				countUpper++;
			}
			
			// Lowercase
			if (character <= 'z' && character >= 'a') {
				countLower++;
			}
			
			// Numer
			if (character <= '9' && character >= '0') {
				countNumber++;
			}
			
		}
		System.out.println("Tong so uppercase = " + countUpper);
		System.out.println("Tong so lowercase = " + countLower);
		System.out.println("Tong so lowercase = " + countNumber);
		
	}
	
	@Test
	public void TC_02() {
		char courseNameArr[] = courseName.toCharArray();
		int count = 0;
		for (char c : courseNameArr) {
			if (c == 'a') {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	@Test
	public void TC_03() {
		char courseNameArr[] = courseName.toCharArray();
		
		for (int i = courseNameArr.length - 1; i >= 0; i--) {
			System.out.println(courseNameArr[i]);
		}
		
	}

}
