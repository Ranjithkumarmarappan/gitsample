package org.pomsample;


import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.pom.BookHotel;
import org.pom.LoginPageObject;
import org.pom.SelectHotel;
import org.pom.SelectHotelFinal;
import org.sample.BaseClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class LoginTestCase {
	
	   public Select select(WebElement element) {
		 Select s = new Select(element);
		return s; 
	  }
	
	@Test
	public void loginAdacitin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\WorkSpace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		

		PageFactory.initElements(driver, LoginPageObject.class);
		LoginPageObject.getUsername().sendKeys("Ranjithfreaky");
		LoginPageObject.getPassword().sendKeys("Ranjith@95");
		LoginPageObject.getSubmit().click();
		
		PageFactory.initElements(driver, SelectHotel.class);
		
		select(SelectHotel.getLocation()).selectByVisibleText("London");
	
		
		select(SelectHotel.getHotels()).selectByIndex(1);
	
		select(SelectHotel.getRoomType()).selectByIndex(3);
		SelectHotel.getDatein().sendKeys("12/08/2022");
		SelectHotel.getDateout().sendKeys("13/08/2022");
	
		select(SelectHotel.getAdultRoom()).selectByIndex(2);
	
		
		select(SelectHotel.getChildRoom()).selectByIndex(3);
	    SelectHotel.getSubmitHotel().click();
	    Thread.sleep(1500);
		
	    PageFactory.initElements(driver, SelectHotelFinal.class);
		SelectHotelFinal.getRadioClick().click();
		SelectHotelFinal.getContinueHotel().click();
		
	    PageFactory.initElements(driver, BookHotel.class);
		BookHotel.getFirstName().sendKeys("Ranjith");
		
		BookHotel.getLastName().sendKeys("Kumar");
		BookHotel.getAddress().sendKeys("Triuchengode,Namakkal-637205");
		BookHotel.getCardNum().sendKeys("1234567890123456");
		
		
		select(BookHotel.getCcType()).selectByVisibleText("VISA");
		
	
		
		select(BookHotel.getExpMonth()).selectByVisibleText("August");
		
		select(BookHotel.getExpYear()).selectByVisibleText("2018");
		
		BookHotel.getCcvNum().sendKeys("335");
	    BookHotel.getBookNow().click();
		Thread.sleep(5000);
		BookHotel.getIterate().click();
		Thread.sleep(7000);
//		driver.findElement(By.id("search_hotel")).click();
		
		
		List<WebElement> tables =driver.findElements(By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody"));
		for (int i = 0; i < tables.size() ; i++) {
			WebElement webtext = tables.get(i);
			String text = webtext.getText();
			System.out.println(text);
			
		}
		
	}	 

@Ignore
public void options() {
List<WebElement> options = select(SelectHotel.getLocation()).getOptions();
for (WebElement location : options) {
	System.out.println(location.getText());
	
}
List<WebElement> options6 = select(BookHotel.getCcType()).getOptions();
for (WebElement ccType : options6) {
	System.out.println(ccType.getText());
}
List<WebElement> options7 = select(BookHotel.getExpMonth()).getOptions();
for (WebElement expMonth : options7) {
	System.out.println(expMonth.getText());
}

List<WebElement> options5 = select(SelectHotel.getChildRoom()).getOptions();
for (WebElement childRoom : options5) {
	System.out.println(childRoom.getText());
}

List<WebElement> options4 = select(SelectHotel.getAdultRoom()).getOptions();
for (WebElement adultRoom : options4) {
	System.out.println(adultRoom.getText());
	
}

List<WebElement> options3 = select(SelectHotel.getRoomType()).getOptions();
for (WebElement roomType : options3) {
	System.out.println(roomType.getText());
}

List<WebElement> options2 = select(SelectHotel.getHotels()).getOptions();
for (WebElement hotels  : options2) {
	System.out.println(hotels.getText());
}
}}



