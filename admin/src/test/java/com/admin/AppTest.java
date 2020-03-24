package com.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

class AppTest{
	
	WebDriver driver;

	
	
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://localhost:8444/admin/login");
		
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		//login
		login.login_Broadleaf();
		
		Base base = PageFactory.initElements(driver, Base.class);
		base.addOffer();
		//Filter product
		
		
		
	
	}
	
	
}