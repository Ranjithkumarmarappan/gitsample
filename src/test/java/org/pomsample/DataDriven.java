package org.pomsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.pom.LoginPageObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	String [][] data = {
			{"Ranjithfreaky","Ranjith@95"},
			{"Ranjithfreaky","password"},
			{"password","Ranjith@95"},
			{"password","password"}
	};
	
	@DataProvider(name="loginData")
	public String[][] loginValidation(){
		return data;
	}
	
	@Test(dataProvider="loginData")
	public void login(String uName, String password) {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\WorkSpace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	

	PageFactory.initElements(driver, LoginPageObject.class);
	LoginPageObject.getUsername().sendKeys(uName);
	LoginPageObject.getPassword().sendKeys(password);
	LoginPageObject.getSubmit().click();
	
	}

}
