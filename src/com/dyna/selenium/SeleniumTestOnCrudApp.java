package com.dyna.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestOnCrudApp {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("file:///C:/Users/91984/Desktop/Java/frontend/index.html");
		driver.findElement(By.name("name")).sendKeys("name");	
		driver.findElement(By.name("email")).sendKeys("manodyna-k@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("subject")).sendKeys("1234");
		driver.findElement(By.name("message")).sendKeys("1234");
		driver.findElement(By.name("button")).click();
		
		
	}

}
