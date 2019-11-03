package com.test.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.util.ReadProperty;

public class FirstTestng {
	WebDriver Driver;

	@Test
	public void intialSetup() throws IOException {
		String driverPath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
	}

	@Test
	public void login() throws IOException {
		Driver.get(ReadProperty.getInstance().getValue("BASE_URL"));
		WebElement username = Driver.findElement(By.name("uid"));
		WebElement password = Driver.findElement(By.name("password"));
		username.sendKeys(ReadProperty.getInstance().getValue("USERNAME"));
		 password.sendKeys(ReadProperty.getInstance().getValue("PASSWORD"));
	      Driver.findElement(By.name("btnLogin")).click();
	      Driver.navigate().to("http://demo.guru99.com/V4/manager/addcustomerpage.php");
		  Driver.findElement(By.name("name")).sendKeys("TestSelenium");
		  Driver.findElement(By.name("dob")).sendKeys("18/05/1986");;
		  Driver.findElement(By.name("addr")).
		  sendKeys("Tatton court Lichfield Wolverhampton");
		  Driver.findElement(By.name("city")).sendKeys("Birmingham");
		  Driver.findElement(By.name("state")).sendKeys("Birmingham");
		  Driver.findElement(By.name("pinno")).sendKeys("7673637637");
		  Driver.findElement(By.name("telephoneno")).sendKeys("9898989899");
		  Driver.findElement(By.name("emailid")).sendKeys("rajmca1.it@gmail.com");
		  Driver.findElement(By.name("password")).sendKeys("rajendran");
		  Driver.findElement(By.name("sub")).click();
	     
	}
	
	public void customer() throws IOException {
		
		 
	}
	

}
