package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelFinal {
	
	@FindBy(id="radiobutton_0")
	private static WebElement radioClick;
	
	@FindBy(id="continue")
	private static WebElement continueHotel;

	public static WebElement getRadioClick() {
		return radioClick;
	}

	public static WebElement getContinueHotel() {
		return continueHotel;
	}
	

}
