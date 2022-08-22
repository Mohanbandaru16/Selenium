package com.company.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("9642096111");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("9642096111");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("*********");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("button[name='login']")).click();//to click on login
		//driver.findElement(By.xpath("//*[@id=\'u_0_d_by\']")).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("swe");  //to click on search
		Thread.sleep(5000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='k4urcfbm']"));    
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("swetha reddy"))
					{
				option.click();
				break;
					}
			
		}
			
	}

}
