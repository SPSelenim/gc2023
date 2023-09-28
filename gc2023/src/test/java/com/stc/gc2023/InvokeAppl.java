package com.stc.gc2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeAppl {
	String myApplication = "file:///D:/Satish/05DemoApps/demo.html";

	@Test
	public void f() {
		System.out.println("I N V O K E Application");

		try {
//21-Test
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(myApplication);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("myFirstName11");
			driver.findElement(By.id("lname")).sendKeys("pwd");
			String strFName=driver.getCurrentUrl();
			//driver.findElement(By.id("fname")).clear();
			String strFName1=driver.findElement(By.id("fname")).getAttribute("value");
			System.out.println("******strName : *****"+strFName+strFName1);
			Thread.sleep(3000);
	//		driver.close();
		driver.quit();
		} catch (Exception e) {
			System.out.println("Message : " + e.getMessage());
			System.out.println("Stack Trace : " + e.getStackTrace().toString());
		}
	}
}
