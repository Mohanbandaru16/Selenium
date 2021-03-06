package com.company.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Selenium code-
		//create Driver object for chrome
		
		//we will strictly impliment methods of webdriver
		
		/*Class name = ChromeDriver,
				X driver=new X(); */
		
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.100.97.45/index.ssi");
		System.out.println(driver.getTitle());
		
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_FFOX\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://10.100.97.45/index.ssi");
		System.out.println(driver1.getTitle());
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://www.google.com");
		
		System.out.println(driver.getTitle()); //used to validate page title is correct
		
		System.out.println(driver.getCurrentUrl()); //used to know if we opened correct url or not
		
		// System.out.println(driver.getPageSource()); //used to get page source code
		
		driver.get("http://www.yahoo.com");
		driver.navigate().back();
		//driver.navigate().forward();
		//driver.close(); // It closes current browser 
		driver.quit(); // It closes all the browsers opened by selenium 

}
}
