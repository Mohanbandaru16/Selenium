package com.company.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetowkFeatures {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.100.102.221/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("admin");
		driver.findElement(By.cssSelector("#btnLogin")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("span[title='RS232 [COM24]']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@id='chassis_img21']")).click();
		
	}

}
