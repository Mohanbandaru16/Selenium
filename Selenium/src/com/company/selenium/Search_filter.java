package com.company.selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Search_filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement>Veggies= driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filterdlist=Veggies.stream().filter(Veggie->Veggie.getText().contains("Rice")).
				collect(Collectors.toList());
		Assert.assertEquals(Veggies.size(), filterdlist.size());
	
	
	}

}
