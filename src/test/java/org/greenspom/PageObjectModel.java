package org.greenspom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;
import org.testng.annotations.Test;

public class PageObjectModel extends BaseClass{
	
    
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement  password;
	
	@FindBy(id="login")
	private WebElement submit;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
    public PageObjectModel() {
    	PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
}
