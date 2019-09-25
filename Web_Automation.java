package com.tuly.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Automation {

	
		WebDriver driver;
		
		// TODO Auto-generated method stub
		public void startBrowser() {
			try {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuly - Progoti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				
				driver.get("https://www.rechargewalla.com");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			Web_Automation sB= new Web_Automation();
			sB.startBrowser();

	}

}
