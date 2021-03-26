package com.company.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//!(negation) in while is if it is true becomes false, if it is false becomes true
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) 
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();	
		}
		List<WebElement> dates=driver.findElements(By.className(".day"));
		//grab common attribute and put in a list and iterate
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("4"))
		{
			driver.findElements(By.className("day")).get(i).click();
			break;
		}
		}
		}

}
