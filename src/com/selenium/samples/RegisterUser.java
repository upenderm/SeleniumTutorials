package com.selenium.samples;

import org.openqa.selenium.firefox.FirefoxDriver;


public class RegisterUser {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "/GeckoDriver/geckodriver.exe");
		FirefoxDriver ffDriver = new FirefoxDriver();
		ffDriver.manage().window().maximize();
		ffDriver.get("https://www.northerntrust.com");

	}

}
