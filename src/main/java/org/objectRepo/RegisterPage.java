package org.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class RegisterPage extends BaseClass {
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement Sign;
	@FindBy(xpath="//a[text()='Register Now!']")
	private WebElement regis;
	@FindBy(name="username")
	private WebElement userid;
	@FindBy(name="password")
	private WebElement pass;
	@FindBy(name="repeatedPassword")
	private WebElement repass;
	@FindBy(name="account.firstName")
	private WebElement fname;
	@FindBy(name="account.lastName")
	private WebElement Lname;
	@FindBy(name="account.email")
	private WebElement Email;
	@FindBy(name="account.phone")
	private WebElement phone;
	@FindBy(name="account.address1")
	private WebElement address1;
	@FindBy(name="account.address2")
	private WebElement address2;
	@FindBy(name="account.city")
	private WebElement city;
	@FindBy(name="account.state")
	private WebElement state;
	@FindBy(name="account.zip")
	private WebElement zip;
	@FindBy(name="account.country")
	private WebElement Country;
	@FindBy(name="account.favouriteCategoryId")
	private WebElement favcat;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement submit;
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement SignIn;
	
	
	public WebElement getSign() {
		return Sign;
	}
	public WebElement getRegis() {
		return regis;
	}
	public WebElement getUserid() {
		return userid;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getRepass() {
		return repass;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return Lname;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZip() {
		return zip;
	}
	public WebElement getCountry() {
		return Country;
	}
	public WebElement getFavcat() {
		return favcat;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getSignIn() {
		return SignIn;
	}
	

}
