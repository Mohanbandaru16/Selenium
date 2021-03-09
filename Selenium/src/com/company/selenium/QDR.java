package com.company.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class QDR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("http://192.168.1.150");	
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\'userid\']")).sendKeys("admin");
		driver.findElement(By.id("userid")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='pswrd']")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[text()= 'CX-48 CX3002 VNC-62,COM8 [10.100.97.48]']")).click();
		//driver.findElement(By.xpath("//*[text()='CX3002 - 46 (Lap2, COM7)  [10.100.97.46]']")).click();
		Thread.sleep(40000);
		
		driver.findElement(By.cssSelector("img#chassis_img25")).click();  //open slot 25
		Thread.sleep(30000);

		driver.findElement(By.xpath("//a[normalize-space()='Alarms']")).click();  //open alarms tab
		Actions a = new Actions(driver); 
		WebElement selectAll = driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask8']"));
		
		a.moveToElement(selectAll).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();  //to deselect all
			
	//	System.out.println(driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).isSelected()); //to know if selected alarm is enabled/disabled
	//	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); //prints number of checkboxes in page
		Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//span[normalize-space()='Rx 2']")).click();
	
		a.moveToElement(driver.findElement(By.xpath("//label[@for='CX_25_55-chkSigMask16']"))).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
     	
		Thread.sleep(5000);
		
		
		
		
		
		/*		driver.findElement(By.cssSelector("a#linkTab3")).click();  //open usersetup tab

		Thread.sleep(5000);

		WebElement usermode= driver.findElement(By.xpath("//select[@id='CX_25_55-mChnlRxUserModesSupported1-3']")); //to click on user mode
		Thread.sleep(5000);	
		Select dropdown = new Select(usermode); //to select usermode
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(0); //to change usermode to 100 from 200
		System.out.println(dropdown.getFirstSelectedOption().getText());		
		WebElement Frequency= driver.findElement(By.id("CX_25_55-mChnlRxUserMode1-3"));
		Select dropdown1 = new Select(Frequency);
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		dropdown1.selectByIndex(2);
		System.out.println(dropdown1.getFirstSelectedOption().getText());
	*/
		
	/*	Assert.assertFalse(driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).isSelected());		 //stops code if checkbox is Enabled. Assertions concept
		driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).isSelected());		
		Assert.assertTrue(driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).isSelected());
	*/	
		
		
		driver.findElement(By.id("btnApplyAll")).click();  //apply
		Thread.sleep(40000);		
		driver.findElement(By.xpath("//span[@class='short-user']")).click();
		driver.findElement(By.cssSelector("*[href='/logout\']")).click();  //logout
 
	}

}
