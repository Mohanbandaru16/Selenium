import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class QDR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		//driver.findElement(By.cssSelector("#chassis_img25")).click();
		driver.findElement(By.id("chassis_img25")).click();  //open slot 25
		Thread.sleep(30000);
		driver.findElement(By.xpath("//a[normalize-space()='User Setup']")).click();  //open usersetup tab
		Thread.sleep(5000);
//		WebElement usermode= driver.findElement(By.id("CX_25_55-mChnlRxUserModesSupported1-3")); //to click on user mode
		WebElement usermode= driver.findElement(By.xpath("//select[@id='CX_25_55-mChnlRxUserModesSupported1-3']"));
		Thread.sleep(5000);
	/*	Select dropdown = new Select(usermode); //to select usermode
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(0); //to change usermode to 100 from 200
		System.out.println(dropdown.getFirstSelectedOption().getText());		
		WebElement Frequency= driver.findElement(By.id("CX_25_55-mChnlRxUserMode1-3"));
		Select dropdown1 = new Select(Frequency);
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		dropdown1.selectByIndex(2);
		System.out.println(dropdown1.getFirstSelectedOption().getText());
	*/	
		driver.findElement(By.xpath("//a[normalize-space()='Alarms']")).click();  //open alarms tab
		System.out.println(driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).isSelected());
		
	/*	Assert.assertFalse(driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).isSelected());		 //stops code if checkbox is Enabled.
		driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).isSelected());		
		Assert.assertTrue(driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).isSelected());
	*/	
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.cssSelector("label[for='CX_25_55-chkSigMask7']")).click();
		driver.findElement(By.id("btnApplyAll")).click();
		Thread.sleep(40000);
		driver.findElement(By.className("short-user")).click();
		driver.findElement(By.cssSelector("*[href='/logout\']")).click();
	//	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	//	driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[7]/div/ul/li[4]/a")).click();   //logout
	}

}
