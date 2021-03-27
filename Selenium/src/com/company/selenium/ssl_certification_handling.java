package com.company.selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ssl_certification_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Desired capabilities=
		//general chrome options
		DesiredCapabilities ds= DesiredCapabilities.chrome();
		//ds.acceptInsecureCerts();
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Belongs to oue local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ds);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://10.100.97.64/");
		
	}

}
