package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	static Select s;

	public void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PMV\\eclipse-workspace\\AdactinHotel\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void loadUrl(String url) {
		driver.get(url);

	}

	public String currentUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		return Url;
	

	}

	public void fill(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public String getValue(WebElement element) {

		String t = element.getAttribute("value");
		System.out.println(t);
		return t;
	}

	public void optionSelectByValue(WebElement element, String value)

	{
		s = new Select(element);
		s.selectByValue(value);

	}

	public void optionSelectByVisibleText(WebElement element, String value)

	{
		s = new Select(element);
		s.selectByVisibleText(value);

	}

	public void optionSelectByIndex(WebElement element, int index)

	{
		s = new Select(element);
		s.selectByIndex(index);
	}

	public void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

}
