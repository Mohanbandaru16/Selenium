package com.company.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CX3003 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		
		int i=0, n=500;
		for (i=1;i<n;i++)
		{
		Thread.sleep(10000);
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.100.97.64/home.php");
		driver.manage().window().maximize();
		Thread.sleep(10000);	
		driver.findElement(By.id("userid")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		Thread.sleep(10000);
		driver.findElement(By.id("chassis_img8")).click();
		Thread.sleep(10000);
	//	driver.findElement(By.className(".nav-link.active.show")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Alarms']")).click();
		Actions a=new Actions (driver);
		WebElement SelectAll= driver.findElement(By.xpath("//label[@for='chkSigMask0']"));
	//	a.moveToElement(SelectAll).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform(); //selectAll
		a.moveToElement(SelectAll).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform(); //DeselctAll
		driver.findElement(By.id("btnApplyAll")).click(); //to apply)
		Thread.sleep(10000);
     	driver.findElement(By.xpath("//span[@class='short-user']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();  //logout
		driver.close();
	}

}}
