package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	WebDriver Driver;
	public void intialSetup() {
		 String driverPath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", driverPath); 
		  Driver=new ChromeDriver(); 
		  Driver.manage().window().maximize();
	}
	public void login() {
		  Driver.get("https://www.linkedin.com/login"); 
		  WebElement username=Driver.findElement(By.id("username")); 
		  WebElement password=Driver.findElement(By.id("password")); 
		  WebElement login=Driver.findElement(By.xpath("//button[text()='Sign in']")); 
		  username.sendKeys("rajmca.it@gmail.com"); password.sendKeys("Kirthik@16"); 
		  login.click(); String actualUrl="https://www.linkedin.com/feed/"; 
	}
	
}
