package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectProduct extends BaseClass {
	
	public SelectProduct()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="gh-ac")
	private List<WebElement> enterProductName;
	
	@FindBy(xpath="(//ul[@class='srp-results srp-list clearfix']//li)[1]//div[@class='s-item__title']")
	private List<WebElement> firstSearchedProduct;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private List<WebElement> addToCart;
	
	@FindBy(xpath="//div[@class='gh-cart']//a//span[@aria-label]")
	private List<WebElement> cartNumber;
	
	public List<WebElement> getenterProductName() {
		return enterProductName;
	}

	public List<WebElement> getfirstSearchedProduct() {
		return firstSearchedProduct;
	}

	public List<WebElement> getaddToCart() {
		return addToCart;
	}
	
	public List<WebElement> getcartNumber() {
		return cartNumber;
	}
}
