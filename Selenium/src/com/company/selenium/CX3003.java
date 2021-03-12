package com.company.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CX3003 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.100.97.64/home.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("userid")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("chassis_img8")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='short-user']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();  //logout
	}

}
