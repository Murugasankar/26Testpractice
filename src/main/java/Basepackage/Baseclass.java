package Basepackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import LocatorPackage.Locatorclass;

public class Baseclass {

Locatorclass locator = new Locatorclass();
	
	public static WebDriver driver;
	
	
	public static void browser() {
	
		driver = new ChromeDriver();
	}
		
	public static void url() {
		
		driver.get("https://automationexercise.com/");
		
		
	}
	public static void maximize() {
		driver.manage().window().maximize();
		
	}
	
	public static void scrollcreateaccount(WebElement element1) {
	
		JavascriptExecutor scroll1 = (JavascriptExecutor)driver;
		 scroll1.executeScript("arguments[0].scrollIntoView()",element1);
	}
	
	public static void delay() throws InterruptedException {
		Thread.sleep(3000);
		
	}
	
	public static void screenshot(String imageName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File imgType = screenshot.getScreenshotAs(OutputType.FILE);
		File imgpath = new File(System.getProperty("user.dir")+"C:\\Users\\USER\\eclipse-workspace\\cucumbermav\\src\\test\\java\\image folder\\1.png");
		FileUtils.copyFile(imgType, imgpath);
		
		
	}
	
	public static void statescroll() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		
		for(int i=0;i<10;i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		} 
	
	public static void mouseover(WebElement element) {
	
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
		
	
	
	
}
