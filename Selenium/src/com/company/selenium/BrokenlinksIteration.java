package com.company.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenlinksIteration {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links)   //enhanced for loop
		{
		String url=link.getAttribute("href");
		HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode=conn.getResponseCode();
		System.out.println(respCode);
		a.assertTrue(respCode<400, "the link with text "+link.getText()+"is broken"+respCode);  //using soft assertion, so we can remove for loop
	/*	
		if(respCode>400)
		{
			System.out.println("the link with text "+link.getText()+"is broken"+respCode);
			Assert.assertTrue(false);
		}*/
		
		}
		a.assertAll(); //if any failures this line will fail script	
	
	
	}

}
