package javaBasic;

import org.testng.annotations.Test;

public class Topic_11_Array {
	// Thuộc tính/ Biến
//	String name;
//	int age;
//	
//	// Constructor: hàm khởi tạo
//	public Topic_11_Array(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	public void display() {
//		System.out.println("Name: " + name);
//		System.out.println("Age: " + age);		
//	}
//		
//	public static void main(String[] args) {
//		Topic_11_Array[] students = new Topic_11_Array[3];
//		
//		students[0] = new Topic_11_Array("Min", 26);
//		students[1] = new Topic_11_Array("Terri", 29);
//		students[2] = new Topic_11_Array("Ginny", 28);
//		for (int i = 0; i < students.length; i++) {
//			students[i].display();
//		}
//		
//	}

	int number[] = {10, -8, 1000, 20, -88, 3, 30, 40, 9, 50, 1};
	
	@Test
	public void TC_01_Find_Max_Number() {
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			if (x < number[i]) {
				x = number[i];
			}
		}
		System.out.println("Max number = " + x);
		
		// System.out.println("First number = " + number[0]);
		// System.out.println("Last number = " + number[number.length - 1]);
	}
	
	@Test
	public void TC_02_Sum_First_Last() {
		System.out.println(number[0] + number[number.length - 1]);		
	}
	
	@Test
	public void TC_03_Even_Number() {
		for (int i = 0; i < number.length; i++) {
			if(number[i] % 2 == 0) {
				System.out.println("Even number = " + number[i]);
			}
		}		
	}
	
	@Test
	public void TC_04_Sum_Odd_Number() {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			if(number[i] > 0 && number[i] % 2 == 1) {
				sum += number[i];
			}
		}		
		System.out.println("Sum of odd numbers = " + sum);
	}
	
	@Test
	public void TC_05() {
		for (int i = 0; i < number.length; i++) {
			if(number[i] >= 0 && number[i] <= 10) {
				System.out.println("Number trong khoang tu 0 den 10 = " + number[i]);
			}
		}		
	}
	
	@Test
	public void TC_06_Average() {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			// sum = sum + number[i]
			sum += number[i];			
		}
		System.out.println("Sum = " + sum);
		
		float average = sum / number.length;
		System.out.println("Average = " + average);
	}
	
}
