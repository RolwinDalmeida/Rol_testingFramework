package com.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
 
WebDriver driver;
 
 
public LoginPage(WebDriver ldriver)
{
	
this.driver=ldriver;
}
 
 
@FindBy(xpath="//input[@id='username']") 
WebElement username;

@FindBy(xpath="//input[@id='password']") 
WebElement password;
 
@FindBy(xpath="//input[@type='submit']") 
WebElement SignIN;
 

 
 
public void login_Broadleaf()
{
username.sendKeys("admin");
password.sendKeys("admin");
SignIN.click();
}
 
 
}
 
