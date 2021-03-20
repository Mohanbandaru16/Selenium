package com.company.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mygkbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.mygkbook.in/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size()); 
	    WebElement stockGK = driver.findElement(By.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]"));
	    
	    System.out.println(stockGK.findElements(By.id("a")).size());
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Arjuna Award Winners']")).click();
		
		

	}

}
