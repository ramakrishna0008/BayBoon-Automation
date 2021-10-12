package com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLibraries {

	public static void main(String[] args) {
		System.out.println("Started Prog");
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "F:/RK/SELENIUM/LibrariesUpdated/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	System.setProperty("webdriver.gecko.driver","F:/RK/SELENIUM/LibrariesUpdated/geckodriver-v0.30.0-win64/geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bayboon.com");
	//	driver.findElement(By.linkText("noThanks")).click();
	//	driver.findElement(By.linkText("Apple")).click();
		driver.close();
		System.out.println("Browser closed");
		System.out.println("End of Prog");
	
	}

}
