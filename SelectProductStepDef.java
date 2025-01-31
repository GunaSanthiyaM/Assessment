package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pages.LoginPage;
import com.pages.SelectProduct;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectProductStepDef extends BaseClass

{
	
	SelectProduct product;
	
	@When("And User has to search for {string}")
	public void user_has_to_click_the_Search_button() {
		product = new SelectProduct();
		WebElement searchBtn = product.getenterProductName().get(0);
		fill(searchBtn, "Book");
		btnClick(searchBtn);
	}

	@When("And User has to click the first product in the list")
	public void user_has_to_select_the_book_from_the_list() {
		product = new SelectProduct();
		WebElement option = product.getfirstSearchedProduct().get(0);
		btnClick(option);

	}

	@When("And User has to select Add to Cart")
	public void user_has_to_click_the_Add_To_Cart() {
		product = new SelectProduct();
		WebElement addToCart = product.getaddToCart().get(0);
		btnClick(addToCart);
	}

	@When("Then User has verify cart is been updated and displays the {string}")
	public void user_has_to_click_the_Book_Now_button(String number) {
		product = new SelectProduct();
		WebElement cart = product.getcartNumber().get(0);
		String text = cart.getText();
		String actual = "Your shopping cart contains +"/number/"+ items";
		Assert.assertTrue(text, actual);
	}

}
