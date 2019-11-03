package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String driverPath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", driverPath); 
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize(); 
		  driver.get("https://www.linkedin.com/login"); 
		  WebElement username=driver.findElement(By.id("username")); 
		  WebElement password=driver.findElement(By.id("password")); 
		  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 
		  username.sendKeys("rajmca.it@gmail.com"); password.sendKeys("Kirthik@16"); 
		  login.click();
		  String actualUrl="https://www.linkedin.com/feed/"; 
		  String expectedUrl= driver.getCurrentUrl(); 
		  //Assert.assertEquals(expectedUrl,actualUrl); } 
	}

}
