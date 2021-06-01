package com.sample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.objectRepo.RegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.resources.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgData extends BaseClass {
	RegisterPage r;

	@BeforeMethod
	public void OpenBrowser() {
		LaunchBrowser();
		LaunchApp("https://petstore.octoperf.com/actions/Catalog.action");
		TakeUrl();
		getTitle();

	}

	@Test
	public void loginPage() throws InterruptedException, IOException {
		r = new RegisterPage();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		moveTo(r.getSign());
		r.getSign().click();
		moveTo(r.getRegis());  
		r.getRegis().click();
		Thread.sleep(3000);
		type(r.getUserid(), readData(1, 1));
		type(r.getPass(), readData(2, 1));
		type(r.getRepass(), readData(3, 1));
		type(r.getFname(), readData(4, 1));
		type(r.getLname(), readData(5, 1));
		type(r.getEmail(), readData(6, 1));
		type(r.getPhone(), readData(7, 1));
		type(r.getAddress1(), readData(8, 1));
		type(r.getAddress2(), readData(9, 1));
		type(r.getCity(), readData(10, 1));
		type(r.getState(), readData(11, 1));
		type(r.getZip(), readData(12, 1));
		type(r.getCountry(), readData(13, 1));
		//click(r.getSubmit());
		
		


	}
	@Test
	public void writeData() throws IOException {
		writeData("Gold Fish", 1, 0);
		
	}

	@AfterMethod
	public void CloseBrowser() {
		quit();
	}

}
