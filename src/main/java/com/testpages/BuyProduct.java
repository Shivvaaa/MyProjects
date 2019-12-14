package com.testpages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30", Keys.ENTER);
		String value = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println(value);
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElementById("add-to-cart-button").click();
		boolean message = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").isDisplayed();
		System.out.println("Is Displayed " + message);
		String Deliver = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText();
		System.out.println("Delivery by"+Deliver);
		driver.findElementById("hlb-ptc-btn-native").click();
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElementById("continue").click();
		String Error = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		System.out.println(Error);
		
		driver.quit();
		
	}
}
