package org.pom;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectHotel {	
	
	@FindBy(id="location")
	private static  WebElement location;
	
	@FindBy(id="hotels")
	private static  WebElement hotels;
		
	@FindBy(id="room_type")
	private static  WebElement roomType;

	@FindBy(id="datepick_in")
	private static   WebElement datein;
	
	@FindBy(id="datepick_out")
	private static  WebElement dateout;
	
    @FindBy(id="adult_room")
	private static  WebElement adultRoom;
    
    
    @FindBy(id="child_room")
	private static  WebElement childRoom;
    
    @FindBy(id="Submit")
	private static  WebElement submitHotel;

	public static  WebElement getLocation() {
		return location;
	}

	public static WebElement getHotels() {
		return hotels;
	}

	public static WebElement getRoomType() {
		return roomType;
	}

	public static WebElement getDatein() {
		return datein;
	}

	public static WebElement getDateout() {
		return dateout;
	}

	public static WebElement getAdultRoom() {
		return adultRoom;
	}

	public static WebElement getChildRoom() {
		return childRoom;
	}

	public static WebElement getSubmitHotel() {
		return submitHotel;
	}

}
