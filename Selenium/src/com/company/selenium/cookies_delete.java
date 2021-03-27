package com.company.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//if we delete session cookie page gets logout and redirects to home page
		driver.manage().deleteCookieNamed("sessionkey");
		//click on any link 
		//will go to login page -verify url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}
