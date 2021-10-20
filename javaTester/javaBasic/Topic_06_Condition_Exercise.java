package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_06_Condition_Exercise {
	WebDriver driver;
	
	// Nhập từ bàn phím
	Scanner scanner = new Scanner(System.in);
	
	public void TC_01() {
		int number = scanner.nextInt();
		
//		int afterNumber = number % 2;
//		System.out.println(afterNumber);
//		
//		boolean status = afterNumber == 0;
//		System.out.println(status);
//	
//		if (status) {
//			System.out.println("So " + number + " la so chan");
//		} else {
//			System.out.println("So " + number + " la so le");
//		}
		
		if (number % 2 == 0) {
			System.out.println("So " + number + " la so chan");
		} else {
			System.out.println("So " + number + " la so le");
		}
	}	
	
	public void TC_02() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		if (numberA > numberB) {
			System.out.println(numberA + " lon hon " + numberB);
		} else if (numberA < numberB){
			System.out.println(numberA + " nho hon " + numberB);
		} else { // numberA == numberB
			System.out.println(numberA + " bang " + numberB);
		}
	}

	public void TC_03() {
		String nameA = scanner.nextLine();
		String nameB = scanner.nextLine();
		
		// Dùng equals để so sánh đối vs kiểu dữ liệu tham chiếu (Reference) (String)
		// Ktra value của biến
		// Ktra vị trí của biến trong vùng nhớ
		if (nameA.equals(nameB)) {
			System.out.println("2 nguoi co ten giong nhau");
		} else {
			System.out.println("2 nguoi co ten khac nhau");
		}
		
		// Dùng == đẻ so sánh đối vs kiểu dữ liệu nguyên thủy (Primitive)
		// --> trường hợp này là kiểu string nên sẽ ra kqua sai
//		if (nameA == nameB) {
//			System.out.println("2 nguoi co ten giong nhau");
//		} else {
//			System.out.println("2 nguoi co ten khac nhau");
//		}
	}
	
	public void TC_04() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int numberC = scanner.nextInt();

		if (numberA > numberB && numberA > numberC) {
			System.out.println(numberA + " la so lon nhat ");
		} else if (numberB > numberC) {
			System.out.println(numberB + " la so lon nhat ");
		} else {
			System.out.println(numberC + " la so lon nhat ");
		}
		
	}
	
	public void TC_05() {
		int numberA = scanner.nextInt();

		if (10 < numberA && numberA < 100) {
			System.out.println(numberA + " nam trong khoang tu 10 den 100");
		} else {
			System.out.println(numberA + " nam ngoai khoang tu 10 den 100");
		}		
	}
	
	public void TC_06() {
		float studentPoint = scanner.nextFloat();

		if (studentPoint <= 10 && studentPoint >= 8.5) {
			System.out.println("Diem A");
		} else if (studentPoint < 8.5 && studentPoint >= 7.5) {
			System.out.println("Diem B");
		} else if (studentPoint < 7.5 && studentPoint >= 5) {
			System.out.println("Diem C");
		} else if (studentPoint < 5 && studentPoint >= 0) {
			System.out.println("Diem D");
		} else {
			System.out.println("Vui long nhap so diem hop le");
		}
	}
	
	@Test
	public void TC_07() {
		int month = scanner.nextInt();
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("Thang " + month + " co 31 ngay");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("Thang " + month + " co 30 ngay");
		} else if (month == 2) {
			System.out.println("Thang " + month + " co 28 hoac 29 ngay");
		} else {
			System.out.println("Vui long nhap thang hop le.");
		}
	}
	
}
