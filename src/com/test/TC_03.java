package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_03 {

	@Test
	public void tc_01() {
		
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']")).click();
		driver.navigate().refresh();

}
}
