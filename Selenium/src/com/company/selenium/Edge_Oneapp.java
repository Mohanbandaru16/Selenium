package com.company.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Oneapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_edge\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://192.168.1.150/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
	}

}
