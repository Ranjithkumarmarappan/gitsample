package org.greenspom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin extends BaseClass {

		
		browserLaunch();
		launchUrl("https://adactinhotelapp.com/");
		maximize();
		
		PageObjectModel pom = new PageObjectModel();
		WebElement username = pom.getUsername();
		username.sendKeys("Ranjithfreaky");
		WebElement password = pom.getPassword();
		password.sendKeys("Ranjith@95");
		WebElement submit = pom.getSubmit();
		submit.click();
		
	}
}
