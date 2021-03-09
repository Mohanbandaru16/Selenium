package com.company.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_FFOX\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size()); //to know how many frames are there
		driver.switchTo().frame(0);  //switch to frame using id
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //switch to frame using webelement
		//driver.findElement(By.id("draggable")).click();
		Actions a=new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); // to come out of frame 
	}

}
