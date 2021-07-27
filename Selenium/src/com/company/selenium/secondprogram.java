package com.company.selenium;

//code to add multiple IP's in OneApp

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondprogram {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.150:80");
		driver.manage().window().maximize(); //to maximize the window
		driver.findElement(By.id("userid")).sendKeys("admin");
		driver.findElement(By.name("pswrd")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click(); //log in click
		//Thread.sleep(10000);
	    //System.out.println(driver.findElement(By.cssSelector("span#logstatus")).getText()); //if we enter wrong Pwrd, prints msg
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'img_add\']")); //to click add device
		//driver.findElement(By.xpath("//*[@id=\'txtIpAddress\']")).sendKeys("10.100.97.40");  // to add single IP.
		driver.findElement(By.xpath("//*[@id=\'txtFromIpAddress\']")).sendKeys("10.100.97.40"); //to add ip in from when we select multiple IP
		driver.findElement(By.xpath("//*[@id=\'txtToIpAddress\']")).sendKeys("10.100.97.50");				
		//driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.className("short-user")).click();
		//System.out.println(driver.getCurrentUrl()); 
		//driver.findElement(By.cssSelector("#img_add")).click();
		driver.findElement(By.cssSelector("#btnAddDevice")).click();
		Thread.sleep(90000);     
		driver.findElement(By.xpath("//*[@id=\'ui-id-2\']/td[1]/span/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/span[1]/span[1]")).click(); //to click IP in tree
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\'chassis_img6\']")).click();  //to open module
		Thread.sleep(10000); 
		driver.findElement(By.xpath("//*[text()='CX3002 - 46 (Lap2, COM7) [10.100.97.46]']")).click(); //using text
		Thread.sleep(15000);
		driver.findElement(By.className("short-user")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[7]/div/ul/li[4]/a")).click(); //logout
		//Thread.sleep(5000);
		//driver.close();
		
		//*[@id=\"fancytree\"]/tbody/tr[8]/td[1]/span/span[2]
		//*[@id="fancytree"]/tbody/tr[26]/td[1]/span/span[2]
		
	}

}
