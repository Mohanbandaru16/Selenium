package com.company.selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Table_Sorting_JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
	
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all webelements in to list
		List<WebElement>elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		//capture all webelements into new original list
        List<String>originalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String>sortedList=originalList.stream().sorted().collect(Collectors.toList());
	
        Assert.assertTrue(originalList.equals(sortedList));
	}

}
