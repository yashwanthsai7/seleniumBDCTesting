package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.ID,using="Email")
	public static WebElement email;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.CSS,using="Input[value='Log in']")
	public static WebElement Login;


}
