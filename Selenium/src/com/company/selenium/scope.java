package com.company.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());  //get thelinks count in page
		WebElement footer=driver.findElement(By.id("gf-BIG")); //limited the scope of search for only menu area 
		System.out.println(footer.findElements(By.tagName("a")).size()); 
		WebElement columndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());   
		//click on each link in the column
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER); //open all tabs
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
}
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			while(it.hasNext())
			{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			}
			
	}
	}


