package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01 {
	
	@Test
	public void tc_01() {
		
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.quit();
	}

}
