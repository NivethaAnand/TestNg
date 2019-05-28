package org.sel;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParellelMethods {
	WebDriver driver;
	@BeforeMethod
	public void startMethod() {
		Date d=new Date();
		System.out.println(d);

	}
	@AfterMethod
	public void endTime() {
	Date d= new Date();
	System.out.println(d);
	}
	@BeforeClass
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GT Jul 001\\eclipse-workspace\\TestNg\\Test\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");

	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("close");
	driver.quit();

	}
	@Test
	public void test1() {
	System.out.println("test1");
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Nivetha");
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("Nivetha");
	WebElement btn = driver.findElement(By.id("loginbutton"));
	btn.click();
	}
	@Test
	public void test2() {
	
System.out.println("test2");
WebElement fname = driver.findElement(By.name("firstname"));
fname.sendKeys("Nivetha");
WebElement lname = driver.findElement(By.name("lastname"));
lname.sendKeys("Nivetha");

	}
@Test
public void test3() {
	
System.out.println("test3");
WebElement fname = driver.findElement(By.name("reg_email__"));
fname.sendKeys("Nivetha30@gmail.com");
}
	

	}


