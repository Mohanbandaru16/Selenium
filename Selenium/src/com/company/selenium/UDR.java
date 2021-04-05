package com.company.selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UDR {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[normalize-space()='Status']")).click();
		driver.findElement(By.id("CX_22_20_3-mChnlRxChnl1ResetErrCount")).click();
		
		
	}

}
