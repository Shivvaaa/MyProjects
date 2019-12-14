package com.leafBot.pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage search() {
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30", Keys.ENTER);
		String value = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println(value);
		return this;
		
		
	}
public HomePage addtoCart() {
	driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	driver.findElementById("add-to-cart-button").click();
	return this;
}
public HomePage Verify() {
	boolean message = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").isDisplayed();
	System.out.println("Is Displayed " + message);
	String Deliver = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText();
	System.out.println("Delivery by"+Deliver);
	driver.findElementById("hlb-ptc-btn-native").click();
	return this;
	
}
public HomePage login() {
	String Title = driver.getTitle();
	System.out.println(Title);
	driver.findElementById("continue").click();
	String Error = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
	System.out.println(Error);
	return this;
	
}
}