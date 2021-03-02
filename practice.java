import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,5);
		String[] items={"Cucumber","Brocolli","Beetroot"};  //array is declared to make list of products that are needed to add in cart
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	addItems(driver,items);
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
	w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input.promoCode")));  //explicit wait
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	
	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	

	}

	
	
	
	
public static void addItems(WebDriver driver,String[] items)
{
	int j=0;
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	for(int i=0;i<products.size();i++)
	{	
		
		String[] name=products.get(i).getText().split("-");  //to split -1kg text
		String formattedName=name[0].trim();     //to trim spaces 
		//format to actual vegetable name Brocolli - 1kg remove - 1kg (use split)
		//convert array to array list	
	//check whether name you extracted is present in array or not	
	
		List itemsList = Arrays.asList(items); 
		
		if(itemsList.contains(formattedName))
		{
			//click on add to cart
		//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==items.length)  //get the item length and breaks the loop
			{ break;
}

}
}
}

}





