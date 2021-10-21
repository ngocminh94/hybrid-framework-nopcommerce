package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_07_Switch_Case {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	Scanner scanner = new Scanner(System.in);
	
	@Parameters("browser")

	public void TC_01(String browserName) {
		driver = getBrowserDriver(browserName);			
			System.out.println(browserName);
			
			driver.quit();
		}
	
	public void TC_02() {
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang " + month + " co 31 ngay");
			break;
		case 2:
			System.out.println("Thang " + month + " co 28 hoac 29 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang " + month + " co 30 ngay");
			break;
		default:
			System.out.println("Vui long nhap thang hop le.");
			break;
		}		
	}
	
	public void TC_03() {
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;		
		}		
	}
	
	@Test
	public void TC_04() {
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		String operator = scanner.next();

		switch (operator) {
		case "+":
			System.out.println("A + B = " + (firstNumber + secondNumber));
			break;
		case "-":
			System.out.println("A - B = " + (firstNumber - secondNumber));
			break;
		case "*":
			System.out.println("A x B = " + (firstNumber * secondNumber));
			break;
		case "/":
			System.out.println("A / B = " + (firstNumber / secondNumber));
			break;
		}
		
	}

	public WebDriver getBrowserDriver(String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
			
		default:
			new RuntimeException("Please input correct browser name");
			break;
		}
		return driver;
	}
	
}
	