package com.company.selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class otsweb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i=0,n=500;     //USING FOR LOOP
		for (i=0;i<n;i++)
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_FFOX\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();	
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
			//WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try {
			driver.get("http:admin:admin@10.100.97.40/index.ssi");		
			Thread.sleep(80);
			driver.quit();
			System.out.println(i+1);
			continue;
			}
			catch (Exception e) {
				test(i+1);
			}
			
		}
		
		
	
	}
	public static void test(int i) throws InterruptedException {
		
		System.out.println("Web Reseted:"+String.valueOf(i));
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://192.168.1.22:98/setindividualdata?deviceid=95&setval=1");
			Thread.sleep(80000);
			driver.quit();
			
			
	}
}


	
/*	int numberofTimes = 0;				//USING WHILE LOOP
while (numberofTimes < 30) {
    numberofTimes += 1;
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_FFOX\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();				
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http:admin:admin@10.100.97.45/index.ssi");		
	Thread.sleep(80);
	driver.quit();
	System.out.println(numberofTimes);
}*/




