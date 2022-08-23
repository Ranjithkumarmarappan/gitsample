package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {
	
	@FindBy(id="username")
	private static WebElement username;
	
	@FindBy(id="password")
	private static WebElement password;
	
	@FindBy(id="login")
	private static WebElement submit;

	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getSubmit() {
		return submit;
	}



	
}
