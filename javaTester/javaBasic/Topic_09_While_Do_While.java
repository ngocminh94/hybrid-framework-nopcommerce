package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_09_While_Do_While {
	Scanner scanner = new Scanner(System.in);
	
	
//	public static void main(String[] args) {
//		int i = 0;
//		for (i = 0; i < 5; i++) {
//			System.out.println("For: " + i);
//			
////			if (i == 3) {
////				break;
////			}
//		}
//
//		while (i < 5) {
//			System.out.println("While: " + i);
//			i++;
//			
////			if (i == 3) {
////				break;
////			}
//		}
//		
//		do {
//			System.out.println("Do-While: " + i);
//			i++;
//			
//		} while (i < 5);
//
//	}

	// BAI TAP
	@Test
	public void TC_01_For() {
		int number = scanner.nextInt();
		
		for (int i = number; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	@Test
	public void TC_02_While() {
		int number = scanner.nextInt();
		
		while (number <= 100) {
			if (number % 2 == 0) {
				System.out.println(number);
				number++;
			}
		}
	}
	
	@Test
	public void TC_03_Do_While() {
		int number = scanner.nextInt();
		
		do {
			if (number % 2 == 0) {
				System.out.println(number);
				number++;
			}
		} while (number <= 100);
	}
	
	@Test
	public void TC_04_While() {
		int number = scanner.nextInt();
		
		while (number < 100) {
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println(number);
			}
			number++;
		}
	}
	
	@Test
	public void TC_05_While() {
		int numberA = scanner.nextInt();
		int i = 0;
		
		while (numberA > 0) {
			// in ra tổng các số lẻ từ 0 đến numberA
			if (numberA % 2 == 1) {
				i += numberA; // i = i + numberA
			}
			numberA--;
		}
		System.out.println(i);
	}
	
	@Test
	public void TC_06_While() {
		int numberA = scanner.nextInt();
		int i = 1;
		
		while (numberA > 0) {
				i *= numberA;		
			numberA--;
		}
		System.out.println(i);
	}
	
}
