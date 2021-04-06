package com.company.selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Alarms']")).click();
	//Alarms 	
		Actions a = new Actions(driver);
		WebElement Alarms = driver.findElement(By.xpath("//div[@id='CX_22_20_3-rowIndex7']//div[@class='center']"));
		a.moveToElement(Alarms).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("btnApplyAll")).click();
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
		a.moveToElement(driver.findElement(By.id("CX_22_20_3-mChnlRxChnlAttenuationValue1-3"))).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		
	}

}
