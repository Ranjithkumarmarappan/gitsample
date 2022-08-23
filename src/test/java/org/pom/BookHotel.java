package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookHotel {
	
	@FindBy(id="first_name")
	private static WebElement firstName;
	
	@FindBy(id="last_name")
	private static WebElement lastName;
		
	public static WebElement getFirstName() {
		return firstName;
	}

	public static WebElement getLastName() {
		return lastName;
	}

	public static WebElement getAddress() {
		return address;
	}

	public static WebElement getCardNum() {
		return cardNum;
	}

	public static WebElement getExpMonth() {
		return expMonth;
	}

	public static WebElement getExpYear() {
		return expYear;
	}

	public static WebElement getCcType() {
		return ccType;
	}

	public static WebElement getCcvNum() {
		return ccvNum;
	}

	public static WebElement getBookNow() {
		return bookNow;
	}

	public static WebElement getIterate() {
		return iterate;
	}

	@FindBy(id="address")	
	private static WebElement address;
		
	@FindBy(id="cc_num")
	private static WebElement cardNum;
	
	@FindBy(id="cc_exp_month")
	private static WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private static WebElement expYear;
	
	@FindBy(id="cc_type")
    private static WebElement ccType;
    	
    @FindBy(id="cc_cvv") 
    private static WebElement ccvNum;
    	
    @FindBy(id="book_now")
	private  static WebElement bookNow;
	
    @FindBy(id="my_itinerary")
	private static WebElement iterate;
	

}
