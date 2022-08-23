package org.sample;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement element;
	
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public WebElement byId(String value) {
	     element = driver.findElement(By.id(value));
		return element;
	}
	public WebElement byName(String value) {
		element = driver.findElement(By.name(value));
		return element;
	}
	public WebElement className(String value) {
		element = driver.findElement(By.className(value));
		return element;
	}
	public WebElement xpath(String value) {
		element = driver.findElement(By.xpath(value));
		return element;
	}
	public void sendKeys(WebElement element , String data) {
		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}

	public void close() {
		driver.close();
	}
//11
	public void quit() {
		driver.quit();
	}
//12
	public void refresh() {
		driver.navigate().refresh();
	}
//13
	public void backword() {
		driver.navigate().back();
	}
//14
	public void forward() {
		driver.navigate().forward();
	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public void mouseOVerAction(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
	}
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	public void robotShift() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}
	public static void robotEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void simpleAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	public void confirmAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	public void promptAlert(String value) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(value);
	}
	
	public void threadSleep(int millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	public void screenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("path of the location");
		FileUtils.copyFile(srcFile, destFile);
		
	}
	public void screenshotParticularWebElement(WebElement element ) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = element.getScreenshotAs(OutputType.FILE);
		File destFile = new File("path of the location");
		FileUtils.copyFile(srcFile, destFile);
	}
	public void dropDownSelectByIndex(WebElement element , int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}
	public void dropDownSelectByAttributeValue(WebElement element, String value) {
		Select select =  new Select(element);
		select.selectByValue(value);
	}
	public void dropDownSelectByVisibleText(WebElement element , String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
//	public List<WebElement> dropDownGetOptions(WebElement element ) {
//		Select select =  new Select(element);
//		List<WebElement> options = select.getOptions();
//		return options;
//		
//	}
//	public List<WebElement> dropDownGetAllSelectedOptions(WebElement element) {
//		Select select = new select(element);
//		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
//		return allSelectedOptions;
//	}
//	
//	public WebElement dropDownGetFirstSelectedOptions(WebElement element) {
//		Select select = new Select(element);
//		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
//		return allSelectedOptions;
//	}
	
	public WebElement dropDownGetFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}
	
	public void ddnDeselectByIndex(WebElement element , int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	public void DeselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean b = select.isMultiple();
		return b;
	}
	public void frameById(String name) {
		driver.switchTo().frame(name);
	}
	public void frameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	public void returnFromFrame() {
		driver.switchTo().defaultContent();
	}
	public String windowHandle() {
		String windowHandle =  driver.getWindowHandle();
		return windowHandle;
	}
	public Set<String> windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public void switchToParentWindow(String element) {
		driver.switchTo().window(element);
	}
	public void clear(WebElement element) {
		element.clear();
	}

	
	
	
	
}
