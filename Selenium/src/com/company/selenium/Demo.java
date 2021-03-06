package com.company.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

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
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_FFOX\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://bing.com");
		System.out.println(driver1.getTitle());
				
	}

}
