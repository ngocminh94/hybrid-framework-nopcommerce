package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Topic_08_For_ForEach {
	WebDriver driver;
	
	@Test
	public void TC_01_For() {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}

		// Array/ List/ Set/ Queue (index)
		String[] cityName = { "HN", "HP", "HCM", "DN" };

		// For kết hợp if: thỏa mãn điều kiện mới action
		// Dùng như biến đếm - dùng đk để filter
		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].equals("HN")) {
				// thì mới action
				System.out.println("action");
				break;
			}
		}
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
	}

	@Test
	public void TC_02_For_Each() {
		String[] cityName = { "HN", "HP", "HCM", "DN" };

		for (String city : cityName) {
			System.out.println(city);
		}

		// Java Generic
		List<WebElement> links = driver.findElements(By.xpath(null));
		
		for (WebElement link : links) {
			// Chuyeern page
			// refresh DOM/ HTML
			// Ko còn tồn tại
		}

	}
}
