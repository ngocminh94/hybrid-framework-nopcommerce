package javaBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_12_String {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String schoolName = "Automation Testing";
		String schoolAdd = "Hanoi";
		String courseName = "AUTOMATION TESTING";
		
		
		System.out.println("Do dai = " + schoolName.length());
		System.out.println("Ky tu duoc lay ra = " + schoolName.charAt(11));
		System.out.println("Noi 2 chuoi = " + schoolName.concat(schoolAdd));
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + schoolName.equals(schoolAdd));
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + schoolName.equals("Automation Testing"));
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + courseName.equals("Automation Testing"));
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + schoolName.equalsIgnoreCase(courseName));
		
		// startsWith/ endsWith/ contains
		System.out.println("Co bat dau bang 1 ky tu/ chuoi ky tu = " + schoolName.startsWith("A"));
		System.out.println("Co bat dau bang 1 ky tu/ chuoi ky tu = " + schoolName.startsWith("Automation"));
		System.out.println("Co bat dau bang 1 ky tu/ chuoi ky tu = " + schoolName.startsWith("T"));
		
		System.out.println("Co ket thuc bang 1 ky tu/ chuoi ky tu = " + schoolName.endsWith("g"));
		System.out.println("Co ket thuc bang 1 ky tu/ chuoi ky tu = " + schoolName.endsWith("Testing"));
		System.out.println("Co ket thuc bang 1 ky tu/ chuoi ky tu = " + schoolName.endsWith("Automation"));
		
		System.out.println("Co chua 1 ky tu/ chuoi ky tu = " + schoolName.contains("Automation"));
		System.out.println("Co chua 1 ky tu/ chuoi ky tu = " + schoolName.contains("T"));
		
		System.out.println("Vi tri cua 1 ky tu/ chuoi ky tu trong chuoi = " + schoolName.indexOf("A"));
		System.out.println("Vi tri cua 1 ky tu/ chuoi ky tu trong chuoi = " + schoolName.indexOf("utomation"));
		System.out.println("Vi tri cua 1 ky tu/ chuoi ky tu trong chuoi = " + schoolName.indexOf("t"));
		System.out.println("Vi tri cua 1 ky tu/ chuoi ky tu trong chuoi = " + schoolName.indexOf("T"));
		
		System.out.println("Tach 1 ky tu/ chuoi ky tu trong chuoi = " + schoolName.substring(4, 6));
		
		String result = "Viewing 48 of 132 results";
		String results[] = result.split(" ");
		System.out.println(results[1]);
		
		// Replace
		String productPrice = "$100.00";
		productPrice = productPrice.replace("$", "");
		System.out.println(productPrice);
		
		float productPriceF =Float.parseFloat(productPrice);
		System.out.println(productPriceF);
		
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		String driverInstanceName = driver.toString();
		System.out.println(driverInstanceName);
		// Windows 10
		// FirefoxDriver: firefox on WINDOWS (5be03741-474e-4b3b-8e4d-9d3d4c157eec)
		if (osName.toLowerCase().contains("windows")) {
			Keys key = Keys.CONTROL;
		} else {
			Keys key = Keys.COMMAND;
		}
		
		//Close browser/ driver
		if (driverInstanceName.contains("internetexplorer")) {
			// thi se sleep cứng thêm 5s sau mỗi sự kiện chuyển page
		}
		
		// Dynamic locator
		// Đại diện cho 1 chuỗi: %s
		// %b %t %d
		String dynamicButtonXpath = "//button[@id='%s']";
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		System.out.println("Click to Search button = " + dynamicButtonXpath.format(dynamicButtonXpath, "search"));
		
		
		

	}

}
