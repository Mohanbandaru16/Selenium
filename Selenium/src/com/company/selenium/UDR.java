package com.company.selenium;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UDR {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_FFOX\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://192.168.1.150");
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//span[@title='Slot 32, CX3002 [10.100.97.47]']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("chassis_img22")).click();
		Thread.sleep(18000);
		driver.findElement(By.xpath("//a[normalize-space()='Status']")).click();
		driver.findElement(By.id("CX_22_20_3-mChnlRxChnl1ResetErrCount")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Alarms']")).click();
	//will take screenshot before changing data	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\DELL\\Desktop\\New folder\\screenshot.png"));
	//Alarms 	
		Actions a = new Actions(driver);
		WebElement Alarms = driver.findElement(By.xpath("//div[@id='CX_22_20_3-rowIndex7']//div[@class='center']"));
	//	a.moveToElement(Alarms).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(Alarms).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("btnApplyAll")).click();
		Thread.sleep(15000);
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("C:\\Users\\DELL\\Desktop\\New folder\\screenshot1.png"));
	//usersetup tab			
		driver.findElement(By.xpath("//a[normalize-space()='User Setup']")).click();
		WebElement usermode = driver.findElement(By.xpath("//select[@id='CX_22_20_3-mChnlRxUserModesSupported1-3']"));
		Select dropdown = new Select(usermode);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(1);
		WebElement frequency = driver.findElement(By.xpath("//select[@id='CX_22_20_3-mChnlRxUserMode1-3']"));
		Select dropdown1 = new Select(frequency);
		dropdown1.selectByIndex(1);	
		
		//driver.findElement(By.id("CX_22_20_3-mChnlRxChnlAttenuationValue1-3")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.cssSelector("a[title='Tools']")).click();
		driver.findElement(By.linkText("Web Files Update Tool")).click();
		
		
	}

}
