import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FF_OS {

		public static void main(String[] args)  throws InterruptedException
		{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_FFOX\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://192.168.1.150/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("admin");
			driver.findElement(By.xpath("//button[@id='btnLogin']")).click(); 
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[text()='CX-48 CX3002 VNC-62,COM8 [10.100.97.48]']")).click(); //to click on cx48
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"chassis_img22\"]")).click(); //to open slot 25
			Thread.sleep(20000);
			//driver.findElement(By.xpath("//a[contains(@id,'linkTab2')]")).click(); //to click alarms tab
			driver.findElement(By.xpath("//a[@id='linkTab2']")).click();  //to click alarms tab			
			Thread.sleep(20000);
			//driver.findElement(By.cssSelector("a.nav-link")).click(); //to minimize tree
	     	//driver.close();	
			
	     	//dropdown with select tag
	     	WebElement staticDropdown =driver.findElement(By.id("CX_22_34-ddlSigSeverity0"));
	     	//WebElement staticDropdown =driver.findElement(By.xpath("//*[@id=\"CX_22_34-ddlSigSeverity0\"]"));
	     	Select dropdown =new Select(staticDropdown);
	     	dropdown.selectByIndex(1);
	     	//dropdown.selectByVisibleText("Minor");
	     	System.out.println(dropdown.getFirstSelectedOption().getText());   // to print Drop down option
	     	//driver.findElement(By.xpath("//*[@id=\"btnApplyAll\"]")).click();  // to click apply
	     	driver.findElement(By.id("btnApplyAll")).click();  // to click apply
	     	

		}

	

	}


